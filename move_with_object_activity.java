package com.example.parcelable;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class move_with_object_activity extends AppCompatActivity{
    public static String EXTRA_PERSON = "extra_person";
    public TextView tvObject;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_with_object);
        tvObject = findViewById(R.id.tv_object_received);
        Person mPerson = getIntent().getParcelableExtra(EXTRA_PERSON);
        String text = "Name : " + mPerson.getName() + ", Email : " + mPerson.getEmail() + ", Age : " + mPerson.getAge()
                + ", Location : " + mPerson.getCity();
        tvObject.setText(text);
    }
}
