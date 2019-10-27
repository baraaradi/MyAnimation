package com.example.asus.myanimation;

import android.support.v4.view.animation.FastOutLinearInInterpolator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private ViewGroup transitionContainer;
    private Button btnStart;
    private TextView txtStatement;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnStart=findViewById(R.id.btnStart);
        txtStatement=findViewById(R.id.txtStatement);
        transitionContainer=(ViewGroup) findViewById(R.id.transitionContainer);

        btnStart.setOnClickListener(new View.OnClickListener()
        {
            boolean visible ;

            @Override
            public void onClick(View v)
            {
                TransitionManager.beginDelayedTransition(transitionContainer);
                visible=!visible;
                txtStatement.setVisibility(visible? View.VISIBLE :View.GONE);

            }
        });
    }
}
