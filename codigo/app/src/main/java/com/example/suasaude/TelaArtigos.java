package com.example.suasaude;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class TelaArtigos extends AppCompatActivity {


    private ImageView botaoobesidade;
    private ImageView botaohomeoffice;
    private ImageView botaobelezaesaude;
    private ImageView voltar;
    private CardView obesidade;
    private CardView hb_saudaveis;
    private CardView beleza_saude;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_artigos);

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);


        botaoobesidade = (ImageView) findViewById(R.id.icone_obesidade);
        botaoobesidade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View obesidade) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.scielo.br/j/rbepid/a/ZqgTbxFkLrQByhDq5Z5tXcG/?lang=pt")));
            }
        });


        botaohomeoffice = (ImageView) findViewById(R.id.icone_homeoffice);
        botaohomeoffice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View homeoffice) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.vidanatural.org.br/home-office-saudavel/")));
            }
        });

        botaobelezaesaude = (ImageView) findViewById(R.id.icone_belezaesaude);
        botaobelezaesaude.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View belezaesaude) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.scielo.br/j/icse/a/bRhg3sPzPVTZZ4Wpvp53wmj/?lang=pt")));
            }
        });
        IniciarComponentes();

        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View left) {

                Intent intent = new Intent(TelaArtigos.this,dashboard.class);
                startActivity(intent);

            }
        });
        obesidade = (CardView) findViewById(R.id.obesidade);
        obesidade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View obesidade) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.scielo.br/j/rbepid/a/ZqgTbxFkLrQByhDq5Z5tXcG/?lang=pt")));
            }
        });

        hb_saudaveis = (CardView) findViewById(R.id.hb_saudaveis);
        hb_saudaveis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View hb_saudaveis) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.vidanatural.org.br/home-office-saudavel/")));
            }
        });
        beleza_saude = (CardView) findViewById(R.id.beleza_saude);
        beleza_saude.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View beleza_saude) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.scielo.br/j/icse/a/bRhg3sPzPVTZZ4Wpvp53wmj/?lang=pt")));
            }
        });
    }

    private void IniciarComponentes(){
        voltar = findViewById(R.id.voltar);

    } public void dashboard(View view){

        Intent home = new Intent(this, dashboard.class);
        startActivity(home);



    }
}