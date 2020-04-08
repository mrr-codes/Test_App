package com.example.testapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FavsAdapter extends RecyclerView.Adapter{
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.favs_item,parent,false);
        return new FavsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((FavsViewHolder) holder).bindView(position);

    }

    @Override
    public int getItemCount() {
        return OurData.title.length;
    }

    private class FavsViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        private TextView mItemText;
        private ImageView mItemImage;

        public FavsViewHolder(View itemView){
            super(itemView);
            mItemText = (TextView) itemView.findViewById(R.id.itemText);
            mItemImage = (ImageView) itemView.findViewById(R.id.itemImage);
            itemView.setOnClickListener(this);

        }

        public void bindView(int position) {
            mItemText.setText(OurData.title[position]);
            mItemImage.setImageResource(OurData.picturePath[position]);
        }
       public void onClick(View view) {

        }
    }
    /*String data1[],data2[];
    int images[];
    Context context;

    public FavsAdapter(Context ct,String s1[],String s2[],int img[]){
        context = ct;
        data1 = s1;
        data2 = s2;
        images = img;*/

    }


