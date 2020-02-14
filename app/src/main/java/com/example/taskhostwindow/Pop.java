package com.example.taskhostwindow;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.EditText;

import androidx.annotation.Nullable;

import static com.example.taskhostwindow.R.layout.popwindow;

class Pop extends Activity {

    EditText t= (EditText) findViewById(R.id.editText);

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(popwindow);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int)(width*.8),(int)(height*.6));

    }
}
