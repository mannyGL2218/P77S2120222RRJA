package tesoem.edu.mx.p77s2120222rrja;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class principal extends AppCompatActivity {

    Handler manejador = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        manejador.postDelayed(autocambiar,4000);
    }
    Runnable autocambiar = new Runnable() {
        @Override
        public void run() {
            Intent portada = new Intent(principal.this, menuactivity.class);
            startActivity(portada);
            finish();
        }
    };
}