package com.example.menudemo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView txt1=findViewById(R.id.txt1);
        registerForContextMenu(txt1);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.my_menu,menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        LinearLayout layout=findViewById(R.id.layout1);
        switch(item.getItemId())
        {

            case R.id.red:

                layout.setBackgroundColor(Color.RED);
                break;

            case R.id.green:
                layout.setBackgroundColor(Color.GREEN);
                break;
            case R.id.blue:
                layout.setBackgroundColor(Color.BLUE);
                break;
            case R.id.close:
                finish();
                break;


        }


        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.my_menu,menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {

        LinearLayout layout=findViewById(R.id.layout1);
        switch(item.getItemId())
        {

            case R.id.red:

                layout.setBackgroundColor(Color.RED);
                break;

            case R.id.green:
                layout.setBackgroundColor(Color.GREEN);
                break;
            case R.id.blue:
                layout.setBackgroundColor(Color.BLUE);
                break;
            case R.id.close:
                finish();
                break;


        }


        return super.onContextItemSelected(item);
    }
}