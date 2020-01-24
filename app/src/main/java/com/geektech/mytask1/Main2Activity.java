package com.geektech.mytask1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {
    EditText editText;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        editText=findViewById(R.id.editText);
        button=findViewById(R.id.SaveButton);

    }

    public void onClick(View view) {
        Intent intent=new Intent();
        intent.putExtra("InputText",editText.getText().toString());
        setResult(RESULT_OK,intent);
        finish();
    }
}
