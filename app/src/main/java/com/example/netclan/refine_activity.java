package com.example.netclan;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class refine_activity extends AppCompatActivity {
    boolean iscolor ,iscolor2,iscolor3,iscolor4= true;
    boolean iscolor5 ,iscolor6,iscolor7,iscolor8= true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_refine);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        spinner();

        TextView mTextView;
        EditText mEditText;
        mTextView=(TextView) findViewById(R.id.textlength);
        mEditText=(EditText) findViewById(R.id.editText);
        mEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) { }
            @Override
            public void afterTextChanged(Editable s) {
                int length=mEditText.getText().length();
                String l=String.valueOf(length);
                l=l+"/250";
                mTextView.setText(l);
            }
        });

        SeekBar seek_Bar = (SeekBar)findViewById(R.id.seekBar);
        seek_Bar.setMax(100);
        seek_Bar.getProgressDrawable().setColorFilter(Color.rgb(20,61,89), PorterDuff.Mode.SRC_IN);
        seek_Bar.getThumb().setColorFilter(Color.rgb(20,61,89), PorterDuff.Mode.SRC_IN);
        TextView txt=(TextView)findViewById(R.id.txt);
        seek_Bar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if (fromUser) {
                    if (progress >= 0 && progress <= seek_Bar.getMax()) {

                        String progressString = String.valueOf(progress );
                        txt.setText(progressString); // the TextView Reference
                        seekBar.setSecondaryProgress(progress);
                    }
                }

            }
        });


    }

    private void spinner() {
        Spinner spinner;
        final String[] paths = {"Available | Hey Let Us Connect",
                                "Away| Stay Discrete and Watch",
                                "Busy | Do Not Disturb | Will Catch Up Later",
                                "SOS | Emergency! Need Assistance |Help"};
        spinner = (Spinner)findViewById(R.id.spinner);
        ArrayAdapter<String>adapter = new ArrayAdapter<String>(refine_activity.this,
                android.R.layout.simple_spinner_item,paths);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        Button coffee = (Button) findViewById(R.id.coffee);
        coffee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!iscolor)
                {
                    coffee.setBackgroundColor(Color.rgb(20,61,89));
                    iscolor = true;
                }
                else
                {
                    coffee.setBackgroundColor(Color.WHITE);
                    iscolor = false;
                }

            }
        });

        Button business=(Button)findViewById(R.id.business);
        business.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!iscolor2)
                {
                    business.setBackgroundColor(Color.rgb(20,61,89));
                    iscolor2 =true;
                }
                else
                {
                    business.setBackgroundColor(Color.WHITE);
                    iscolor2 = false;
                }

            }
        });

        Button hobbies=(Button)findViewById(R.id.hobbies);
        hobbies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!iscolor3)
                {
                    hobbies.setBackgroundColor(Color.rgb(20,61,89));
                    iscolor3 = true;
                }
                else
                {
                    hobbies.setBackgroundColor(Color.WHITE);
                    iscolor3 = false;
                }

            }
        });

        Button friendship=(Button)findViewById(R.id.friendship);
        friendship.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!iscolor4)
                {
                    friendship.setBackgroundColor(Color.rgb(20,61,89));
                    iscolor4 = true;
                }
                else
                {
                    friendship.setBackgroundColor(Color.WHITE);
                    iscolor4 = false;
                }

            }
        });

        Button movies=(Button)findViewById(R.id.movies);
        movies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!iscolor5)
                {
                    movies.setBackgroundColor(Color.rgb(20,61,89));
                    iscolor5 = true;
                }
                else
                {
                    movies.setBackgroundColor(Color.WHITE);
                    iscolor5 = false;
                }

            }
        });

        Button dinning=(Button)findViewById(R.id.dinning);
        dinning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!iscolor6)
                {
                    dinning.setBackgroundColor(Color.rgb(20,61,89));
                    iscolor6 = true;
                }
                else
                {
                    dinning.setBackgroundColor(Color.WHITE);
                    iscolor6 = false;
                }

            }
        });

        Button dating=(Button)findViewById(R.id.dating);
        dating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!iscolor7)
                {
                    dating.setBackgroundColor(Color.rgb(20,61,89));
                    iscolor7 = true;
                }
                else
                {
                    dating.setBackgroundColor(Color.WHITE);
                    iscolor7 = false;
                }

            }
        });

        Button matrimonial=(Button)findViewById(R.id.matrimonial);
        matrimonial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!iscolor8)
                {
                    matrimonial.setBackgroundColor(Color.rgb(20,61,89));
                    iscolor8 = true;
                }
                else
                {
                    matrimonial.setBackgroundColor(Color.WHITE);
                    iscolor8 = false;
                }

            }
        });

        Button saveexplore=(Button)findViewById(R.id.saveandexplore);
        saveexplore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                // todo: goto back activity from here

                finish();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}