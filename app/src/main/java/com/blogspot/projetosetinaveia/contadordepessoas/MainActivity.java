package com.blogspot.projetosetinaveia.contadordepessoas;

//utilização de classes existentes
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
// Imports das classes
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

//extends => herança => Usar os métodos e atributos da superclasse
public class MainActivity extends AppCompatActivity {

    //Trazer comportamento para os 2 botões e o texto do App
    Button BotaoAdicionar, BotaoSubtrair;  //Criação do Objeto
    TextView TextoPessoas;
    //Variável iniciacilizada com Zero
    int intNumeroPessoas = 0;

    @Override //Sobrescreve o que tem na superclasse
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //set => escrita - get - leitura
        setContentView(R.layout.activity_main); //Primeiro método chamado, o mesmo chama a tela em activity_main
        //Daqui para baixo começa a CODIFICAÇÃO no Main activity

    //Classe R faz a ligação entre XML e o JAVA
    BotaoAdicionar = findViewById(R.id.btnAdicionar);
    BotaoSubtrair = findViewById(R.id.btnRetirar);
    TextoPessoas = findViewById(R.id.tvwPessoas);
    //Acima a referência do JAVA aos 3 elementos criados na Tela

    //Click dos Botões

        //Clique do botão adicionar
        BotaoAdicionar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intNumeroPessoas++;
                //Use a palavra sout para usar essa saída na Caixa "RUN" a cada clique no App
                System.out.println("O número de pessoas é "+ intNumeroPessoas);
                //Método para definir o texto num TextView
                TextoPessoas.setText("Pessoas: " + intNumeroPessoas);
            }
        });
//Clique do botão Subtrair
        BotaoSubtrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Desafio proposto pelo professor
                if (intNumeroPessoas <=0) {
                    System.out.println("O número de pessoas é "+ intNumeroPessoas);
                } else {
                    intNumeroPessoas--;
                    TextoPessoas.setText("Pessoas: " + intNumeroPessoas);
                    System.out.println("O número de pessoas é "+ intNumeroPessoas);
                }
              //  System.out.println("O número de pessoas é "+ intNumeroPessoas);
              //  TextoPessoas.setText("Pessoas: " + intNumeroPessoas);

            }
        });

    }
}