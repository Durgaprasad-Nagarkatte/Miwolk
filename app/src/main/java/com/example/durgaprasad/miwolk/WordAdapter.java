package com.example.durgaprasad.miwolk;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

import static android.R.attr.filterTouchesWhenObscured;
import static android.R.attr.resource;

/**
 * Created by Durgaprasad on 3/7/2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    private static final String LOG_TAG = WordAdapter.class.getSimpleName();

    public WordAdapter(Context context, ArrayList<Word> words) {
        super(context,0,words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Word currentWord = getItem(position);


        TextView miwokTextView = (TextView)listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(currentWord.getMiwokTranslation());

        TextView defaultTextView = (TextView)listItemView.findViewById(R.id.english_text_view);
        defaultTextView.setText(currentWord.getDefaultTranslation());

        ImageView image = (ImageView)listItemView.findViewById(R.id.image);
        if (image.getDrawable() == null){
            image.setVisibility(View.GONE);
            return listItemView;
        }
        else{
            image.setImageResource(currentWord.getImageResourceId());
            return listItemView;
        }

    }
}
