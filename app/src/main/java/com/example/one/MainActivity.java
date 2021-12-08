package com.example.one;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    /*@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_activity_main);
    }*/

    protected FloatingActionButton fab;
    protected FloatingActionButton fab1;
    protected FloatingActionButton fab2;
    protected FloatingActionButton fab3;

    private boolean isFABOpen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.fab = (FloatingActionButton) findViewById(R.id.Fab);
        this.fab1 = (FloatingActionButton) findViewById(R.id.Fab1);
        this.fab2 = (FloatingActionButton) findViewById(R.id.Fab2);
        this.fab3 = (FloatingActionButton) findViewById(R.id.Fab3);

        this.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isFABOpen){
                    showFABMenu();
                } else{
                    closeFABMenu();
                }
            }
        });
    }

    private void showFABMenu(){
        isFABOpen=true;
        fab1.animate().translationY(-getResources().getDimension(R.dimen.standard_55));
        fab2.animate().translationY(-getResources().getDimension(R.dimen.standard_105));
        fab3.animate().translationY(-getResources().getDimension(R.dimen.standard_155));
    }

    private void closeFABMenu(){
        isFABOpen=false;
        fab1.animate().translationY(0);
        fab2.animate().translationY(0);
        fab3.animate().translationY(0);
    }
}