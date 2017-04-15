package com.acadgild.fujitsu.assignment44;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Fujitsu on 15/04/2017.
 */

public class Adapter  extends BaseAdapter {

    private LayoutInflater mLayoutInflater;
    private ArrayList<PojoClass> dummyData;

    public Adapter(Context contex, ArrayList<PojoClass> dummyData) {

        this.dummyData = dummyData;
        mLayoutInflater = LayoutInflater.from(contex);

    }

    @Override
    public int getCount() {
        return dummyData.size();
    }

    @Override
    public Object getItem(int position) {
        return dummyData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        PojoClass itr = (PojoClass) getItem(position);


        convertView = mLayoutInflater.inflate(R.layout.gridshow,parent,false);

        ImageView mimage1 = (ImageView) convertView.findViewById(R.id.image1);
        TextView textView1 = (TextView) convertView.findViewById(R.id.title1);
        ImageView mimage2 = (ImageView) convertView.findViewById(R.id.image2);
        TextView textView2 = (TextView) convertView.findViewById(R.id.title2);

        mimage1.setImageResource((int) itr.getImage());
        textView1.setText(itr.getName());
        mimage2.setImageResource((int) itr.getImage());
        textView2.setText(itr.getName());


        return convertView;


    }
}

