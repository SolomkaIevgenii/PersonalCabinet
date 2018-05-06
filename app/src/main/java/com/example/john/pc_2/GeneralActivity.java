package com.example.john.pc_2;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;
//import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.john.pc_2.fragmant.KioskFragment;
import com.example.john.pc_2.fragmant.NewsFragment;

//import java.util.List;

public class GeneralActivity extends FragmentActivity {

    /*Логин и пароль с LoginActivity*/
    public static final String EXTRA_KEY_LOGIN = "Логин";
    public static final String EXTRA_KEY_PASSWORD = "Пароль";

    private KioskFragment kioskFragment;
    private NewsFragment newsFragment;

    private FragmentManager manager;
    private FragmentTransaction transaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(getBottomNavigationListener());

        kioskFragment = new KioskFragment();
        newsFragment = new NewsFragment();
    }

    @NonNull
    private BottomNavigationView.OnNavigationItemSelectedListener getBottomNavigationListener() {
        return new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                transaction = manager.beginTransaction();

                if (item.getItemId() == R.id.app_KioskMain){
                    findViewById(R.id.recycleView).setVisibility(View.VISIBLE);
                }
                else if (item.getItemId()==R.id.app_NewsMain){

                    //transaction.add(R.id.container, newsFragment);
                }
                else {
                    findViewById(R.id.recycleView).setVisibility(View.GONE);
                    Toast.makeText(GeneralActivity.this, "Вот так вот", Toast.LENGTH_SHORT).show();
                }

                return true;
            }
        };
            transaction.commit();
    }
}