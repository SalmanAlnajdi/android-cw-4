package com.example.testcw;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager vp = findViewById(R.id.vp);
      //  TabLayout t1 = findViewById(R.id.tab);
        TabLayout t2 = findViewById(R.id.tab2);

        t2.setupWithViewPager(vp);

       // t1.setupWithViewPager(vp);

        FragmentAdp adapter = new FragmentAdp(getSupportFragmentManager());
        vp.setAdapter(adapter);

        t2.getTabAt(0).setIcon(R.drawable.ic_baseline_home_24);
        t2.getTabAt(1).setIcon(R.drawable.ic_baseline_chat_24);
        t2.getTabAt(2).setIcon(R.drawable.ic_baseline_view_headline_24);

    }
}