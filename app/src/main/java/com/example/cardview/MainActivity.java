package com.example.cardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.cardview.Adapter.PostagemAdapter;
import com.example.cardview.model.Postagem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerPostagem;
    private List<Postagem> postagens = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerPostagem = findViewById(R.id.recyclerView);

        // define layout
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerPostagem.setLayoutManager(layoutManager);

        this.prepararPostagens();
        // define adapter

        PostagemAdapter adapter = new PostagemAdapter(postagens);

        recyclerPostagem.setAdapter(adapter);
    }

    public void prepararPostagens(){

        Postagem p;

        p = new Postagem("Bruna Mussi", "#TBT MadKatayy!",R.drawable.bruna);
        this.postagens.add( p );

        p = new Postagem("Vania Mussi", "Meu bebê Tyson...",R.drawable.tyson);
        this.postagens.add( p );

        p = new Postagem("Guilherme Borges", "Os trêS mosqueteiros kkkj",R.drawable.gui);
        this.postagens.add( p );

        p = new Postagem("Harry Styles", "#TBT MadKatayy!",R.drawable.harry);
        this.postagens.add( p );
    }
}
