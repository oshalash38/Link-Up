package com.example.link_up;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.Random;

public class GroupPage extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group_page);

        final Button button = (Button) findViewById(R.id.button5);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                createGroupIcon(v);
            }
        });
    }

    public void createGroupIcon(View view){
//        CardView c = new CardView(this);
//        layout.addView(c);
        setContentView(R.layout.activity_main);
        Button b = new Button(this);
        b.setText("Beep");
        LinearLayout layout = (LinearLayout) findViewById(R.id.linearLayout);
        layout.addView(b);
    }


}
