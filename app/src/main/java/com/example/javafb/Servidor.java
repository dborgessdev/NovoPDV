package com.example.javafb;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Servidor {
    private DatabaseReference usuarios;
    private Usuario usuario;

    public Servidor() {
        usuarios = FirebaseDatabase.getInstance().getReference("Usuario");
    }
    public void cadastarUsuario(String nome, String login, String senha){
        usuario = new Usuario(nome,login,senha);
        String newId = usuarios.push().getKey();
        usuario.setId(newId);
        usuarios.child(newId).setValue(usuario);
    }
}


