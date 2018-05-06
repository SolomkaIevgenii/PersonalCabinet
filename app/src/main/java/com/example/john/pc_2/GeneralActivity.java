package com.example.john.pc_2;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

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
        bottomNavigationView.setOnNavigationItemSelectedListener(getBottomNavigationListener());
    }

    @NonNull
    private BottomNavigationView.OnNavigationItemSelectedListener getBottomNavigationListener() {
        return new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                if (item.getItemId() == R.id.app_KioskMain){
                    findViewById(R.id.recycleView).setVisibility(View.VISIBLE);
                }
                else {
                    findViewById(R.id.recycleView).setVisibility(View.GONE);
                    Toast.makeText(GeneralActivity.this, "Вот так вот", Toast.LENGTH_SHORT).show();
                }

                return true;
            }
        };
    }

}
        /*
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId())
                {
                    case R.id.app_KioskMain:
                        Toast.makeText(GeneralActivity.this, "Тут должен появится мониторинг терминалов", Toast.LENGTH_SHORT).show();
                        Toast.makeText(GeneralActivity.this, "Но увы...", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.app_NewsMain:
                        Toast.makeText(GeneralActivity.this, "Тут должены быть новости", Toast.LENGTH_SHORT).show();
                        Toast.makeText(GeneralActivity.this, "Но увы...", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.app_NotificationsMain:
                        Toast.makeText(GeneralActivity.this, "Тут когдато будут заявки и сообщения", Toast.LENGTH_SHORT).show();
                        Toast.makeText(GeneralActivity.this, "Но увы...", Toast.LENGTH_SHORT).show();
                        break;
            }
            return false;
            }
        });
        */