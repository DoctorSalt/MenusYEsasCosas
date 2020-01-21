package es.studium.menusyesascosas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void ejecutar_Personas(){
        Intent i= new Intent(this, PersonasActivity.class);
        startActivity(i);
    }
    public void ejecutar_Bloc(){
        Intent i= new Intent(this, BlocNotasActivity.class);
        startActivity(i);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_principal,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int numeroSeleccionado = item.getItemId();
        if(numeroSeleccionado==R.id.ItemPrincipal_personas){
            ejecutar_Personas();
            return true;
        } else if(numeroSeleccionado==R.id.ItemPrincipal_blocDeNotas){
            ejecutar_Bloc();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
