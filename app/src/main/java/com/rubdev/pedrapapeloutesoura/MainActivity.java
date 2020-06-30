package com.rubdev.pedrapapeloutesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

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

    public void opcaoSelecionada( String escolhaUsuario){

        ImageView imagemResultado = findViewById(R.id.imageResultado);
        TextView textoResultado = findViewById(R.id.textResultado);
        //criar um numero randomico
        int numero = new Random().nextInt(3); //0 1 2 Randomico
        String[] opcoes = {"pedra", "papel", "tesoura"}; // array de opções
        String escolhaApp = opcoes[ numero ]; // recebe o numero aleatorio

        // de acordo com o numero escolhido pelo app irá aparecer a imagem correspodente na tela mostrando a escolha do app.
        switch ( escolhaApp ){
            case "pedra" :
                imagemResultado.setImageResource(R.drawable.pedra);
                break;
            case "papel" :
                imagemResultado.setImageResource(R.drawable.papel);
                break;
            case "tesoura" :
                imagemResultado.setImageResource(R.drawable.tesoura);
                break;
        }

        if (
                (escolhaApp == "pedra" && escolhaUsuario == "tesoura") ||
                (escolhaApp == "papel" && escolhaUsuario == "pedra") ||
                (escolhaApp == "tesoura" && escolhaUsuario == "papel")

        ){ // app ganhador

            textoResultado.setText("Você perdeu :( ");

        }else if (
                (escolhaUsuario == "pedra" && escolhaApp == "tesoura") ||
                (escolhaUsuario == "papel" && escolhaApp == "pedra") ||
                (escolhaUsuario == "tesoura" && escolhaApp == "papel")
        ){ // usuario ganhador

            textoResultado.setText("Você ganhou :) ");

        }else{

            textoResultado.setText("Empatamos ;) ");
        }

        System.out.println("Item clicado: " + escolhaApp );
    }


}
