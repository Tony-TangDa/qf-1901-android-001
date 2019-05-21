package com.example.recyclerviewtest;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class fruitAdapter extends RecyclerView.Adapter<fruitAdapter.ViewHolder> {
    private List<Fruit> mFruitList;
    static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView fruitImage;
        TextView fruitText;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            fruitImage = (ImageView) itemView.findViewById(R.id.fruitImage);
            fruitText = (TextView) itemView.findViewById(R.id.fruitName);
        }
    }

    public fruitAdapter(List<Fruit> fruitList) {
        mFruitList = fruitList;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;
        view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fruit_item, parent, false);
        ViewHolder holder = new ViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        Fruit fruit = mFruitList.get(position);
        viewHolder.fruitImage.setImageResource(fruit.getImageId());
        viewHolder.fruitText.setText(fruit.getName());
    }

    @Override
    public int getItemCount() {
        return mFruitList.size();
    }
}
