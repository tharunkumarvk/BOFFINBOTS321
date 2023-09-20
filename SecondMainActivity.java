package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class SecondMainActivity extends AppCompatActivity {

    private ListView eventsLV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity_main);

        eventsLV =findViewById(R.id.eventListView);
        Button clubmsgButton=(Button) findViewById(R.id.clubmsgButton);
        Button clubsButton=(Button) findViewById(R.id.yourclubsButton);
        Button merchButton=(Button) findViewById(R.id.merchButton);
        Button registeredeventsButton=(Button) findViewById(R.id.rgsteredeventsButton);

        clubmsgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondMainActivity.this, ClubMsg.class);
                startActivity(intent);
            }
        });

        clubsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondMainActivity.this, your_clubs.class);
                startActivity(intent);
            }
        });



        List<String> events = new ArrayList<String>();
        events.add("HackBattle");
        events.add("Start-ip Street");
        events.add("VAX HACK");
        events.add("SKY FORCE");
        events.add("Origami Workshop");
        events.add("HackBattle");
        events.add("Hexathon");
        events.add("ForkThis");
        events.add("Laser tag");
        events.add("Cook Off-8.0");
        events.add("NeuroNexus");
        events.add("ManuPitch 360");
        events.add("Hydrogen: Fueling Future");
        events.add("IoThon 2.0");
        events.add("Cicada 3301");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, events);
        eventsLV.setAdapter(arrayAdapter);

        eventsLV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent intent1=new Intent(SecondMainActivity.this, ListVOne.class);
                    startActivity(intent1);
            }
        });

    }

}
