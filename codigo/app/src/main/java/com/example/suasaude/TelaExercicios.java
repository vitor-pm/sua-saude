package com.example.suasaude;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

public class TelaExercicios extends AppCompatActivity {


    private ImageView botaoEmcasa;
    private ImageView botaoaoarlivre;
    private ImageView voltar;
    private ImageView yoga;
    private ImageView academia;
    private ImageView artes_marciais;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_exercicios);

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);


        botaoaoarlivre = (ImageView) findViewById(R.id.icone_ao_ar_livre);
        botaoaoarlivre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View emcasa) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=DOe7Gz1JzEQ")));
            }
        });

        botaoEmcasa = (ImageView) findViewById(R.id.icone_em_casa);
        botaoEmcasa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View emcasa) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=8UaguGuEQWg")));
            }
        });

        yoga = (ImageView) findViewById(R.id.yoga);
        yoga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View yoga) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=9njqH_n9nfA&list=PLnXTMjA8X5lc3s-cdY4ya_zaXT8tTjEDa")));
            }
        });

        academia = (ImageView) findViewById(R.id.academia);
        academia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View academia) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=I_x5V2ZQ1UI")));
            }
        });

        artes_marciais = (ImageView) findViewById(R.id.artes_marciais);
        artes_marciais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View artes_marciais) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=fqTcM2D3xmw&list=PL5aHGuLSEu-_0JKsZq13YH4yTURTlczfs")));
            }
        });

        IniciarComponentes();

        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View left) {

                Intent intent = new Intent(TelaExercicios.this,dashboard.class);
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