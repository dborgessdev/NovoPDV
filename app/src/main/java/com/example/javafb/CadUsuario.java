package com.example.javafb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CadUsuario extends AppCompatActivity {

    private Button bt_cadastrar;
    private EditText nome, login, senha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cad_usuario);
        inicializarComponentes();
        try {


            bt_cadastrar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Servidor servidor = new Servidor();
                    servidor.cadastarUsuario(nome.getText().toString(), login.getText().toString(), senha.getText().toString());

                }
            });

        }catch (Exception erro ){
            Log.d("cadastrar", "bt_cadastrar : " + erro);

        }
    }


    public void inicializarComponentes(){

        nome = findViewById(R.id.nome);
        login = findViewById(R.id.login);
        senha = findViewById(R.id.senha);
        bt_cadastrar = (Button) findViewById(R.id.cadastra);

    }
}