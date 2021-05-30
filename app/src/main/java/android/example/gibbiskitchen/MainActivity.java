package android.example.gibbiskitchen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private FloatingActionButton floatingActionButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        floatingActionButton = findViewById(R.id.chat);
        floatingActionButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this,getString(R.string.tooltip),Toast.LENGTH_LONG).show();
    }
}