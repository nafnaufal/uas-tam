package com.kuliah.wikisejarah;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class TokohAdapter extends RecyclerView.Adapter<TokohAdapter.TokohViewHolder> {

    String name[];
    int photo[];
    Context context;

    public TokohAdapter(Context ct, String name[], int photo[]){
        context = ct;
        this.name = name;
        this.photo = photo;
    }

    @NonNull
    @Override
    public TokohViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_row_tokoh, parent, false);
        return new TokohViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TokohViewHolder holder, int position) {
        holder.n.setText(name[position]);
        holder.p.setImageResource(photo[position]);
        System.out.println(photo[position]);
    }

    @Override
    public int getItemCount() {
        return name.length;
    }

    public class TokohViewHolder extends RecyclerView.ViewHolder {

        TextView n;
        ImageView p;

        public TokohViewHolder(@NonNull View itemView) {
            super(itemView);

            n = itemView.findViewById(R.id.tv_item_name);
            p = itemView.findViewById(R.id.iv_item_photo);
        }
    }
}
