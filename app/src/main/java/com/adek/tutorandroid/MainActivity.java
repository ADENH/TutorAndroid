package com.adek.tutorandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    AdapterMainMenu adapterMainMenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView= findViewById(R.id.tampilanmainmenu);
        layoutManager = new GridLayoutManager(getApplicationContext(),3);
        layoutManager.setAutoMeasureEnabled(true);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(layoutManager);

        adapterMainMenu = new AdapterMainMenu(getApplicationContext(),getData());
        recyclerView.setAdapter(adapterMainMenu);

    }

    private List<ModelMainMenu> getData(){
        List<ModelMainMenu> data = new ArrayList<>();
        data.add(new ModelMainMenu("Facebook",R.drawable.ic_facebook));
        data.add(new ModelMainMenu("Twitter",R.drawable.ic_twitter));
        data.add(new ModelMainMenu("Whatsapp",R.drawable.ic_whatsapp));
        data.add(new ModelMainMenu("Google+",R.drawable.ic_google_plus));
        data.add(new ModelMainMenu("Linkedin",R.drawable.ic_linkedin));
        data.add(new ModelMainMenu("Youtube",R.drawable.ic_youtube));
        data.add(new ModelMainMenu("Snapchat",R.drawable.ic_snapchat));
        data.add(new ModelMainMenu("Pinterest",R.drawable.ic_pinterest));
        data.add(new ModelMainMenu("Twitch",R.drawable.ic_twitch));



        return data;
    }
}
