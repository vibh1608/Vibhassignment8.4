package com.example.rohitgiri.vibhassignment84;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

//creating a class which is extending AppCompatActivity
public class MainActivity extends AppCompatActivity {
    GridView gridView;                    //creating object of gridView

    //initialising name array with values
    String[] name={"ginger bread","Honey Comb","Ice Cream","Jelly Bean","Kit Kat","Lollipop"};

    //initialising imageId with images
    //location of images are in res/drawable folder
    int[] imageId= {
            R.drawable.ginger_bread,
            R.drawable.honey_comb,
            R.drawable.ice_cream,
            R.drawable.jelly_bean,
            R.drawable.kitkat,
            R.drawable.lollipop

    };


    //onCreate method
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);   //setting content View for UI
        Custom_Adapter custom_adapter=new Custom_Adapter(MainActivity.this,imageId,name);  //Custom adapter
        gridView= (GridView) findViewById(R.id.grid);                //setting grid view by it's ID
        gridView.setAdapter(custom_adapter);                       //setting adapter

    }
}
