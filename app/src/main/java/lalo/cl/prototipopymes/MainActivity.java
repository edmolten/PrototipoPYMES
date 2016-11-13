package lalo.cl.prototipopymes;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v4.app.TaskStackBuilder;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.NotificationCompat;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setItemIconTintList(null);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.interno) {
            startActivity(new Intent(this, InternosActivity.class));
        } else if (id == R.id.externo) {
            startActivity(new Intent(this, ExternosActivity.class));
        } else if (id == R.id.calendario) {
            startActivity(new Intent(this, CalendarioActivity.class));
        } else if (id == R.id.contactos) {
            startActivity(new Intent(this, GubernamentalesActivity.class));
        } else if (id == R.id.competencia) {
            startActivity(new Intent(this, CompetenciasActivity.class));
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void goToAlerts(View v) {
        startActivity(new Intent(this, AlertasProductosActivity.class));
    }

    public void goToCompromisos(View v) {
        startActivity(new Intent(this, Compromisos.class));
    }

    public void goToActualizaciones(View v) {
        startActivity(new Intent(this, Actualizaciones.class));
    }

    private void notificar(String titulo, String texto){
        NotificationCompat.Builder b = new NotificationCompat.Builder(this);
        b.setContentTitle(titulo).
                setSmallIcon(R.mipmap.ic_launcher).
                setLargeIcon(BitmapFactory.decodeResource(getResources(),R.mipmap.ic_launcher)).
                setContentText(texto).
                addAction(R.drawable.ic_clock,"Ver luego", null).
                addAction(R.drawable.ic_delete_black_24px,"Desechar",null);
        NotificationManager mNotificationManager =
                (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        mNotificationManager.notify(1, b.build());
    }
    public void generarAlerta(View v) {
        notificar("Alerta", "Ventas Bordado y Estampado - 10% respecto semana anterior");
    }

    public void generarCompromiso(View v) {
        notificar("Compromiso", "Cobrar Cosemar, mañana a las 14:00");
    }

    public void generarActualizacion(View v) {
        notificar("Actualización", "Recuerda llenar las ventas del mes pasado");
    }
}
