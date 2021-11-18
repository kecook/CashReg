package com.example.first_try_lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class ManagerPanelActivity extends AppCompatActivity {
    ArrayList<HistoryModel> productHistory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manager_panal);
    }
}