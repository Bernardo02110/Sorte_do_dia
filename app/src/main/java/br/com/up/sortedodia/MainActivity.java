package br.com.up.sortedodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView textViewtitle;
    private Button buttonAction;

    private ArrayList<String> messages = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        messages.add("A vida trará coisas boas se tiver paciência.");
        messages.add("Não compense na ira o que lhe falta na razão.");
        messages.add("Não há que ser forte. Há que ser flexível.");
        messages.add("Siga os bons e aprenda com eles.");
        messages.add("Nós somos o que pensamos.");
        messages.add("Deixe de lado as preocupações e seja feliz.");
        messages.add("O nosso primeiro e último amor é… o amor-próprio.");
        messages.add("Você é do tamanho do seu sonho.");
        messages.add("O amor está sempre mais próximo do que você imagina.");
        messages.add("Se você se sente só é porque construiu muros ao invés de pontes.");
        messages.add("Espere pelo mais sábio dos conselhos: o tempo.");
        messages.add("Acredite em milagres, mas não dependa deles.");
        messages.add("Você sempre será a sua melhor companhia!");
        messages.add("A inspiração vem dos outros. A motivação vem de dentro de nós.");
        messages.add("A solidão é a sorte de todos os espíritos excepcionais.");


        textViewtitle = findViewById(R.id.textView_title);
        buttonAction = findViewById(R.id.button_Action);


        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int position = new Random().nextInt(messages.size());

                String message = messages.get(position);

                textViewtitle.setText(message);
            }
        };

        buttonAction.setOnClickListener(listener);
    }
}