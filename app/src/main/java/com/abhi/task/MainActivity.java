package com.abhi.task;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new MyAdapter(dataqueue());
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);
        adapter.notifyDataSetChanged();

    }


    public ArrayList<Model> dataqueue(){
        ArrayList<Model> holder = new ArrayList<>();

        Model obj1 = new Model();
        obj1.setBrandLogo(R.drawable.play_google);
        obj1.setBrandName("Google Play");
        obj1.setBrandStatus(R.drawable.mark);
        obj1.setBrandAmount("$38,456.78");
        obj1.setBrandDate("28.07.2018");
        obj1.setBrandStats("Complaint");
        holder.add(obj1);


        Model obj2 = new Model();
        obj2.setBrandLogo(R.drawable.twitter);
        obj2.setBrandName("Twitter");
        obj2.setBrandStatus(R.drawable.location);
        obj2.setBrandAmount("$1,550.60");
        obj2.setBrandDate("27.07.2018");
        obj2.setBrandStats("Received");
        holder.add(obj2);

        Model obj3 = new Model();
        obj3.setBrandLogo(R.drawable.youtube);
        obj3.setBrandName("YouTube");
        obj3.setBrandStatus(R.drawable.tick);
        obj3.setBrandAmount("$14,340.00");
        obj3.setBrandDate("27.07.2018");
        obj3.setBrandStats("Correct");
        holder.add(obj3);

        Model obj4 = new Model();
        obj4.setBrandLogo(R.drawable.dribble);
        obj4.setBrandName("Dribble");
        obj4.setBrandStatus(R.drawable.mark);
        obj4.setBrandAmount("$54,340.00");
        obj4.setBrandDate("27.07.2018");
        obj4.setBrandStats("Received");
        holder.add(obj4);

        Model obj5 = new Model();
        obj5.setBrandLogo(R.drawable.linkedin);
        obj5.setBrandName("LinkedIn");
        obj5.setBrandStatus(R.drawable.location);
        obj5.setBrandAmount("$50,340.00");
        obj5.setBrandDate("27.04.2018");
        obj5.setBrandStats("Correct");
        holder.add(obj5);


        return holder;
    }
}