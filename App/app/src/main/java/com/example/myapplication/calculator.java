package com.example.myapplication;


import android.os.Build;
import android.os.Bundle;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;




public class calculator extends Fragment implements View.OnClickListener {
View view;
    TextView previousCalculation;
    EditText display;




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
    public  void updateText(String strToAdd) {
        display.setText(strToAdd);
    }


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_calculator, container, false);
        //display
        previousCalculation=view.findViewById(R.id.previousCalculationView);
        display=view.findViewById(R.id.displayEditText);
        display.setShowSoftInputOnFocus(false);

       Button btn_two = view.findViewById(R.id.two);
       btn_two.setOnClickListener( this);

        Button btn_one = view.findViewById(R.id.one);
        btn_one.setOnClickListener( this);

        Button btn_three = view.findViewById(R.id.three);
        btn_three.setOnClickListener( this);

        Button btn_four = view.findViewById(R.id.four);
        btn_four.setOnClickListener( this);

        Button btn_five = view.findViewById(R.id.five);
        btn_five.setOnClickListener( this);

        Button btn_six = view.findViewById(R.id.six);
        btn_six.setOnClickListener( this);

        Button btn_seven = view.findViewById(R.id.seven);
        btn_seven.setOnClickListener( this);

        Button btn_eight = view.findViewById(R.id.eight);
        btn_eight.setOnClickListener( this);

        Button btn_nine = view.findViewById(R.id.nine);
        btn_nine.setOnClickListener( this);

        Button btn_zero = view.findViewById(R.id.zero);
        btn_zero.setOnClickListener( this);

        Button btn_dot = view.findViewById(R.id.dot);
        btn_dot.setOnClickListener( this);


        Button btn_plus = view.findViewById(R.id.plus);
        btn_plus.setOnClickListener( this);

        Button btn_minus = view.findViewById(R.id.minus);
        btn_minus.setOnClickListener( this);

        Button btn_multiply = view.findViewById(R.id.multiply);
        btn_multiply.setOnClickListener( this);

        Button btn_division = view.findViewById(R.id.division);
        btn_division.setOnClickListener( this);


        Button btn_firstBracket= view.findViewById(R.id.firstBracket);
        btn_firstBracket.setOnClickListener( this);

        Button btn_secondBracket= view.findViewById(R.id.secondBracket);
        btn_secondBracket.setOnClickListener( this);



        Button btn_clear= view.findViewById(R.id.clear);
        btn_clear.setOnClickListener( this);

        Button btn_equals = view.findViewById(R.id.equals);
        btn_equals.setOnClickListener( this);

        Button btn_backSpace = view.findViewById(R.id.backspace);
        btn_backSpace.setOnClickListener( this);





        return view;
    }




    public void onClick(View view) {
        switch(view.getId()){
            case R.id.one:
                updateText( view.getContext().getResources().getString(R.string._1));
                break;
            case R.id.two:
                updateText( view.getContext().getResources().getString(R.string._2));
                break;
            case R.id.three:
                updateText( view.getContext().getResources().getString(R.string._3));
                break;
            case R.id.four:
                updateText( view.getContext().getResources().getString(R.string._4));
                break;
            case R.id.five:
                updateText( view.getContext().getResources().getString(R.string._5));
                break;

            case R.id.six:
                updateText( view.getContext().getResources().getString(R.string._6));
                break;

            case R.id.seven:
                updateText( view.getContext().getResources().getString(R.string._7));
                break;
            case R.id.eight:
                updateText( view.getContext().getResources().getString(R.string._8));
                break;

            case R.id.nine:
                updateText( view.getContext().getResources().getString(R.string._9));
                break;
            case R.id.zero:
                updateText( view.getContext().getResources().getString(R.string._0));
                break;
            case R.id.firstBracket:
                updateText( view.getContext().getResources().getString(R.string.start_bracket));
                break;
            case R.id.secondBracket:
                updateText( view.getContext().getResources().getString(R.string.closing_bracket));
                break;
            case R.id.dot:
                updateText( view.getContext().getResources().getString(R.string.dot));
                break;


            case R.id.plus:
                updateText( view.getContext().getResources().getString(R.string.plus));
                break;
            case R.id.minus:
                updateText( view.getContext().getResources().getString(R.string.minus));
                break;
            case R.id.multiply:
                updateText( view.getContext().getResources().getString(R.string.x));
                break;
            case R.id.division:
                updateText( view.getContext().getResources().getString(R.string.division));
                break;

            case R.id.clear:
                updateText("");
                break;
        }

    }












}