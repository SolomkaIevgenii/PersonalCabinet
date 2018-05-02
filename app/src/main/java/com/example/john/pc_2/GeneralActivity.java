package com.example.john.pc_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import java.util.List;

public class GeneralActivity extends AppCompatActivity {

    /*Логин и пароль с LoginActivity*/
    public static final String EXTRA_KEY_LOGIN = "Логин";
    public static final String EXTRA_KEY_PASSWORD = "Пароль";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general);

        final RecyclerView recyclerView = findViewById(R.id.recycleView);

        final TerminalDataSource dataSource = new TerminalDataSource();
        dataSource.load(new TerminalDataSource.ResultCallBack() {
            @Override
            public void onResult(List<Terminals> terminals) {
                //final TerminalDataSource;
            }
        });

    }
}
