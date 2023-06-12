package com.example.suasaude;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import suasaude.banco.Dao;
import suasaude.banco.DatabaseConf;
import suasaude.banco.UsuarioEntity;

public class TelaLogin extends AppCompatActivity {

    private TextView text_tela_cadastro;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_login);

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        IniciarComponentes();

        text_tela_cadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(TelaLogin.this,TelaCadastro.class);
                startActivity(intent);

            }
        });

        login = findViewById(R.id.btnLogin);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Dao dao = Room.databaseBuilder(getApplicationContext(), DatabaseConf.class, "login.db")
                            .allowMainThreadQueries().build().getLoginDao();
                    int duration = Toast.LENGTH_SHORT;
                    CharSequence text;
                    EditText usuario = (EditText) findViewById(R.id.email);
                    EditText senha = (EditText) findViewById(R.id.senha);
                    UsuarioEntity logado = dao.login(usuario.getText().toString(), senha.getText().toString());


                    if (logado != null)
                    {
                        text = "Bem vindo "+ logado.getNome();
                        Intent intent = new Intent(TelaLogin.this,dashboard.class);

                        intent.putExtra("nome", logado.getNome());
                        Toast.makeText(TelaLogin.this, text, duration).show();
                        startActivity(intent);
                    }else{
                        text = "Usuário ou senha incorretos!";
                        Toast.makeText(TelaLogin.this, text, duration).show();
                    }
                }
                catch (Exception e)
                {
                    CharSequence text = "Falha no Login!";
                    int duration = Toast.LENGTH_SHORT;
                    Toast.makeText(TelaLogin.this, text, duration).show();
                    e.printStackTrace();
                }
            }
        });
    }

    private void IniciarComponentes(){
        text_tela_cadastro = findViewById(R.id.text_tela_cadastro);

    } public void dashboard(View view){

        Intent dashboard = new Intent(this, dashboard.class);
        startActivity(dashboard);
    }
}