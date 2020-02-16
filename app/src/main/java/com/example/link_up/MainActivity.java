package com.example.link_up;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

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

//        final MenuItem menuItem = (MenuItem) findViewById(R.id.menuFriends);
//        menuItem.setOnMenuItemClickListener(new View.() {
//            public void onClick(View v) {
//                // your handler code here
//                newGroup(v);
//            }
//        });

        UserAccount u1 = new UserAccount("oshalash", "12345");
        u1.friends.add(new UserAccount("A", "A"));
        u1.friends.add(new UserAccount("B", "B"));


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



}
