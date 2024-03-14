package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Animal> animals = new ArrayList<>();
    private RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //hook
        recyclerView = findViewById(R.id.recycleView);

        data();
        MyAdpater myAdapter= myAdapter = new MyAdpater(animals, this);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager((new LinearLayoutManager(this)));


    }

    private void data() {
        Animal animal = new Animal("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.fundacionaquae.org%2Fwiki%2Fconsejos-para-proteger-a-los-animales%2F&psig=AOvVaw1JcCZLCswYc1FLh6PC69W1&ust=1710430998061000&source=images&cd=vfe&opi=89978449&ved=0CBMQjRxqFwoTCJCQnpLK8YQDFQAAAAAdAAAAABAE","Lion", "Feline", 10);
        Animal animal1 = new Animal("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.fundacionaquae.org%2Fwiki%2Fconsejos-para-proteger-a-los-animales%2F&psig=AOvVaw1JcCZLCswYc1FLh6PC69W1&ust=1710430998061000&source=images&cd=vfe&opi=89978449&ved=0CBMQjRxqFwoTCJCQnpLK8YQDFQAAAAAdAAAAABAE","Tiger", "Feline", 10);
        Animal animal2 = new Animal("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.fundacionaquae.org%2Fwiki%2Fconsejos-para-proteger-a-los-animales%2F&psig=AOvVaw1JcCZLCswYc1FLh6PC69W1&ust=1710430998061000&source=images&cd=vfe&opi=89978449&ved=0CBMQjRxqFwoTCJCQnpLK8YQDFQAAAAAdAAAAABAE","Panter", "Feline", 10);
        Animal animal3 = new Animal("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.fundacionaquae.org%2Fwiki%2Fconsejos-para-proteger-a-los-animales%2F&psig=AOvVaw1JcCZLCswYc1FLh6PC69W1&ust=1710430998061000&source=images&cd=vfe&opi=89978449&ved=0CBMQjRxqFwoTCJCQnpLK8YQDFQAAAAAdAAAAABAE","Elephant", "Feline", 10);

        animals.add(animal);
        animals.add(animal1);
        animals.add(animal2);
        animals.add(animal3);
    }
}