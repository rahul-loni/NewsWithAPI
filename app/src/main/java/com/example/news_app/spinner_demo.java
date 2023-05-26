package com.example.news_app;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.recyclerview.widget.RecyclerView;

public class spinner_demo implements AdapterView.OnItemSelectedListener {
    String[] courses = { "C", "Data structures",
            "Interview prep", "Algorithms",
            "DSA with java", "OS" };

    Spinner spinner;
   protected void onCreate(Bundle savedInstanceState){
       super.onCreate(savedInstanceState);
       setContentView(R.layout.scroll);
       Spinner spinner=findViewbyId(R.id.coursesspinner);
       AdapterView.OnItemSelectedListener(this);

       ArrayAdapter adapter=new ArrayAdapter
               (this, android.R.layout.simple_expandable_list_item_1,courses);
       spinner.setAdapter(adapter);
   }
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
