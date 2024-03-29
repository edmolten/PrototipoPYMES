package lalo.cl.prototipopymes;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class InternosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_internos);
    }

    public void goToVentasTotales(View v) {
        startActivity(new Intent(this, VentasActivity.class));
    }

    public void goToVentasPorLineaDeProductos(View v) {
        startActivity(new Intent(this, VentaLineaProducto.class));
    }

    public void goToRentabilidadNegocio(View v) {
        startActivity(new Intent(this, RentabilidadActivity.class));
    }

}
