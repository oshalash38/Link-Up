package com.example.link_up;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public ArrayList<Object> groups = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(null);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                newEvent(view);
            }
        });

        final Button button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // your handler code here
                newActivity(v);
            }
        });

        final Button button3 = (Button) findViewById(R.id.button);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // your handler code here
                newGroup(v);
            }
        });


        final CardView button4 = (CardView) findViewById(R.id.cardView);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // your handler code here
                openGroup(v);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.menuFriends) {
            Intent intent = new Intent(this, FriendList.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void newActivity(View view){
        Intent intent = new Intent(this, ActivityListener.class);
        startActivity(intent);
    }


    public void newGroup(View view){
        GenericGroupPage activity = new GenericGroupPage();
        Intent intent = new Intent(this, GroupPage.class);
        startActivity(intent);
    }

    public void openFriendList(){
        Intent intent = new Intent(this, FriendList.class);
        startActivity(intent);
    }

    public void newEvent(View v){
        Intent intent = new Intent(this, CreateNewEvent.class);
        startActivity(intent);
    }

    public void openGroup(View v){
        Intent intent = new Intent(this, GenericGroupPage.class);
        startActivity(intent);
    }



}
