package com.example.menus;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Dashboard");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater optionsinflate = getMenuInflater();
        optionsinflate.inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.dashboard:
                Toast.makeText(this,"The first Option has been selected",
                        Toast.LENGTH_SHORT).show();
                return true;
            case R.id.login:
                startActivity(new Intent(this,Login.class));
                return true;
            case  R.id.signup:
                startActivity(new Intent(this,Signup.class));
                return true;
            default:
                return super.onOptionsItemSelected(item);


        }
    }
}