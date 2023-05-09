package com.example.suasaude;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class conteudos_extras extends AppCompatActivity {

    private LinearLayout nutricao;
    private LinearLayout lifesum;
    private LinearLayout desrotulando;
    private LinearLayout vida_saudavel;
    private LinearLayout conversa_comigo;
    private LinearLayout yazio;
    private LinearLayout desafios;
    private LinearLayout nootric;
    private ImageView nutricao2;
    private ImageView lifesum2;
    private ImageView desrotulando2;
    private ImageView vida_saudavel2;
    private ImageView conversa2;
    private ImageView yazio2;
    private ImageView desafios2;
    private ImageView nootric2;
    private ImageView voltar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conteudos_extras);

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        nutricao = (LinearLayout) findViewById(R.id.nutricao);
        nutricao.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View nutricao) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.lealapps.alimentese")));
            }
        });
        lifesum = (LinearLayout) findViewById(R.id.lifesum);
        lifesum .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View lifesum) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.sillens.shapeupclub ")));
            }
        });

        desrotulando = (LinearLayout) findViewById(R.id.desrotulando);
        desrotulando.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View desrotulando) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.desrotulando.app")));
            }
        });

        vida_saudavel = (LinearLayout) findViewById(R.id.vida_saudavel);
        vida_saudavel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View vida_saudavel) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=br.com.vidasaudavelapp")));

            }
        });
        conversa_comigo = (LinearLayout) findViewById(R.id.nutricionista);
        conversa_comigo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View conversa_comigo) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=br.com.conversacomigo")));
            }
        });

        yazio = (LinearLayout) findViewById(R.id.terapeuta);
        yazio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View yazio) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.yazio.android")));
            }
        });
        desafios = (LinearLayout) findViewById(R.id.ciecs);
        desafios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View desafios) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=loseweight.weightloss.workout.fitness")));
            }
        });

        nootric = (LinearLayout) findViewById(R.id.conteudos_extras);
        nootric .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View nootric) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.arcadiaseed.nootric")));
            }
        });
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);


        nutricao2 = (ImageView) findViewById(R.id.nutricao2);
        nutricao2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View nutricao2) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.lealapps.alimentese")));
            }
        });
        lifesum2 = (ImageView) findViewById(R.id.lifesum2);
        lifesum2 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View lifesum2) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.sillens.shapeupclub ")));
            }
        });

        desrotulando2 = (ImageView) findViewById(R.id.desrotulando2);
        desrotulando2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View desrotulando2) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.desrotulando.app")));
            }
        });

        vida_saudavel2 = (ImageView) findViewById(R.id.vida_saudavel2);
        vida_saudavel2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View vida_saudavel2) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=br.com.vidasaudavelapp")));

            }
        });
        conversa2 = (ImageView) findViewById(R.id.conversa2);
        conversa2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View conversa_comigo) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=br.com.conversacomigo")));
            }
        });

        yazio2 = (ImageView) findViewById(R.id.yazio2);
        yazio2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View yazio2) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.yazio.android")));
            }
        });
        desafios2 = (ImageView) findViewById(R.id.desafios2);
        desafios2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View desafios2) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=loseweight.weightloss.workout.fitness")));
            }
        });

        nootric2 = (ImageView) findViewById(R.id.nootric2 );
        nootric2 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View nootric2) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.arcadiaseed.nootric")));
            }
        });

        IniciarComponentes();

        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View left) {

                Intent intent = new Intent(conteudos_extras.this,dashboard.class);
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
}
