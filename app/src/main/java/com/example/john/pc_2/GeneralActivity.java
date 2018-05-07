package com.example.john.pc_2;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;
//import android.support.v7.widget.RecyclerView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.john.pc_2.fragmant.KioskFragment;
import com.example.john.pc_2.fragmant.NewsFragment;

//import java.util.List;

public class GeneralActivity extends AppCompatActivity {

    /*Логин и пароль с LoginActivity*/
    public static final String EXTRA_KEY_LOGIN = "Логин";
    public static final String EXTRA_KEY_PASSWORD = "Пароль";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);
    }

    @NonNull
    private BottomNavigationView.OnNavigationItemSelectedListener getBottomNavigationListener() {
        return new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                Fragment fragment = null;

                switch (item.getItemId()){

                    case R.id.app_KioskMain:
                        fragment = new KioskFragment();
                        break;
                    case R.id.app_NewsMain:
                        fragment = new NewsFragment();
                        break;
                    case R.id.app_NotificationsMain:
                        Toast.makeText(GeneralActivity.this, "Вот так вот", Toast.LENGTH_SHORT).show();
                        break;
                    case  R.id.app_BlockedTransactions:
                        Toast.makeText(GeneralActivity.this, "Вот так вот 2", Toast.LENGTH_SHORT).show();
                        break;
                }
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.fragmentGeneral, fragment);
                ft.commit();
                return true;
            }
        };
    }

}


/*
public void Change (View view){
        Fragment fragment = null;

        if (view.getId() == R.id.app_KioskMain){
            fragment = new KioskFragment();
        }
        else if (view.getId() == R.id.app_NewsMain){
            fragment = new NewsFragment();
        }
        else {
            Toast.makeText(this, "qwwertg", Toast.LENGTH_SHORT).show();
        }
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.fragmentGeneral, fragment);
        ft.commit();
    }
*/