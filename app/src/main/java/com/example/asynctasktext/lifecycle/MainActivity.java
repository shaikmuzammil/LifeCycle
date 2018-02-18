package com.example.asynctasktext.lifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"On Created",Toast.LENGTH_LONG).show();
        b=(Button)findViewById(R.id.next);
    }

    public void next(View view) {
        Intent i=new Intent(this,Main2Activity.class);
        startActivity(i);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this,"On started1",Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this,"On Resume1",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this,"On Restart1",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this,"On stop1",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"On destroy1",Toast.LENGTH_LONG).show();
    }
}
