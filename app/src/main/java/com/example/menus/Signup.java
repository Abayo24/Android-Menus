package com.example.menus;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class Signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        getSupportActionBar().setTitle("Signup");
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
                startActivity(new Intent(this,Login.class));
                return true;
            case  R.id.signup:
                Toast.makeText(this, "The third option has been selected", Toast.LENGTH_SHORT).show();
            default:
                return super.onOptionsItemSelected(item);

        }
    }
}