package com.example.first_try_lab2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Date;

public class HistoryPageActivity <onClick> extends AppCompatActivity implements View.OnClickListener {


    //make another array list to store get intent message then checking the new array list is empty, if yes set text view as visable. in xml layout textview is invisable by default
    //when history list has value set adaptor


 ArrayList<HistoryModel> listOfProductHistory = new ArrayList<HistoryModel>();

 RecyclerView historyRecycler = new RecyclerView(getApplicationContext());
@Override
 protected void onCreate(Bundle savedInstanceState) {
  super.onCreate(savedInstanceState);
  setContentView(R.layout.activity_history_page);




// HistoryAdaptor adapter = new HistoryAdaptor(getApplicationContext(), listOfProductHistory);
// historyRecycler.setAdapter(adapter);
//        historyRecycler.setOnClickListener(this);
}

 @Override
 public void onClick(View v) {

 }
}
