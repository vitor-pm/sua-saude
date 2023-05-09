package com.example.suasaude;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

public class psicologa extends AppCompatActivity {

    private ImageView Linkedln;
    private ImageView whats;
    private TextView enviarmensagem;
    private ImageView insta;
    private ImageView voltar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_psicologa);

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Linkedln = (ImageView) findViewById(R.id.Linkedln);
        Linkedln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View Linkedln) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/deboraps/")));
            }
        });
        whats = (ImageView) findViewById(R.id.whats);
        whats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View whats) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://wa.me/982263150")));
            }
        });

        enviarmensagem = (TextView) findViewById(R.id.enviarmensagem);
        enviarmensagem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View enviarmensagem) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://wa.me/982263150")));
            }
        });

        insta = (ImageView) findViewById(R.id.insta);
        insta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View insta) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/deboraemateus/")));
            }
        });
        IniciarComponentes();

        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View left) {

                Intent intent = new Intent(psicologa.this,dashboard.class);
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

