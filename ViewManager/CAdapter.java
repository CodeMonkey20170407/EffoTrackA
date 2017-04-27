package com.effotracka.effotracka.ViewManager;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.effotracka.effotracka.R;

public class CAdapter extends BaseAdapter {
    private final LayoutInflater mInflater;
    private int logos[];


    public CAdapter(Context context, int[] logos) {
        mInflater = LayoutInflater.from(context);
        this.logos = logos;
    }

    @Override
    public int getCount() {
        return logos.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = view;
        ImageView picture;
        TextView name;

        if (v == null) {
            v = mInflater.inflate(R.layout.grid_item, viewGroup, false);
            v.setTag(R.id.picture, v.findViewById(R.id.picture));
        }

        picture = (ImageView) v.getTag(R.id.picture);
        picture.setImageResource(logos[i]);

        return v;
    }

}
