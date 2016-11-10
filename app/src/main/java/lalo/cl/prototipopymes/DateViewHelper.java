package lalo.cl.prototipopymes;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateViewHelper {
    static void setDate(View v, int id) {
        set((TextView) v.findViewById(id));

    }
    static void setDate(AppCompatActivity a, int id){
        set((TextView) a.findViewById(id));
    }

    static void set(TextView tv){
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.MONTH, -1);
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        String formattedDate = format.format(cal.getTime());
        tv.setText("Respecto al " + formattedDate);
    }
}
