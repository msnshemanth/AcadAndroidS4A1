package com.example.hemanth.s4assign1;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static android.R.attr.left;
import static android.R.attr.right;
import static com.example.hemanth.s4assign1.R.id.activity_main;
import static com.example.hemanth.s4assign1.R.id.button;
import static com.example.hemanth.s4assign1.R.id.list1;

public class MainActivity extends AppCompatActivity {

    ArrayList data = new ArrayList();
    ListView listView;
    ArrayAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView)findViewById(R.id.list1);
         data = new ArrayList();
        data.add("January");
        data.add("Febraury");
        data.add("March");
        data.add("April");
        data.add("May");
        data.add("June");
        data.add("July");
        data.add("August");
        data.add("September");
        data.add("October");
        data.add("November");
        data.add("December");

        adapter = new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,data);

        listView.setAdapter(adapter);


    }





    public void ascen(View v){


        Collections.sort(data);
        adapter.notifyDataSetChanged();

        Toast t = Toast.makeText(this,"Ascending",Toast.LENGTH_SHORT);
        t.show();

    }

    public void desec(View v){
        Collections.sort(data, Collections.reverseOrder());
        adapter.notifyDataSetChanged();

        Toast.makeText(this,"Desending",Toast.LENGTH_SHORT).show();
    }


}



