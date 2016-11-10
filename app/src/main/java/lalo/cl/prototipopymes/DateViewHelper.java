package lalo.cl.prototipopymes;

import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateViewHelper {
    static void setDate(AppCompatActivity activity, int id) {
        TextView dateView = (TextView) activity.findViewById(id);
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.MONTH, -1);
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        String formattedDate = format.format(cal.getTime());
        dateView.setText("Respecto al " + formattedDate);
    }
}
