package com.example.android.miwok;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;
import java.util.List;

public class WordAdapter extends ArrayAdapter<Word> {

    private int listContainerColor;

    public WordAdapter(@NonNull Context context, @NonNull ArrayList<Word> objects, int listContainerColor) {
        super(context, 0, objects);
        this.listContainerColor = listContainerColor;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);

        }
        ImageView image = convertView.findViewById(R.id.image);
        if(getItem(position).getImageId() == -1){
            image.setVisibility(View.GONE);
        }
        else{
            image.setImageResource(getItem(position).getImageId());
        }

        View listContainer = convertView.findViewById(R.id.listContainer);
        int color = ContextCompat.getColor(getContext(), listContainerColor);
        listContainer.setBackgroundColor(color);

        TextView miwokNameView = convertView.findViewById(R.id.miwokNameView);
        TextView defaultNameView = convertView.findViewById(R.id.defaultNameView);

        miwokNameView.setText(getItem(position).getMiwokWord());
        defaultNameView.setText(getItem(position).getDefaultWord());
        return convertView;
    }
}
