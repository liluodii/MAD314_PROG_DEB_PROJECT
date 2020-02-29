package com.example.jewelleryshop;


import android.content.Context;
import android.content.Intent;
import android.icu.text.Transliterator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<com.example.jewelleryshop.Adapter.ViewHolder> {

    private LayoutInflater inflater;
    private android.view.View View;

    Adapter(Context context)
    {
        this.inflater=LayoutInflater.from(context);
    }
    @NonNull
    @Override
    public com.example.jewelleryshop.Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.cardview,parent,false);
        return new com.example.jewelleryshop.Adapter.ViewHolder(view);
    }

   @Override
    public void onBindViewHolder(@NonNull com.example.jewelleryshop.Adapter.ViewHolder holder, int position) {
        Ring ring=RingRepo.getInstance().getCustomers().get(position);

        holder.RingImage.setImageResource(ring.Image);
        holder.BName.setText((ring.brand));
        holder.price.setText((ring.Price));


    }

    @Override
    public int getItemCount() {
        return RingRepo.getInstance().getRings().size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView RingImage;
        public TextView BName;
        public TextView price;


        public ViewHolder(@NonNull View itemView) {

            super(itemView);
            RingImage=itemView.findViewById(R.id.imageRing);
            BName=itemView.findViewById(R.id.BName);
            price=itemView.findViewById(R.id.Price);

        }
    }
}

