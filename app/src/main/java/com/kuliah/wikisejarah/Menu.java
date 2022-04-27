package com.kuliah.wikisejarah;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class Menu extends Fragment implements View.OnClickListener {

    Button timeline, tokoh, wiki, latar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_menu, container, false);
    }
    @Override

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        timeline = view.findViewById(R.id.btn_timeline);
        tokoh = view.findViewById(R.id.btn_tokoh);
        wiki = view.findViewById(R.id.btn_wiki);
        latar = view.findViewById(R.id.btn_latar);

        timeline.setOnClickListener(this::onClick);
        tokoh.setOnClickListener(this::onClick);
        wiki.setOnClickListener(this::onClick);
        latar.setOnClickListener(this::onClick);
    }
    @Override
    public void onClick(View view) {
        String tok[] = getActivity().getIntent().getStringArrayExtra("tokoh");
        String tokD[] = getActivity().getIntent().getStringArrayExtra("tokohDetail");

        if(view.getId() == R.id.btn_timeline){

            System.out.println("Timeline");

        }if(view.getId() == R.id.btn_tokoh){

            Intent i = new Intent(getActivity(), TokohActivity.class);
            i.putExtra("tokoh", tok);
            i.putExtra("tokohDetail", tokD);
            startActivity(i);

        }if(view.getId() == R.id.btn_wiki){

            System.out.println("Wiki");

        }if(view.getId() == R.id.btn_latar){

            System.out.println("Latar");

        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

}