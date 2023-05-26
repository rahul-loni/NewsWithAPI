package com.example.news_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.news_app.Model.Headlines;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    MyAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RequestManager manager =new RequestManager(this);




        init();
    }
    public  void init(){

    }
    public void showNews(List<Headlines> list){
        RecyclerView recyclerView=findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(this,1))
        ;
        adapter=new MyAdapter(this,list,this);
        recyclerView.setAdapter(adapter);
    }
}