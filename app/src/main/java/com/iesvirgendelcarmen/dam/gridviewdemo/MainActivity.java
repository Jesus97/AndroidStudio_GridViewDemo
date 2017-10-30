package com.iesvirgendelcarmen.dam.gridviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Contacto> agenda;
    private ContactoAdapter adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        agenda = new ArrayList<Contacto>();
        mockAgenda();

        GridView miGridView = (GridView) findViewById(R.id.agenda);
        adaptador = new ContactoAdapter(this, agenda);
        miGridView.setAdapter(adaptador);

    }

    public void mockAgenda(){
        Contacto c;

        c = new Contacto("Luis", "Molina", R.drawable.huella);
        agenda.add(c);

        c = new Contacto("Luis", "Molina", R.drawable.huella);
        agenda.add(c);

        c = new Contacto("Luis", "Molina", R.drawable.huella);
        agenda.add(c);

        c = new Contacto("Luis", "Molina", R.drawable.huella);
        agenda.add(c);

        c = new Contacto("Luis", "Molina", R.drawable.huella);
        agenda.add(c);

        c = new Contacto("Luis", "Molina", R.drawable.huella);
        agenda.add(c);

        c = new Contacto("Luis", "Molina", R.drawable.huella);
        agenda.add(c);

        c = new Contacto("Luis", "Molina", R.drawable.huella);
        agenda.add(c);

        c = new Contacto("Luis", "Molina", R.drawable.huella);
        agenda.add(c);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int seleccionado = item.getItemId();
        switch (seleccionado){
            case R.id.formulario:
                Toast.makeText(this,"Vamonos pal formulario",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.lista:
                Toast.makeText(this,"Vamonos pa la lista",Toast.LENGTH_SHORT).show();
                return true;
            default:
                super.onOptionsItemSelected(item);


        }
        return true;
    }
}
