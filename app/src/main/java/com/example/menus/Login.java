package com.example.menus;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().setTitle("Login");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater optionsInflate = getMenuInflater();
        optionsInflate.inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.dashboard:
                startActivity(new Intent(this,MainActivity.class));
                return true;
            case R.id.login:
                Toast.makeText(this, "The second option has been selected", Toast.LENGTH_SHORT).show();
            case  R.id.signup:
                startActivity(new Intent(this,Signup.class));
                return true;
            default:
                return super.onOptionsItemSelected(item);


        }
    }
}