package com.example.houss.shoppinglist;
import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ItemsAdapter extends RecyclerView.Adapter<ItemsAdapter.MyViewHolder>{
    private List<ShoppingItem> itemsList;

    public ItemsAdapter(List<ShoppingItem> itemsList) {
        this.itemsList = itemsList;
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView name, category, number;
        public ImageView image;

        public MyViewHolder(View view) {
            super(view);
            name = (TextView) view.findViewById(R.id.name);
            category = (TextView) view.findViewById(R.id.category);
            number = (TextView) view.findViewById(R.id.number);
            image = (ImageView) view.findViewById(R.id.image);
        }
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.shopping_list_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        ShoppingItem item = itemsList.get(position);
        holder.name.setText(item.getName());
        holder.category.setText(item.getCategory());
        holder.number.setText(item.getNumber());
        setImageView(holder, position);
    }

    public void setImageView(MyViewHolder holder, int position){
        ShoppingItem item = itemsList.get(position);
        switch(holder.category.getText().toString()) {
            case "Beverages" : holder.image.setImageResource(R.drawable.beverages); break;
            case "Bread and Bakery" : holder.image.setImageResource(R.drawable.bread); break;
            case "Canned and Jarred Goods" : holder.image.setImageResource(R.drawable.cannedfood); break;
            case "Dairy products" : holder.image.setImageResource(R.drawable.dairy); break;
            case "Meat" : holder.image.setImageResource(R.drawable.meat); break;
            case "Fruits" : holder.image.setImageResource(R.drawable.fruit); break;
            case "Electronics" : holder.image.setImageResource(R.drawable.electronics); break;
            case "Tools" : holder.image.setImageResource(R.drawable.tools); break;
        }
    }

    @Override
    public int getItemCount() {
        return itemsList.size();
    }

    public void removeItem(int position) {
        itemsList.remove(position);
        notifyItemRemoved(position);
    }

    public void restoreItem(ShoppingItem item, int position) {
        itemsList.add(position, item);
        notifyItemInserted(position);
    }

    public List<ShoppingItem> getData() {
        return itemsList;
    }
}

