package com.example.netclan;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class adapter extends RecyclerView.Adapter<adapter.viewholder> {

    Context context;
    ArrayList<model> arraylist;

    public adapter(Context context, ArrayList<model> arraylist) {
        this.context = context;
        this.arraylist = arraylist;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        return new viewholder(view);
    }

    @Override
    public int getItemCount() {

        return arraylist.size();
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {
        model model=arraylist.get(position);
        holder.head.setText(model.getHead());
        holder.arrow.setImageResource(model.getArrow());
        holder.lower.setText(model.getLower());
        holder.profile.setImageResource(model.getProfile());


        setanimation(holder.itemView,position);


        holder.arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(context,Explore.class);
                context.startActivity(intent);
            }
        });


    }

    public class viewholder extends RecyclerView.ViewHolder{

      ImageView profile,arrow;
      TextView head,lower;
      CardView cardView;

        public viewholder(@NonNull View itemView) {
            super(itemView);

            profile=itemView.findViewById(R.id.imageView1);
            arrow=itemView.findViewById(R.id.arrow);
            head=itemView.findViewById(R.id.hello);
            lower=itemView.findViewById(R.id.text);
            cardView=itemView.findViewById(R.id.cardview);
        }
    }
    private void setanimation(View animateview,int position){
        Animation slide= AnimationUtils.loadAnimation(context, android.R.anim.slide_in_left);
        animateview.startAnimation(slide);
    }
}
