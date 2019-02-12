package com.ramos.appservices;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonClicked(View view) {
        Intent intent = new Intent(MainActivity.this, MyService.class);
        intent.putExtra(MyService.MESSAGE,"Botón clickeado, este es un servicio");
        startService(intent);
    }

    public void buttonStopClicked(View view) {
        Intent intent = new Intent(MainActivity.this, MyService.class);
        stopService(intent);
    }
}
