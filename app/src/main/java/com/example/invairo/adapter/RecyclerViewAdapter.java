package com.example.invairo.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.invairo.DetailNewsActivity;
import com.example.invairo.R;
import com.example.invairo.model.ModelDataNews;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.viewHolder>{

    private final Context context;
    private final ArrayList<ModelDataNews> data;
    private final String category;

    public RecyclerViewAdapter(Context context, ArrayList<ModelDataNews> data, String cat){
        this.context = context;
        this.data = data;
        this.category = cat;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.news_list_item, parent, false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

        holder.img.setImageResource(data.get(position).getImg());
        holder.title.setText(data.get(position).getTitle());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, DetailNewsActivity.class);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class viewHolder extends RecyclerView.ViewHolder {

        ImageView img;
        TextView title;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.img_news);
            title = itemView.findViewById(R.id.title_news);
        }
    }
}
