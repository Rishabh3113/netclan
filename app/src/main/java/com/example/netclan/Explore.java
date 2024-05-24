package com.example.netclan;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class Explore extends AppCompatActivity {

    TabLayout tabLayout;
    TabItem professional,individual,merchant;
    PagerAdapter pagerAdapter;
    DrawerLayout drawerLayout;

    ActionBarDrawerToggle actionBarDrawerToggle;
    ImageView nav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.explore2);

        tabLayout=findViewById(R.id.tabla);

        drawerLayout=findViewById(R.id.drawer);

        professional=findViewById(R.id.pro);
        nav=findViewById(R.id.ima);
        individual=findViewById(R.id.pr);
        merchant=findViewById(R.id.po);
        ViewPager viewPager=findViewById(R.id.view);
        pagerAdapter=new pageradapter(getSupportFragmentManager(),3);
        viewPager.setAdapter(pagerAdapter);


        nav.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View view) {
                                       if(!drawerLayout.isDrawerOpen(GravityCompat.START)) drawerLayout.openDrawer(GravityCompat.START);
                                       else drawerLayout.closeDrawer(GravityCompat.END);


                                   }
                               });

        actionBarDrawerToggle = new ActionBarDrawerToggle(Explore.this, drawerLayout, R.string.nav_open, R.string.nav_close);

        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();




        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                if(tab.getPosition()==0|| tab.getPosition()==1|| tab.getPosition()==2 ){
                    pagerAdapter.notifyDataSetChanged();
                }
            }


            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

    }
}