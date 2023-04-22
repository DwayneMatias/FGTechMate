package com.FGTechMate.myapp10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.TextView;

public class chain extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chain);





        AutoCompleteTextView autocomp1 = (AutoCompleteTextView)findViewById(R.id.autocomp1);
        AutoCompleteTextView autocomp2 = (AutoCompleteTextView)findViewById(R.id.autocomp2);
        final Button resultbtn = (Button)findViewById(R.id.resultbtn);
        TextView resulttxt = (TextView)findViewById(R.id.resulttxt);
        TextView resulttxt2 = (TextView)findViewById(R.id.resulttxt2);


        ArrayAdapter<String>adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line,pitch);
        autocomp1.setAdapter(adapter);
        ArrayAdapter<String>adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line,lacing);
        autocomp2.setAdapter(adapter1);


       resultbtn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               String s = autocomp1.getText().toString();
               String s1 = autocomp2.getText().toString();




                   }

               });

        autocomp1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long rowId) {
                String s = (String)parent.getItemAtPosition(position);

                if (position ==0){
                    resulttxt.setText("4");

                }else if (position ==1){
                    resulttxt.setText("5");

                }else if (position ==2){
                    resulttxt.setText("6");

                }else if (position ==3){
                    resulttxt.setText("8");

                }else if (position ==4){
                    resulttxt.setText("10");

                }else if (position ==5){
                    resulttxt.setText("12");

                }else if (position ==6){
                    resulttxt.setText("14");

                }else if (position ==7){
                    resulttxt.setText("16");

                }else if (position ==8){
                    resulttxt.setText("20");
                }



           }


       });

        autocomp2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long rowId) {
                String s1 = (String)parent.getItemAtPosition(position);

                if (position ==0){
                    resulttxt2.setText("22");

                }else if (position ==1){
                    resulttxt2.setText("23");

                }else if (position ==2){
                    resulttxt2.setText("34");

                }else if (position ==3){
                    resulttxt2.setText("44");

                }else if (position ==4){
                    resulttxt2.setText("66");

                }else if (position ==5){
                    resulttxt2.setText("88");
                }



            }


        });



     }



    private static final String[] pitch = new String[]{"1/2", "5/8", "3/4", "1", "1 & 1/4", "1 &  1/2", "1 & 3/4", "2", "2 & 1/2"  };
    private static final String[] lacing = new String[]{"2x2", "2x3", "3x4", "4x4", "6x6", "8x8"};



}