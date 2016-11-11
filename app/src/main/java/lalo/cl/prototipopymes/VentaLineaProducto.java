package lalo.cl.prototipopymes;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class VentaLineaProducto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_venta_linea_producto);
        DateViewHelper.setDate(this, R.id.date1);
        DateViewHelper.setDate(this, R.id.date2);
        DateViewHelper.setDate(this, R.id.date3);
    }
}
