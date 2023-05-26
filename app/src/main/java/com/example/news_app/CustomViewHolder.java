package com.example.news_app;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class CustomViewHolder extends RecyclerView.ViewHolder {
    TextView txt_title,txt_source;
    ImageView imageView;
    CardView cardView;
    public CustomViewHolder(View inflate) {
        super(inflate);
        txt_title=inflate.findViewById(R.id.title);
        txt_source=inflate.findViewById(R.id.source);
        cardView=inflate.findViewById(R.id.card);
        imageView=inflate.findViewById(R.id.headlineImage);


    }
}
