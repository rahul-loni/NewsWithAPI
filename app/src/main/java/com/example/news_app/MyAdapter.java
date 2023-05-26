package com.example.news_app;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.news_app.Model.Headlines;
import com.squareup.picasso.Picasso;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<CustomViewHolder> {
    private Context context;
    private List<Headlines> headlines;
    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CustomViewHolder
                (LayoutInflater.from(context)
                        .inflate(R.layout.list_data,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
             holder.txt_title.setText(headlines.get(position).getTitle());
             holder.txt_source.setText(headlines.get(position).getModel().getName());
             if (headlines.get(position).getUrlToImage()!=null){
                 Picasso.get().load(headlines.get(position).getUrlToImage()).into(holder.imageView);
             }
             holder.cardView.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {
                     Intent intent=new Intent(MyAdapter.this,DetailNews.class);
                     intent.putExtra("url",headlines.get(position).getUrl());
                     context.startActivity(intent);
                 }
             });
    }
    @Override
    public int getItemCount() {
        return headlines.size();
    }
}
