package com.nupero.travelapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.nupero.travelapp.adapter.RecentsAdapter;
import com.nupero.travelapp.adapter.TopPlacesAdapter;
import com.nupero.travelapp.model.RecentsData;
import com.nupero.travelapp.model.TopPlacesData;

import java.util.ArrayList;
import java.util.List;

public class ContentActivity extends AppCompatActivity {

    RecyclerView recentRecycler, topPlacesRecycler;
    RecentsAdapter recentsAdapter;
    TopPlacesAdapter topPlacesAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);


        List<RecentsData> recentsDataList = new ArrayList<>();
        recentsDataList.add(new RecentsData("Ruwanweliseya", "Anuradhapura", "From $20", R.drawable.img13));
        recentsDataList.add(new RecentsData("Temple of the Tooth Relic", "Kandy", "From $15", R.drawable.img8));
        recentsDataList.add(new RecentsData("Sigiriya", "Anuradapura", "From $25", R.drawable.img12));
        recentsDataList.add(new RecentsData("Nine Arch Bridge", "Badulla", "From $30", R.drawable.img10));
        recentsDataList.add(new RecentsData("Galle Fort", "Galle", "From $10", R.drawable.img17));
        recentsDataList.add(new RecentsData("Yala National Park", "Hambantota", "From $25", R.drawable.img15));

        setRecentRecycler(recentsDataList);

        List<TopPlacesData> topPlacesDataList = new ArrayList<>();
        topPlacesDataList.add(new TopPlacesData("Ruwanweliseya", "Anuradhapura", "From $20", R.drawable.img14));
        topPlacesDataList.add(new TopPlacesData("Bambarakanda Falls", "Badulla", "From $30", R.drawable.img11));
        topPlacesDataList.add(new TopPlacesData("Tea Estates", "Nuwara Eliya", "From $20", R.drawable.img19));
        topPlacesDataList.add(new TopPlacesData("Mihintale", "Anuradhapura", "From $20", R.drawable.img20));
        topPlacesDataList.add(new TopPlacesData("Bentota", "Kaluthara", "From $10", R.drawable.img22));
        topPlacesDataList.add(new TopPlacesData("Koggala", "Galle", "From $20", R.drawable.img18));

        setTopPlacesRecycler(topPlacesDataList);
    }


    private void setRecentRecycler(List<RecentsData> recentsDataList){

        recentRecycler = findViewById(R.id.recent_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        recentRecycler.setLayoutManager(layoutManager);
        recentsAdapter = new RecentsAdapter(this, recentsDataList);
        recentRecycler.setAdapter(recentsAdapter);
    }

    private  void setTopPlacesRecycler(List<TopPlacesData> topPlacesDataList){

        topPlacesRecycler = findViewById(R.id.top_places_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        topPlacesRecycler.setLayoutManager(layoutManager);
        topPlacesAdapter = new TopPlacesAdapter(this, topPlacesDataList);
        topPlacesRecycler.setAdapter(topPlacesAdapter);
    }


}