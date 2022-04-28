package com.kuliah.wikisejarah;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Menu extends Fragment{
    GridView gv;
    String[] list = {"Timeline", "Tokoh", "Wiki"};
    int[] img = {R.drawable.ic_icon_timeline, R.drawable.ic_icon_tokoh, R.drawable.ic_icon_wiki};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_menu,container,false);
        // Inflate the layout for this fragment
        MenuAdapter gridAdapter = new MenuAdapter(getActivity().getApplicationContext(), list, img);
        gv = rootView.findViewById(R.id.gridView);
        gv.setAdapter(gridAdapter);

        String tok[] = getActivity().getIntent().getStringArrayExtra("tokoh");
        String tokD[] = getActivity().getIntent().getStringArrayExtra("tokohDetail");
        String tl[] = getActivity().getIntent().getStringArrayExtra("timeline");
        String tlD[] = getActivity().getIntent().getStringArrayExtra("timelineDetail");

        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(list[i].equals("Timeline")){
                    Intent intent = new Intent(getActivity(), TimelineActivity.class);
                    intent.putExtra("timeline", tl);
                    intent.putExtra("timelineDetail", tlD);
                    startActivity(intent);
                }
                if(list[i].equals("Tokoh")){
                    Intent intent = new Intent(getActivity(), TokohActivity.class);
                    intent.putExtra("tokoh", tok);
                    intent.putExtra("tokohDetail", tokD);
                    startActivity(intent);
                }
                if(list[i].equals("Wiki")){
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/jIU0-TrHGC8"));
                    startActivity(intent);
                }
            }
        });
        return rootView;
    }
}