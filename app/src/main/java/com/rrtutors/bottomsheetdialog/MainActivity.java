package com.rrtutors.bottomsheetdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.img_upload).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                PhotoBottomDialogFragment bottomDialogFragment=new PhotoBottomDialogFragment();
                bottomDialogFragment.show(getSupportFragmentManager(),"Pick Photo");
            }
        });
    }
}
