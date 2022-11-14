package com.example.gerenciadordesenha;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button btmSenha;
    private TextView painelSenha;
    private String[] lista;
    private String[] caracter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btmSenha = findViewById(R.id.btmSenha);
        painelSenha = findViewById(R.id.painelSenha);
        lista = new String[]{
                "a", "A", "b", "b", "c","C", "D", "d",
                "E", "e", "f", "F", "g", "G", "h", "H", "i",
                "I", "k", "k", "L", "l", "m", "M", "O", "o",
                "p", "P", "n", "N", "Q", "q", "r", "R", "S",
                "s", "T", "t", "U", "u", "V", "v", "x", "X",
                "W", "w", "y", "Y", "Z", "z"
        };
        caracter = new String[]{
                "@", "#", "$", "%", "&", "_", "(", ")", ";"
        };


        btmSenha.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                Random radom = new Random();
                Random radom2 = new Random();
                Random radom3 = new Random();


                int senha = radom.nextInt(10) + 1;
                int number = radom2.nextInt(10)+1;
                int radom3 = new Random.nextInt(10) +1;

                String caracteres = caracter[radom.nextInt(caracter.length) -1];
                String letra = lista[radom.nextInt(lista.length - 1)];
                painelSenha.setText(letra + caracteres + senha + number + radom3 +
                        letra + caracteres + number + letra + caracteres + number);
            }

        });
    }
}