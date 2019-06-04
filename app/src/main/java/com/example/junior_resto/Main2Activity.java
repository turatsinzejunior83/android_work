package com.example.junior_resto;


import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


public class Main2Activity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    Toolbar toolbar;
    ListView listView;
    DrawerLayout drawerLayout;
    NavigationView navigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigation_drawer);


        toolbar=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        ArrayList<String> Meal= new ArrayList<>();
        Meal.add("Meal1");
        Meal.add("Meal2");
        Meal.add("Meal3");
        Meal.add("Meal4");
        Meal.add("Meal5");
        Meal.add("Meal6");
        Meal.add("Meal7");
        Meal.add("Meal8");
        Meal.add("Meal0");
        Meal.add("Meal10");
        Meal.add("Meal11");
        Meal.add("Meal12");
        Meal.add("Meal13");

        listView=(ListView) findViewById(R.id.lv);
        ArrayAdapter<String> Adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,Meal);
        listView.setAdapter(Adapter);

        drawerLayout=(DrawerLayout) findViewById(R.id.drawer_layout);
        navigationView=(NavigationView) findViewById(R.id.navigation_view);

        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle= new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open_drawer,R.string.close_drawer);
        drawerLayout.setDrawerListener(toggle);
        toggle.syncState();


    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        int id= menuItem.getItemId();

        switch(id){

            case R.id.chips:
                Intent chips=new Intent(Main2Activity.this,lastActivity.class);
                startActivity(chips);
                break;

            //others are just the toat messages
            case R.id.meal:
                Toast.makeText(getApplicationContext(),"Meal selected",Toast.LENGTH_LONG).show();
                break;

            case R.id.meat:
                Toast.makeText(getApplicationContext(),"Meat selected",Toast.LENGTH_LONG).show();
                break;

            case R.id.banana:
                Toast.makeText(getApplicationContext(),"Banana selected",Toast.LENGTH_LONG).show();

                break;

            case R.id.apple:
                Toast.makeText(getApplicationContext(),"Apple selected",Toast.LENGTH_LONG).show();

                break;


            case R.id.juice:
                Toast.makeText(getApplicationContext(),"Juice selected",Toast.LENGTH_LONG).show();
                break;

            case R.id.salad:
                Toast.makeText(getApplicationContext(),"Salad selected",Toast.LENGTH_LONG).show();

                break;


        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }
}
