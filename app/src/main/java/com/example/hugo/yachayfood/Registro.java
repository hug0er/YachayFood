package com.example.hugo.yachayfood;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

public class Registro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        Switch switchButton = (Switch) findViewById(R.id.switch_vendedor);
        final TextView textView = (TextView) findViewById(R.id.textSi);

        switchButton.setChecked(true);
        switchButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean bChecked) {
                if (bChecked) {
                    textView.setText("Si");
                } else {
                    textView.setText("No");
                }
            }
        });


    }
}
