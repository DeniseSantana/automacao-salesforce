package br.com.salesforce.test.utils;

import lombok.Builder;

@Builder
public class Helper {

    public  String inserindoEmailESenha() {

//        Usuario usuario = new Usuario();
        String email = "denise.cristiane.silva@gmail.com.test";
        String senha = "Denise123";

        return email + senha;
    }
}

