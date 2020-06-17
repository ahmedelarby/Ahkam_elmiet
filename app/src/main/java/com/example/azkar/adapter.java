package com.example.azkar;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class adapter extends RecyclerView.Adapter<adapter.ViewHolder>{
List<String> list;
Context context;
Context context1;
AlertDialog dialog;
List<Integer> y;

    public adapter(List<String> list , Context context,List<Integer> y) {
        this.y = y;
        this.list = list;
        this.context= context;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = (LayoutInflater.from(parent.getContext())).inflate(R.layout.item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {


        holder.text_one.setText(list.get(position));
        holder.text_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Intent a = new Intent(context,three.class);
                    a.putExtra("data1",y.get(position));
                    context.startActivity(a);


            }
        });




    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView  text_one;
        View perantview;
        ViewHolder(View view){
            super(view);
        text_one= view.findViewById(R.id.word);
            perantview = view;
        }

}











}
