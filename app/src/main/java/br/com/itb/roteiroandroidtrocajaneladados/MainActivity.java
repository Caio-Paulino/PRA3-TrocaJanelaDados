package br.com.itb.roteiroandroidtrocajaneladados;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.botao1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // efetuar troca de janela
                Intent it = new Intent(MainActivity.this, Janela2Activity.class);

                // Enviar informação
                it.putExtra("dado1", "Bom dia Dooley!");

                // acionar intent
                startActivity(it);
            }
        });
    }
}