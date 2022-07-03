package com.example.myapplication;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
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
        //display
        previousCalculation=view.findViewById(R.id.previousCalculationView);
        display=view.findViewById(R.id.displayEditText);





    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_calculator, container, false);






        return view;
    }

    private void updateText(String strToAdd) {
        display.setText(strToAdd);
    }
    public void zeroBTNPush(View view) {
        updateText(getView().getResources().getString(R.string._0));
    }

    public void oneBTNPush(View view) {
        updateText(getView().getResources().getString(R.string._1));
    }

    public void twoBTNPush(View view) {
        updateText(getView().getResources().getString(R.string._2));
    }

    public void threeBTNPush(View view) {
        updateText(getView().getResources().getString(R.string._3));
    }

    public void fourBTNPush(View view) {
        updateText(getView().getResources().getString(R.string._4));
    }

    public void fiveBTNPush(View view) {
        updateText(getView().getResources().getString(R.string._5));
    }

    public void sixBTNPush(View view) {

        updateText(getView().getResources().getString(R.string._6));
    }

    public void sevenBTNPush(View view) {
        updateText(getView().getResources().getString(R.string._7));
    }

    public void eightBTNPush(View view) {
        updateText(getView().getResources().getString(R.string._8));
    }

    public void nineBTNPush(View view) {
        updateText(getView().getResources().getString(R.string._9));
    }

    public void dotBTNPush(View view) {
        updateText(getView().getResources().getString(R.string.dot));
    }



    public void plusBTNPush(View view) {
        updateText(getView().getResources().getString(R.string.plus));
    }

    public void minusBTNPush(View view) {
        updateText(getView().getResources().getString(R.string.minus));
    }

    public void multiplyBTNPush(View view) {
        updateText(getView().getResources().getString(R.string.x));
    }

    public void divisionBTNPush(View view) {
        updateText(getView().getResources().getString(R.string.division));
    }

    public void firstBracketBTNPush(View view) {
        updateText(getView().getResources().getString(R.string.start_bracket));
    }

    public void secondBracketBTNPush(View view) {
        updateText(getView().getResources().getString(R.string.closing_bracket));
    }



    public void clearBTNPush(View view) {

    }
    public void backspaceBTNPush(View view) {

    }
    public void equalBTNPush(View view) {

    }



}