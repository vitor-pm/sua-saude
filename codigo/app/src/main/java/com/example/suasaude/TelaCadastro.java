package com.example.suasaude;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import suasaude.banco.Dao;
import suasaude.banco.DatabaseConf;
import suasaude.banco.UsuarioEntity;

public class TelaCadastro extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cadastro);

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Button btn = (Button) findViewById(R.id.btnLogin);
        EditText username = (EditText) findViewById((R.id.email));
        EditText password = (EditText) findViewById((R.id.senha));
        EditText nome = (EditText) findViewById(R.id.edit_nome);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Dao dao = Room.databaseBuilder(getApplicationContext(), DatabaseConf.class, "login.db")
                            .allowMainThreadQueries().build().getLoginDao();

                    dao.salvar(new UsuarioEntity(username.getText().toString(), password.getText().toString(),nome.getText().toString()));

                    Intent intent = new Intent(getApplicationContext(),TelaLogin.class);
                    startActivity(intent);

                }
                catch (Exception e){
                    CharSequence text = "Falha no Cadastro!";
                    int duration = Toast.LENGTH_SHORT;
                    Toast.makeText(TelaCadastro.this, text, duration).show();
                    e.printStackTrace();
                }
            }
        });

    }
}