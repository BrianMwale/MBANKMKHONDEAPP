package com.example.mybankmkhondeapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;

public class HomePageAdapter extends ArrayAdapter<HomePage>  {

    public HomePageAdapter(@NonNull Context context, ArrayList<HomePage> homePageArrayList) {
        super(context, 0, homePageArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listitemView = convertView;
        if (listitemView == null) {
            // Layout Inflater inflates each item to be displayed in GridView.
            listitemView = LayoutInflater.from(getContext()).inflate(R.layout.card_view_item, parent, false);
        }
       HomePage homePage = getItem(position);
        TextView itemTV = listitemView.findViewById(R.id.textId);
        ImageView itemIV = listitemView.findViewById(R.id.imageId);
       itemTV.setText(homePage.getItemName());
        itemIV.setImageResource(homePage.getItem());
        return listitemView;
    }
}
