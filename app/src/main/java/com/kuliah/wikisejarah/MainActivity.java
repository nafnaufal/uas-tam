package com.kuliah.wikisejarah;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvSejarah;
    private ArrayList<Sejarah> list = new ArrayList<>();

    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvSejarah = findViewById(R.id.rv_sejarah);
        rvSejarah.setHasFixedSize(true);

        list.addAll(SejarahData.getListData());
        showRecyclerCardView();
    }

    private void showRecyclerCardView(){
        rvSejarah.setLayoutManager(new LinearLayoutManager(this));
        CardViewSejarahAdapter cardViewHeroAdapter = new CardViewSejarahAdapter(list);
        rvSejarah.setAdapter(cardViewHeroAdapter);

        cardViewHeroAdapter.setOnItemClickCallback(new CardViewSejarahAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Sejarah data) {
                showSelectedSejarah(data);
            }
        });
    }

    private void showSelectedSejarah(Sejarah sejarah) {
        i = new Intent(MainActivity.this, MenuActivity.class);
        i.putExtra("photo", sejarah.getPhoto());
        i.putExtra("name", sejarah.getName());
        i.putExtra("detail", sejarah.getDetail());
        i.putExtra("tokoh", sejarah.getTokoh());
        i.putExtra("tokohDetail", sejarah.getTokohDdetail());
        startActivity(i);
        Toast.makeText(this, "Kamu memilih " + sejarah.getName(), Toast.LENGTH_SHORT).show();
    }
}