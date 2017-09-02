package com.example.android.topenglishtrophycounter;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // chelsea global declaration for the 3 cups//

    int  ChelseaEpl = 0 ;
    int  ChelseaFa = 0 ;
    int  ChelseaCarling = 0 ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

// chelsea button calls

    public void addOneForChelseaEpl (View v){
        ChelseaEpl =  ChelseaEpl + 1 ;
        displayForChelseaEpl( ChelseaEpl);
    }

    public void addOneForChelseaFa (View v){
        ChelseaFa =  ChelseaFa + 1 ;
        displayForChelseaFa( ChelseaFa);
    }

    public void addOneForChelseaCarling (View v){
        ChelseaCarling =  ChelseaCarling + 1 ;
        displayForChelseaCarling( ChelseaCarling);
    }


    // button click display for chelsea
    public void displayForChelseaEpl(int score) {
        TextView scoreView = (TextView) findViewById(R.id.chelsea_epl_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForChelseaFa(int score) {
        TextView scoreView = (TextView) findViewById(R.id.chelsea_fa_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForChelseaCarling(int score) {
        TextView scoreView = (TextView) findViewById(R.id.chelsea_carling_score);
        scoreView.setText(String.valueOf(score));
    }









}
