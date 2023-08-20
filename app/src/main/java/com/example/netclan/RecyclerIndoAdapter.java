package com.example.netclan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class RecyclerIndoAdapter extends RecyclerView.Adapter<RecyclerIndoAdapter.ViewHolder> {
    Context context;
    ArrayList<IndoModel> list;
    RecyclerIndoAdapter(Context context,ArrayList<IndoModel> list){
        this.context=context;
        this.list=list;
    }
    public void setFilteredData(ArrayList<IndoModel> filteredData){
        this.list=filteredData;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v=LayoutInflater.from(context).inflate(R.layout.info_row,parent,false);
        ViewHolder viewholder=new ViewHolder(v);
        return viewholder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.img.setImageResource(list.get(position).img);
        holder.name.setText(list.get(position).name);
        holder.profession.setText(list.get(position).profession);
        holder.range.setText(list.get(position).range);
        holder.progressBar.setProgress(list.get(position).progress);
        holder.tags.setText(list.get(position).tags);
        holder.aboutus.setText(list.get(position).aboutus);

    }
    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView img;
        TextView name,profession,range,tags,aboutus,invite;
        ProgressBar progressBar;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img=itemView.findViewById(R.id.profileImg);
            name=itemView.findViewById(R.id.name);
            profession=itemView.findViewById(R.id.location_and_profess);
            range=itemView.findViewById(R.id.range);
            progressBar=itemView.findViewById(R.id.progress);
            tags=itemView.findViewById(R.id.tags);
            aboutus=itemView.findViewById(R.id.aboutus);
            invite=itemView.findViewById(R.id.invite);
            invite.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    invite.setText("Pending");
                }
            });
        }
    }
}
