package com.company.neladri.tel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class News_Feed extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news__feed);
    }

    public void travel_Expand_View(View v){
        Button button=(Button) v; //passes the button access
        Intent intent = new Intent(News_Feed.this, show_Favorites.class);
        startActivity(intent);
    }


    public void PersonalProfile(View v){
        Intent intent2 = new Intent(News_Feed.this, PersonalProfile.class);
        startActivity(intent2);
    }
}
