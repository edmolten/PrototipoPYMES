package lalo.cl.prototipopymes;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class VentasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventas);
        DateViewHelper.setDate(this, R.id.date1);

    }
}
