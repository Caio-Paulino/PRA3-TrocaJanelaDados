package br.com.itb.roteiroandroidtrocajaneladados;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.snackbar.Snackbar;

public class Janela2Activity extends AppCompatActivity {

    // Declaração global
    AppCompatButton btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_janela2);

        // Receber os dados de outra janela
        Intent it = getIntent();
        String dadoRecebido = it.getStringExtra("dado1");

        // Vínculo do Java com xml
        btnVoltar = findViewById(R.id.btn_voltar);

        // Disparar mensagem com o dado
        Snackbar.make(btnVoltar, dadoRecebido.toString(), Snackbar.LENGTH_LONG).show();

        // Acionar botão para voltar
        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // acionado o clique
                Intent it = new Intent(Janela2Activity.this, MainActivity.class);
                // iniciar troca de janela
                startActivity(it);
            }
        });
    }
}