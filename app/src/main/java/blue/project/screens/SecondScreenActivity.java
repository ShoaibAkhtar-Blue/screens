package blue.project.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class SecondScreenActivity extends AppCompatActivity {
    private SeekBar heightSeekBar;
    private SeekBar weightSeekBar;
    private TextView heightTextView;
    private TextView weightTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);

        // Hide action bar
        getSupportActionBar().hide();

        // Initialize views
        initViews();

        heightSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                heightTextView.setText(String.valueOf(i) + " cm");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        weightSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                weightTextView.setText(String.valueOf(i) + " kg");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    private void initViews() {
        heightSeekBar = findViewById(R.id.seekBar_height);
        weightSeekBar = findViewById(R.id.seekBar_weight);

        heightTextView = findViewById(R.id.textView_height);
        heightTextView.setText(String.valueOf(heightSeekBar.getProgress()) + " cm");

        weightTextView = findViewById(R.id.textView_weight);
        weightTextView.setText(String.valueOf(weightSeekBar.getProgress()) + " kg");
    }
}