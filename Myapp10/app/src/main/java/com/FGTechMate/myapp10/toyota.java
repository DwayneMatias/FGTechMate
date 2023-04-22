package com.FGTechMate.myapp10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class toyota extends AppCompatActivity {

    Button buttontoyota;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toyota);

        buttontoyota = findViewById(R.id.buttontoyota);


        buttontoyota.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent browse = new Intent( Intent.ACTION_VIEW , Uri.parse("https://www.youtube.com/playlist?list=PLSLuDNL-h9dNxlblPM71MP205u80yhzJm") );

                startActivity( browse );
            }
        });
    }

    private void gotoUrl(String s) {
          Uri uri = Uri.parse(s);
          startActivity(new Intent(Intent.ACTION_VIEW,uri));

    }

}