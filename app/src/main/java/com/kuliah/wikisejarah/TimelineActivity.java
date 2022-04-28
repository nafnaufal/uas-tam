package com.kuliah.wikisejarah;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class TimelineActivity extends AppCompatActivity {
    String name[], detail[];
    RecyclerView rvtimeline;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timeline);
        rvtimeline = findViewById(R.id.rv_timeline);

        name = getIntent().getStringArrayExtra("timeline");
        detail = getIntent().getStringArrayExtra("timelineDetail");

        TokohAdapter tokohAdapter = new TokohAdapter(this, name, detail);
        rvtimeline.setAdapter(tokohAdapter);
        rvtimeline.setLayoutManager(new LinearLayoutManager(this));
    }
}