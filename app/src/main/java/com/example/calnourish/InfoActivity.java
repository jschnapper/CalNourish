package com.example.calnourish;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        TextView title = (TextView) findViewById(R.id.text1);
        title.setText("This is Info");

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavView_Bar);
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(0);
        menuItem.setChecked(true);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.info:
                        Intent infoIntent = new Intent(InfoActivity.this, InfoActivity.class);
                        startActivity(infoIntent);
                        break;

                    case R.id.category:
                        Intent categoryIntent = new Intent(InfoActivity.this, MainActivity.class);
                        startActivity(categoryIntent);
                        break;

                    case R.id.search:
                        Intent searchIntent = new Intent(InfoActivity.this, SearchActivity.class);
                        startActivity(searchIntent);
                        break;

                    case R.id.foodrecovery:
                        Intent foodrecoveryIntent = new Intent(InfoActivity.this, MainActivity.class);
                        startActivity(foodrecoveryIntent);
                        break;

                    case R.id.menu:
                        Intent menuIntent = new Intent(InfoActivity.this, MainActivity.class);
                        startActivity(menuIntent);
                        break;
                }


                return false;
            }
        });
    }
}
