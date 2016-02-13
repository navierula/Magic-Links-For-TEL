package com.company.neladri.tel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioButton;

public class show_Favorites extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show__favorites);
    }

    public void back_to_NewsFeed(View v){

        Intent i = new Intent(show_Favorites.this, News_Feed.class);
        startActivity(i);
    }



    public void gotoProfile(View v){
        Intent go2pro = new Intent(show_Favorites.this, PersonalProfile.class);
        startActivity(go2pro);
    }




    
}
