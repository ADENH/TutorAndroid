package com.adek.tutorandroid;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by Adek on 11/03/2018.
 */

public class AdapterMainMenu extends RecyclerView.Adapter<AdapterMainMenu.RecyclerViewHolder>{
    List<ModelMainMenu> values;
    Context context1;

    public AdapterMainMenu(Context context, List<ModelMainMenu> UserInformation) {
        context1=context;
        values=UserInformation;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.main_menu,parent,false);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder,final int position) {
        holder.judul.setText(values.get(position).getJudul());
        holder.gambar.setImageResource(values.get(position).getGambar());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (position==0){
                    Toast.makeText(context1,"Masih Dalam Pengembangan",Toast.LENGTH_SHORT).show();
                }
                if (position==1){
                    Toast.makeText(context1,"Masih Dalam Pengembangan",Toast.LENGTH_SHORT).show();
                }
                if (position==2){
                    Toast.makeText(context1,"Masih Dalam Pengembangan",Toast.LENGTH_SHORT).show();
                }
                if (position==3){
                    Toast.makeText(context1,"Masih Dalam Pengembangan",Toast.LENGTH_SHORT).show();
                }
            }
        });


    }

    @Override
    public int getItemCount() {
        return values.size();
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder {
        TextView judul;
        ImageView gambar;
        CardView cardView;
        public RecyclerViewHolder(View itemView) {
            super(itemView);
            cardView=(CardView)itemView.findViewById(R.id.mainmenuicon);
            judul=(TextView)itemView.findViewById(R.id.tulisan);
            gambar=(ImageView)itemView.findViewById(R.id.gambar);
        }
    }
}
