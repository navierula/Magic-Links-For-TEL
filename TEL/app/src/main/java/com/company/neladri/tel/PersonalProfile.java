package com.company.neladri.tel;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PersonalProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_profile);
    }


    public void go2NewsFeed(View v){
        Intent goToNews = new Intent(PersonalProfile.this, News_Feed.class);
        startActivity(goToNews);
    }
}
