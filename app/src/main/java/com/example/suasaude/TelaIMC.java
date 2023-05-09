package com.example.suasaude;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class TelaIMC extends AppCompatActivity {

    private TextView textResultado;
    private EditText editPeso;
    private EditText editAltura;
    private ImageView voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_imc);

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        textResultado = findViewById(R.id.text_resultado);
        editPeso = findViewById(R.id.edit_peso);
        editAltura = findViewById(R.id.edit_altura);

        IniciarComponentes();

        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View left) {

                Intent intent = new Intent(TelaIMC.this,dashboard.class);
                startActivity(intent);
            }
        });
    }

    private void IniciarComponentes(){
        voltar = findViewById(R.id.voltar);

    } public void dashboard(View view){

        Intent home = new Intent(this, dashboard.class);
        startActivity(home);

    }

    public void calcularImc(View view){

        double peso = Double.parseDouble(editPeso.getText().toString());
        double altura = Double.parseDouble(editAltura.getText().toString());
        double resultado = peso / (altura * altura);

        if(resultado < 19){
            textResultado.setText("Abaixo do peso");

        }else if( resultado <= 19 || resultado < 25  ){
            textResultado.setText("Peso normal");

        }else if(resultado <= 25 || resultado < 30){
            textResultado.setText("Sobrepeso");

        } else if(resultado <= 30 || resultado < 40){
            textResultado.setText("Obesidade tipo I");

        } else if(resultado > 40){
            textResultado.setText("Obesidade tipo II");
    }
    }
}

