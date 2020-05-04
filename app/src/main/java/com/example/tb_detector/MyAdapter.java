package com.example.tb_detector;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    Context context;
    ArrayList<Upload> upload;

    public MyAdapter(Context c, ArrayList<Upload> u){
        this.context = c;
        this.upload = u;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
         return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.cardview,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Upload current = upload.get(position);
        holder.location.setText(upload.get(position).getLocation());
        holder.result.setText(upload.get(position).getResult());
        Picasso.get().load(current.getImageURL()).placeholder(R.mipmap.ic_launcher).fit().centerCrop().into(holder.imageURL);
    }

    @Override
    public int getItemCount() {
        return upload.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        TextView location,result;
        ImageView imageURL;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            location = itemView.findViewById(R.id.location);
            result = itemView.findViewById(R.id.result);
            imageURL = itemView.findViewById(R.id.imageURL);
        }
    }

}
