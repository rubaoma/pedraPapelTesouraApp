package com.rubdev.pedrapapeloutesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecionadoPedra(View view){
        System.out.println("Selecionado pedra");
        this.opcaoSelecionada("pedra");
    }

    public void selecionadoPapel(View view){
        System.out.println("Selecionado papel");
        this.opcaoSelecionada("papel");
    }

    public void selecionadoTesoura(View view){
        System.out.println("Selecionado tesoura");
        this.opcaoSelecionada("tesoura");
    }

    public void opcaoSelecionada( String opcaoSelecionada){
        System.out.println("item selecionado: " + opcaoSelecionada);
    }


}
