package com.example.invairo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.invairo.adapter.RecyclerViewAdapter;
import com.example.invairo.model.ModelDataNews;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class NewsActivity extends AppCompatActivity {

    ArrayList<ModelDataNews> mData;
    RecyclerViewAdapter rcAdapter;
    RecyclerView rcView;
    ArrayList<ModelDataNews> dataNews = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        initData();

        rcView = findViewById(R.id.rcView);
        TabLayout tabLayout = findViewById(R.id.tabLayout);
        BottomNavigationView bottomNav = (BottomNavigationView) findViewById(R.id.bottom_nav);

        bottomNav.setSelectedItemId(R.id.page_news);

        showRcView(dataNews, "semua");

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

                switch (tab.getPosition()){
                    case 0 :
                        showRcView(dataNews, "semua");
                        break;
                    case 1 :
                        showRcView(dataNews, "limbah");
                        break;
                    case 2 :
                        showRcView(dataNews, "reboisasi");
                        break;
                }

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        bottomNav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.page_news:
                        Intent intent = new Intent(NewsActivity.this, NewsActivity.class);
                        intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                        startActivity(intent);
                        break;
                    case R.id.page_profile:
                        Intent intent2 = new Intent(NewsActivity.this, ProfileActivity.class);
                        intent2.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                        startActivity(intent2);
                        break;
                    case R.id.page_challange:
                        Intent intent3 = new Intent(NewsActivity.this, ChallangeActivity.class);
                        intent3.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                        startActivity(intent3);
                        break;
                }

                return false;
            }
        });

    }

    final void initData() {
        dataNews.add(new ModelDataNews(R.drawable.gambar4, "Pengolahan sampah", "limbah"));
        dataNews.add(new ModelDataNews(R.drawable.gambar5, "Pembuangan sampah organik dan non organik", "limbah"));
        dataNews.add(new ModelDataNews(R.drawable.gambar3, "Totebag ramah lingkungan", "limbah"));
        dataNews.add(new ModelDataNews(R.drawable.gambar2, "Save the earth", "reboisasi"));
        dataNews.add(new ModelDataNews(R.drawable.gambar1, "Penanaman ulang", "reboisasi"));
        dataNews.add(new ModelDataNews(R.drawable.gambar6, "Rehabilitas hutan", "reboisasi"));
    }

    private void showRcView (ArrayList<ModelDataNews> data, String category){ ;
        ArrayList<ModelDataNews> finalList = new ArrayList<>();
        if (category == "reboisasi"){
            finalList = filterData(data, category);
        }else if (category == "limbah"){
            finalList = filterData(data,category);
        }else {
            finalList = data;
        }

        rcAdapter = new RecyclerViewAdapter(this, finalList, "reboisasi");
        rcView.setLayoutManager(new LinearLayoutManager(this));
        rcView.setAdapter(rcAdapter);

    }

    private static ArrayList<ModelDataNews> filterData(ArrayList<ModelDataNews> data, String category){
        ArrayList<ModelDataNews> finalList = new ArrayList<>();
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).getCat().equals(category)){
                finalList.add(data.get(i));}
        }
        return finalList;
    }

}