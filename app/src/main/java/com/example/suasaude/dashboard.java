package com.example.suasaude;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

public class dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Intent intent = getIntent();

        TextView nome = (TextView) findViewById(R.id.text_user);
        nome.setText(intent.getStringExtra("nome"));
    }

    public void telaIMC(View view){

        Intent imc = new Intent(this, TelaIMC.class);
        startActivity(imc);
    }

    public void TelaReceitas(View view){

        Intent receitas = new Intent(this, TelaReceitas.class);
        startActivity(receitas);
    }

    public void telaExercicios(View view){

        Intent exercicios = new Intent(this, TelaExercicios.class);
        startActivity(exercicios);
    }

    public void telaArtigos(View view){

        Intent artigos = new Intent(this, TelaArtigos.class);
        startActivity(artigos);

    }

    public void telaNutricionista(View view){

        Intent nutricionista = new Intent(this, Nutricao2.class);
        startActivity(nutricionista);

    }

    public void terapeuta(View view){

        Intent terapeuta = new Intent(this, psicologa.class);
        startActivity(terapeuta);

    }
    public void ciecs(View view){

        Intent ciecs_layout = new Intent(this, ciecs.class);
        startActivity(ciecs_layout);

    }
    public void conteudos_extras(View view){

        Intent conteudos_extras = new Intent(this, conteudos_extras.class);
        startActivity(conteudos_extras);

    }


}