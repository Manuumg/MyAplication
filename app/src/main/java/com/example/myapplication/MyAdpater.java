package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class MyAdpater extends RecyclerView.Adapter<MyAdpater.MyViewHolder> {

    private List<Animal> animals;
    private Context context;


    public MyAdpater(List<Animal> animals, Context context) {
        this.animals = animals;
        this.context = context;
    }

    @NonNull
    @Override
    public MyAdpater.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.my_row, parent, false);

        return new MyViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.textType2.setText(animals.get(position).getType());
        holder.textName2.setText(animals.get(position).getName());
        holder.textAge2.setText(animals.get(position).getAge());

        Picasso.get().load(animals.get(position).getUrlImage()).fit().centerCrop().into(holder.imageView2);
    }

    @Override
    public int getItemCount() {
        return  animals.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        private ImageView imageView2;
        private TextView textType2;
        private TextView textName2;
        private TextView textAge2;

    public MyViewHolder(@NonNull View itemView){
        //hook

        super(itemView);
        imageView2 = itemView.findViewById(R.id.imageView2);
        textType2 = itemView.findViewById(R.id.textType2);
        textName2 = itemView.findViewById(R.id.textName2);
        textAge2 = itemView.findViewById(R.id.textAge2);


    }

}
}
