package com.example.androidviikko9;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;


public class AddUserActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_view);
    }

    public void addUser(View view){
        EditText firstName = findViewById(R.id.editTextFirstName);
        EditText lastName = findViewById(R.id.editTextLastName);
        EditText email = findViewById(R.id.editTextEmail);
        RadioGroup fields = findViewById(R.id.fields);
        RadioButton field = findViewById(fields.getCheckedRadioButtonId());
        UserStorage.getInstance().addUser(new User(firstName.getText().toString(),lastName.getText().toString(), email.getText().toString(), field.getText().toString()));
    }
}
