package tesoem.edu.mx.p77s2120222rrja;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class nativo extends AppCompatActivity {
    TextView tv_nombre, tv_edad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nativo);

        tv_nombre = findViewById(R.id.txt_nat_nombre);
        tv_edad = findViewById(R.id.txt_nat_edad);

        Bundle parametros = getIntent().getExtras();
        String nombre = parametros.getString("nombre");
        int edad = parametros.getInt("edad");

        tv_nombre.setText(nombre);
        tv_edad.setText(String.valueOf(edad).toString());
    }
    public void regreso(View view){
        Intent regreso = new Intent(this, menuactivity.class);
        startActivity(regreso);
    }
}