///////jbnjkbhkbnlk l


package com.example.john.pc_2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    /*Действие при нажатии на кнопку*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        /*Объявляем кнопку входа, логин и пароль*/
        View buttonEnter = findViewById(R.id.buttonEnter);
        final EditText userLogin = findViewById(R.id.editTextLogin);
        final EditText userPassword = findViewById(R.id.editTextPassword);

        View.OnClickListener clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /*!!!ПОКА НИКУДА НЕ ПЕРЕДАЮ!!!Преобразовываем логин и пароль в стринг (На будущее)*/
                String login = userLogin.getText().toString();
                String password = userPassword.getText().toString();

                Intent intent = new Intent(v.getContext(), GeneralActivity.class);
                intent.putExtra(GeneralActivity.EXTRA_KEY_LOGIN, login);
                intent.putExtra(GeneralActivity.EXTRA_KEY_PASSWORD, password);
                startActivity(intent);
            }
        };
        buttonEnter.setOnClickListener(clickListener);
    }
}
