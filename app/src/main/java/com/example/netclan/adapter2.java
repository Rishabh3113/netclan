package com.example.netclan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.progressindicator.LinearProgressIndicator;

import java.util.ArrayList;

public class adapter2 extends RecyclerView.Adapter<adapter2.viewholder2> {

    Context context;
    ArrayList<model2> model2s;

    public adapter2(Context context, ArrayList<model2> model2s) {
        this.context = context;
        this.model2s = model2s;
    }

    @NonNull
    @Override
    public viewholder2 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.fragitem,parent,false);
        return new viewholder2(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder2 holder, int position) {
        holder.name.setText(model2s.get(position).getName());
        holder.desc.setText(model2s.get(position).getDesc());
        holder.mode.setText(model2s.get(position).getMode());
        holder.loc.setText(model2s.get(position).getLocation());
        holder.imageView.setImageResource(model2s.get(position).getImageView());

    }

    @Override
    public int getItemCount() {
        return model2s.size();
    }

    public class viewholder2 extends RecyclerView.ViewHolder{

        TextView name,loc,mode,desc;
        ImageView imageView;
        CardView cardView;
        LinearProgressIndicator linearProgressIndicator;

        public viewholder2(@NonNull View itemView) {
            super(itemView);

            name=itemView.findViewById(R.id.name);
            loc=itemView.findViewById(R.id.loc);
            mode=itemView.findViewById(R.id.mode);
            desc=itemView.findViewById(R.id.desc);
            imageView=itemView.findViewById(R.id.image3);
            cardView=itemView.findViewById(R.id.card3);
            linearProgressIndicator=itemView.findViewById(R.id.bar);

        }
    }
}
