package com.FGTechMate.myapp10;



import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;

import com.FGTechMate.myapp10.HelperClasses.adapterphone;
import com.FGTechMate.myapp10.HelperClasses.phonehelper;

import java.util.ArrayList;

public class videos extends AppCompatActivity implements adapterphone.ListItemClickListener {

    RecyclerView phoneRecycler;
    RecyclerView.Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videos);

        //Hooks
        phoneRecycler = findViewById(R.id.my_recycler);
        phoneRecycler();

    }

    private void phoneRecycler() {

        //All Gradients
        GradientDrawable gradient2 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0x202020, 0x202020 });
        GradientDrawable gradient1 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0xff7adccf, 0xff7adccf});
        GradientDrawable gradient3 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0xfff7c59f, 0xFFf7c59f});
        GradientDrawable gradient4 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0xffb8d7f5, 0xffb8d7f5});


        phoneRecycler.setHasFixedSize(true);
        phoneRecycler.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        ArrayList<phonehelper> phonelocations = new ArrayList<>();
        phonelocations.add(new phonehelper(gradient1, R.drawable.forkliftwall, "Toyota"));
        phonelocations.add(new phonehelper(gradient4, R.drawable.forkliftwall, "Raymond"));
        phonelocations.add(new phonehelper(gradient2, R.drawable.forkliftwall, "Mitsubishi"));
        phonelocations.add(new phonehelper(gradient4, R.drawable.forkliftwall, "Mazda"));

        phonelocations.add(new phonehelper(gradient2, R.drawable.forkliftwall, "Cat"));


        adapter = new adapterphone(phonelocations,this);
        phoneRecycler.setAdapter(adapter);

    }

    @Override
    public void onphoneListClick(int clickedItemIndex) {


            Intent mIntent;
            switch (clickedItemIndex){
                case 0: //first item in Recycler view
                    mIntent  = new Intent(videos.this, toyota.class);
                    startActivity(mIntent);
                    break;

        }


    }
}