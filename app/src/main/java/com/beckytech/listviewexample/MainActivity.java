package com.beckytech.listviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private final List<ListModel>  data= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (int i = 0; i < 100; i++) {
            ListModel model = new ListModel();
            model.setName("享学"+ i);
            data.add(model);
        }

        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(new ListAdapter(data, this));
        listView.setOnItemClickListener((parent, view, position, id) -> {
            Toast.makeText(this, "You clicked item "+position, Toast.LENGTH_SHORT).show();
        });
    }
}