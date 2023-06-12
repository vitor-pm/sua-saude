package com.example.suasaude;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

public class TelaReceitas extends AppCompatActivity {

    private ImageView botaosalada;
    private ImageView botaosucos;
    private ImageView botaoproteinas;
    private ImageView botaocarboidratos;
    private ImageView botaofrutas;
    private ImageView botaosopas;
    private ImageView botaosobremesas;
    private ImageView botaochas;
    private ImageView voltar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_receitas);

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        botaosalada = (ImageView) findViewById(R.id.icone_salada);
        botaosalada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View sucos) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tudoreceitas.com/receitas-de-saladas-saudaveis-2454/")));
            }
        });

        botaosucos = (ImageView) findViewById(R.id.icone_sucos);
        botaosucos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View sucos) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tudoreceitas.com/pesquisa?q=sucos+saud%C3%A1veis")));
            }
        });

        botaoproteinas = (ImageView) findViewById(R.id.icone_proteinas);
        botaoproteinas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View proteinas) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tudoreceitas.com/pesquisa?q=Prote%C3%ADnas")));
            }
        });

        botaocarboidratos = (ImageView) findViewById(R.id.icone_carboidratos);
        botaocarboidratos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View carboidratos) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tudoreceitas.com/pesquisa?q=carboidratos")));
            }
        });

        botaofrutas = (ImageView) findViewById(R.id.icone_frutas);
        botaofrutas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View frutas) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tudoreceitas.com/pesquisa?q=frutas")));
            }
        });

        botaosopas = (ImageView) findViewById(R.id.icone_sopas);
        botaosopas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View sopas) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tudoreceitas.com/pesquisa?q=sopas+saud%C3%A1veis")));
            }
        });

        botaosobremesas = (ImageView) findViewById(R.id.icone_sobremesas);
        botaosobremesas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View sobremesas) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tudoreceitas.com/pesquisa?q=sobremesas+saud%C3%A1veis")));
            }
        });

        botaochas = (ImageView) findViewById(R.id.icone_chas);
        botaochas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View chas) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tudoreceitas.com/pesquisa?q=ch%C3%A1")));
            }
        });
        IniciarComponentes();

        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View left) {

                Intent intent = new Intent(TelaReceitas.this,dashboard.class);
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