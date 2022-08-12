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

        messages.add("Oi oi o i o i o i oi o i o i o i o i o");
        messages.add("Ola");
        messages.add("Nada");

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