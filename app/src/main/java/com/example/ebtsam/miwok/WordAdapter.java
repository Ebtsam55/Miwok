package com.example.ebtsam.miwok;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word > {

   private int colorResourceId;

    public WordAdapter(Activity context, ArrayList<Word> words,int mColorResourceId) {
        super(context, 0, words);
        colorResourceId=mColorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        Word word_position = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        // Lookup view for data population
        TextView defaultLanguage = (TextView) convertView.findViewById(R.id.default_language);
        TextView miwokLanguage = (TextView) convertView.findViewById(R.id.miwok_language);
        ImageView image=(ImageView) convertView.findViewById(R.id.image);

        // Populate the data into the template view using the data object
        defaultLanguage.setText(word_position.getmDefaultLanguage());
        miwokLanguage.setText(word_position.getmMiwokLanguage());

        if (word_position.hasImage())
        {
            image.setImageResource(word_position.getmImageSrcId());
            image.setVisibility(View.VISIBLE);
        }
        else image.setVisibility(View.GONE);

        View textParts=convertView.findViewById(R.id.text_parts);
        textParts.setBackgroundResource(colorResourceId);


        // Return the completed view to render on screen
        return convertView;
    }
}
