package com.example.netclan;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class individual extends Fragment {
    ArrayList<model2> arrayList;


    adapter2 adapter2;
    private RecyclerView recyclerView3;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_individual,null);
        recyclerView3=view.findViewById(R.id.individualrecyler);
        arrayList=new ArrayList<>();

        arrayList.add(new model2("RISHABH","Amritsar within 2 km","Friendship||DATING","HEY! i am Rishabh",R.drawable.baseline_person_24));
        arrayList.add(new model2("SAHIL KUMAR","CHANDIGARH  within 2 km","Friendship||DATING|| Tech","HEY! i am sahil",R.drawable.baseline_person_24));
        arrayList.add(new model2("NAINA","jalandhar within 1 km","Freindship||DATING","HEY! i am naina",R.drawable.baseline_person_24));
        arrayList.add(new model2("Sukhman","Amritsar Cantt within 1 km","Freindship||DATING","HEY! i am sukhman",R.drawable.baseline_person_24));
        arrayList.add(new model2("sexo","Jaipur within 5 km","Freindship||DATING","HEY! i am sexo",R.drawable.baseline_person_24));
        arrayList.add(new model2("Dhruv","Amritsar within 3 km","Freindship||DATING","HEY! i am dhruv",R.drawable.baseline_person_24));


        adapter2=new adapter2(getContext(),arrayList);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);

        recyclerView3.setLayoutManager(layoutManager);
        recyclerView3.setAdapter(adapter2);


        return view;

    }


}