package com.example.paras.assignment_81;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ListView listView1;
    private ArrayList<String> arrayListMonths;
    private Button buttonAsc;
    private Button buttonDesc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initializing list view and buttons.
        listView1 = (ListView) findViewById(R.id.listView1);
        buttonAsc = (Button) findViewById(R.id.buttonAsc);
        buttonDesc = (Button) findViewById(R.id.buttonDesc);

        //setting on click listener for buttons.
        buttonAsc.setOnClickListener(this);
        buttonDesc.setOnClickListener(this);


        arrayListMonths = new ArrayList<>();
        insertDataInListArray();  ///inserting months name in array list.

        // initializing Array adapter for array list of months.
        ArrayAdapter<String> arrayAdp = new ArrayAdapter<String>(this,
                android.R.layout.simple_expandable_list_item_1, arrayListMonths);
        listView1.setAdapter(arrayAdp);     // connecting adapter to list view.


    }

    private void insertDataInListArray() {

        //inserting data into array list of months.
        arrayListMonths.add("January");
        arrayListMonths.add("February");
        arrayListMonths.add("March");
        arrayListMonths.add("April");
        arrayListMonths.add("May");
        arrayListMonths.add("June");
        arrayListMonths.add("July");
        arrayListMonths.add("August");
        arrayListMonths.add("September");
        arrayListMonths.add("October");
        arrayListMonths.add("November");
        arrayListMonths.add("December");
    }

    @Override
    public void onClick(View view) {

        // checking which button is clicked.
        switch (view.getId()){
            case R.id.buttonAsc:
                Collections.sort(arrayListMonths);  // Sorting array list in ascending order.
                // initializing Array adapter for array list of months.
                ArrayAdapter<String> arrayAdpAsc = new ArrayAdapter<String>(this,
                        android.R.layout.simple_expandable_list_item_1, arrayListMonths);
                listView1.setAdapter(arrayAdpAsc);  // connecting adapter to list view.
                break;


            case R.id.buttonDesc:
                Collections.sort(arrayListMonths,Collections.reverseOrder()); // Sorting array list in descending order.
                // initializing Array adapter for array list of months.
                ArrayAdapter<String> arrayAdpDesc = new ArrayAdapter<String>(this,
                        android.R.layout.simple_expandable_list_item_1, arrayListMonths);
                listView1.setAdapter(arrayAdpDesc);  // connecting adapter to list view.
                break;
        }
    }
}
