package com.example.rohitgiri.vibhassignment84;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by rohit giri on 29-10-2017.
 */

//creating Custom Adapter which is extending base Adapter
public class Custom_Adapter extends BaseAdapter {
    private Context context;                      //  Declaring Context
    private String[] name;                        // Declaring String
    private int[] imageId;                       //Declaring ImageId
    //Custom Adapter
    public Custom_Adapter(MainActivity mainActivity, int[] imageId, String[] name) {
        context=mainActivity;
        this.imageId=imageId;     //assigning imageId which was passed by Main Activity
        this.name=name;
    }
    // methodsd overriden by Base Adapter for getting count,item postion,Id's of respective Id,and setting view respectively
    @Override
    public int getCount() {
        return name.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View grid;
        //getting layout inflator service
        LayoutInflater layoutInflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if(convertView==null)
        {
            grid=new View(context);
            grid=layoutInflater.inflate(R.layout.row,null);
            TextView textView= (TextView) grid.findViewById(R.id.grid_text);     //getting text view by id
            ImageView imageView= (ImageView) grid.findViewById(R.id.grid_image);
            textView.setText(name[position]);                                          //setting text View
            imageView.setImageResource(imageId[position]);


        }
        else {
            grid=(View)convertView;
        }

        return grid;                              //returnig grid which is a object of view
    }
}
