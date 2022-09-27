package tesoem.edu.mx.p77s2120222rrja;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class objeto extends AppCompatActivity {
    TextView tv_nombre, tv_edad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_objeto);

        tv_nombre = findViewById(R.id.txt_obj_nombre);
        tv_edad = findViewById(R.id.txt_obj_edad);

        Datos datos = getIntent().getParcelableExtra("datosp");
        String nombre = datos.getNombre();
        int edad = datos.getEdad();

        tv_nombre.setText(nombre);
        tv_edad.setText(String.valueOf(edad).toString());
    }
    public void regresar(View view){
        Intent regreso = new Intent(this,menuactivity.class);
        startActivity(regreso);
    }
}