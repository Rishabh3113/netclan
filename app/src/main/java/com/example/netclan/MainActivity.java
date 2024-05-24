package com.example.netclan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ArrayList<model> modelArrayList;
    adapter adapter;
    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

      recyclerView=findViewById(R.id.recycler);
      modelArrayList=new ArrayList<>();

      modelArrayList.add(new model("INDIVIDUAL","Join and build real time community",R.drawable.baseline_person_24,R.drawable.baseline_arrow_forward_24));
      modelArrayList.add(new model("PROFESSIONAL","World's largest  real time  services community",R.drawable.baseline_person_24,R.drawable.baseline_arrow_forward_24));
      modelArrayList.add(new model("MERCHANT","World's largest real time merchant's community ",R.drawable.baseline_person_24,R.drawable.baseline_arrow_forward_24));

       adapter=new adapter(this,modelArrayList);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }











    }
