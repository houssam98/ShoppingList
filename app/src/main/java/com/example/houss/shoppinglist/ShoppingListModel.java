package com.example.houss.shoppinglist;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

public class ShoppingListModel {

    private final List<ShoppingItem> list_items = new ArrayList<ShoppingItem>();
    private Context context;

    public void listAdapter(Context context) {
        this.context = context;
        for (int j = 0; j < 20; j++) {
            // items.add();
        }
    }
    public int getItemCount() {
        return list_items.size();
    }
    public void removeTodo(int position) {
       list_items.remove(position);
       // notifyItemRemoved(position);
    }
    public void addItem(ShoppingItem item) {
        list_items.add(0, item);
        //notifyDataSetChanged();
        //notifyItemInserted(0);
    }
}
