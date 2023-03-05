package com.example.ejercicio2;

public class MainActivity3 extends AppCompatActivity {

    private TextView nombre;
    private TextView nota;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        nombre = findViewById(R.id.nombre);
        nota = findViewById(R.id.nota);

        Intent intent = getIntent();
        String userName = intent.getStringExtra("USER_NAME");
        nombre.setText(userName);

        // Generar un número aleatorio entre 0.0 y 5.0
        double randomNum = Math.random() * 5.0;
        nota.setText(String.format("%.1f", randomNum)); // Formatear el número con un decimal
    }
}