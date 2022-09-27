package tesoem.edu.mx.p77s2120222rrja;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class menuactivity extends AppCompatActivity {

    String nombre = "Nombre";
    int edad = 0;

    EditText name, age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuactivity);
        name = findViewById(R.id.txt_name);
        age = findViewById(R.id.txt_age);
    }
    public void nativo(View view){
        Intent nativo = new Intent(this, nativo.class);

        if(name.getText().toString().isEmpty() || age.getText().toString().isEmpty()){
            Toast.makeText(this,"llena los campos", Toast.LENGTH_SHORT).show();
        } else {
            nombre = name.getText().toString();
            edad = Integer.parseInt(String.valueOf(age.getText().toString()));

            nativo.putExtra("nombre", nombre);
            nativo.putExtra("edad", edad);
            startActivity(nativo);
        }
    }
    public void objeto(View view){
        Datos datost = new Datos(nombre, edad);
        Datos datos = new Datos();

        if(name.getText().toString().isEmpty() || age.getText().toString().isEmpty()){
            Toast.makeText(this,"llena los campos", Toast.LENGTH_SHORT).show();
        } else {
            nombre = name.getText().toString();
            edad = Integer.parseInt(String.valueOf(age.getText().toString()));

            datost.setNombre(nombre);
            datost.setEdad(edad);

            Intent objeto = new Intent(this, objeto.class);
            objeto.putExtra("datosp", datost);
            startActivity(objeto);
        }
    }
}