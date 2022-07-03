package com.example.myapplication;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ResourceBundle;


public class calculator extends Fragment {
View view;
    TextView previousCalculation;
    EditText display;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_calculator, container, false);
        //display
        previousCalculation=view.findViewById(R.id.previousCalculationView);
        display=view.findViewById(R.id.displayEditText);
      return view;
    }
    private void updateText(String strToAdd) {
        display.setText(strToAdd);
    }








}