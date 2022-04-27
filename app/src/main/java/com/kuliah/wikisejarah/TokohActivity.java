package com.kuliah.wikisejarah;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class TokohActivity extends AppCompatActivity {
    String name[], detail[];
    RecyclerView rvtokoh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tokoh);

        rvtokoh = findViewById(R.id.rv_tokoh);

        name = getIntent().getStringArrayExtra("tokoh");
        detail = getIntent().getStringArrayExtra("tokohDetail");

        TokohAdapter tokohAdapter = new TokohAdapter(this, name, detail);
        rvtokoh.setAdapter(tokohAdapter);
        rvtokoh.setLayoutManager(new LinearLayoutManager(this));
    }
}