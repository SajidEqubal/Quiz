package com.shadspace.quiz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Home extends AppCompatActivity {


    CardView card_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        card_view = findViewById(R.id.card_view);
        // card_view.setCardBackgroundColor(ContextCompat.getColor(this, R.color.white));
    }


    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.option_one:
                if (checked)

                    break;
            case R.id.option_two:
                if (checked)

                    break;

            case R.id.option_three:
                if (checked)

                    break;
            case R.id.option_four:
                if (checked)

                    break;
        }
    }
}