package lalo.cl.prototipopymes;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.Calendar;

public class DBHelper {
    private static final String DATABASE_NAME = "mycal.db";
    private static final String TABLE_NAME = "mainTable";
    private static final String KEY_ID = "_id";
    private final Context context;
    private toDoDBOpenHelper dbHelper;
    private SQLiteDatabase db;

    public DBHelper(Context _context) {
        context = _context;
        dbHelper = new toDoDBOpenHelper(context, DATABASE_NAME, null, 1);
    }

    public void open() throws SQLiteException {
        try {
            db = dbHelper.getWritableDatabase();
        } catch (SQLiteException e) {
            e.printStackTrace();
            db = dbHelper.getReadableDatabase();
        }
    }

    public Cursor queryDatabase() {
        String[] result_columns = new String[]{KEY_ID, "_dtstart", "_dtend", "_dtmodified", "_attendee",
                "_uid", "_dtcreated", "_dtstamp", "_desc", "_location", "_status", "_schoolid", "_summary", "_allday", "_contacto"};
        Cursor allRows = db.query(true, TABLE_NAME, result_columns, null, null, null,
                null, null, null);
        return allRows;
    }

    public Cursor queryRow(String where) {
        String[] result_columns = new String[]{KEY_ID, "_dtstart", "_dtend", "_dtmodified", "_attendee",
                "_uid", "_dtcreated", "_dtstamp", "_desc", "_location", "_status", "_summary", "_schoolid", "_allday", "_contacto"};
        Cursor allRows = db.query(true, TABLE_NAME, result_columns, where, null,
                null, null, "_dtstart", null);
        return allRows;
    }

    public long insert(ContentValues contentValues) {
        return db.insert(TABLE_NAME, null, contentValues);
    }

    public boolean update(ContentValues contentValues, String where) {
        return db.update(TABLE_NAME, contentValues, where, null) > 0;
    }

    public boolean remove(String where) {
        where = KEY_ID + "=" + where;
        return db.delete(TABLE_NAME, where, null) > 0;
    }

    public void close() {
        db.close();
    }

    private static class toDoDBOpenHelper extends SQLiteOpenHelper {

        private static final String DATABASE_CREATE = "create table if not exists " + TABLE_NAME + " " +
                "(" + KEY_ID + " integer primary key autoincrement, _dtstart integer not null, _dtend integer not null," +
                "_dtmodified integer, _uid text,_dtcreated integer,_dtstamp integer," +
                "_desc text,_location text,_status text,_schoolid text,_attendee text,_summary text,_allday boolean DEFAULT 0, _contacto text);";

        public toDoDBOpenHelper(Context context, String name,
                                CursorFactory factory, int version) {
            super(context, name, factory, version);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            db.execSQL(DATABASE_CREATE);
            String insertFormatString = "INSERT INTO " + TABLE_NAME + " (_dtstart, _dtend, _summary, _contacto) VALUES (%s, %s, %s, %s)";
            Calendar c = Calendar.getInstance();
            String[] insertQueries = new String[1];
            int day = 1000 * 60 * 60 * 24;
            insertQueries[0] = String.format(insertFormatString, c.getTimeInMillis() + 2 * day, c.getTimeInMillis() + 3 * day, "'test'", "'2723986'");
            db.execSQL(insertQueries[0]);
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            db.execSQL("DROP TABLE IF EXISTS " + DATABASE_NAME);
            onCreate(db);
        }
    }
}
