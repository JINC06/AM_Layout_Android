package mx.itson.app.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import mx.itson.app.R;

public class MainActivity extends AppCompatActivity {

    private EditText etCorreo;
    private EditText edContrasenia;
    private Button btnIniciar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        etCorreo = findViewById(R.id.etCorreo);
        edContrasenia = findViewById(R.id.edContrasenia);
        btnIniciar = findViewById(R.id.btnIniciar);

        btnIniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String correo = etCorreo.getText().toString();
                String saludo = "Hola " + correo;
                Toast.makeText(MainActivity.this, saludo, Toast.LENGTH_LONG).show();
            }
        });

        //EdgeToEdge.enable(this);
        /*ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });*/
    }
}