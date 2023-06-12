package com.example.suasaude;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

public class Nutricao2 extends AppCompatActivity {

    private ImageView insta;
    private ImageView whats;
    private TextView enviarmensagem;
    private ImageView Linkedln;
    private ImageView voltar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutricao2);

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        insta = (ImageView) findViewById(R.id.insta);
        insta.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View insta) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/annaju.b.nutri/")));
                }
            });
        whats = (ImageView) findViewById(R.id.whats);
        whats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View whats) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://wa.me/987260637")));
            }
        });

        enviarmensagem = (TextView) findViewById(R.id.enviarmensagem);
        enviarmensagem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View enviarmensagem) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://wa.me/987260637")));
            }
        });

        Linkedln = (ImageView) findViewById(R.id.Linkedln);
        Linkedln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View Linkedln) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/anna-julia-barbosa-18635b180/")));

            }
        });

        IniciarComponentes();

        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View left) {

                Intent intent = new Intent(Nutricao2.this,dashboard.class);
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

