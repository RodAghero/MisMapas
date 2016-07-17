package mx.unam.mismapas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.actionBar);
        setSupportActionBar(toolbar);
        ((TextView) findViewById(R.id.tvTituloAppbar)).setText("Mapas");

    }

    public void irMapa01(View v) {
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }

    public void irMapa02(View v) {
        Intent intent2 = new Intent(this, MapsActivity02.class);
        startActivity(intent2);
    }

    public void irMapa03(View v) {
        Intent intent3 = new Intent(this, MapsActivity03.class);
        startActivity(intent3);
    }

    public void irMapa04(View v) {
        Intent intent4 = new Intent(this, MapsActivity04.class);
        startActivity(intent4);
    }

}
