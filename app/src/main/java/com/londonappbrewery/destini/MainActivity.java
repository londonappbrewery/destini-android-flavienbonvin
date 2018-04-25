package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private int mStoryLevel = 1;

    private Button mbuttonAns1;
    private Button mbuttonAns2;

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mbuttonAns1 = findViewById(R.id.buttonTop);
        mbuttonAns2 = findViewById(R.id.buttonBottom);

        mTextView = findViewById(R.id.storyTextView);


        mbuttonAns1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mStoryLevel == 1 || mStoryLevel == 2){
                    mTextView.setText(R.string.T3_Story);
                    mbuttonAns1.setText(R.string.T3_Ans1);
                    mbuttonAns2.setText(R.string.T3_Ans2);
                    mStoryLevel = 3;
                } else if (mStoryLevel == 3){
                    mTextView.setText(R.string.T6_End);
                    mbuttonAns1.setVisibility(View.GONE);
                    mbuttonAns2.setVisibility(View.GONE);
                }

            }
        });

        mbuttonAns2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mStoryLevel == 1) {
                    mTextView.setText(R.string.T2_Story);
                    mbuttonAns1.setText(R.string.T2_Ans1);
                    mbuttonAns2.setText(R.string.T2_Ans2);
                    mStoryLevel = 2;
                } else if (mStoryLevel == 2){
                    mTextView.setText(R.string.T4_End);
                    mbuttonAns1.setVisibility(View.GONE);
                    mbuttonAns2.setVisibility(View.GONE);
                } else if (mStoryLevel == 3){
                    mTextView.setText(R.string.T5_End);
                    mbuttonAns1.setVisibility(View.GONE);
                    mbuttonAns2.setVisibility(View.GONE);
                }
            }
        });
    }
}
