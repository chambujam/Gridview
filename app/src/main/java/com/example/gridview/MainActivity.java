package com.example.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    ArrayList<String> text = new ArrayList<>();
    ArrayList<Integer> image = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gridView);
        fillArray();
        GridAdapter adapter = new GridAdapter(this, text, image);
        gridView.setAdapter(adapter);
    }

    public void fillArray()
    {
            text.add("Bird");
            text.add("Cat");
            text.add("Chicken");
            text.add("Dog");
            text.add("Fish");
            text.add("Monkey");
            text.add("Rabbit");
            text.add("Sheep");
            text.add("Lion");

            image.add(R.drawable.bird);
            image.add(R.drawable.cat);
            image.add(R.drawable.chicken);
            image.add(R.drawable.dog);
            image.add(R.drawable.fish);
            image.add(R.drawable.monkey);
            image.add(R.drawable.rabbit);
            image.add(R.drawable.sheep);
            image.add(R.drawable.lion);
        }
    }
