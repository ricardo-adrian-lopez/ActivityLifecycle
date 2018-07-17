package com.mobileapps.training.activitylifecycleandintent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.mobileapps.training.activitylifecycleandintent.model.Person;
import com.mobileapps.training.activitylifecycleandintent.model.PersonP;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Person person = (Person) getIntent().getSerializableExtra("PERSON");
        PersonP personP = getIntent().getParcelableExtra("PERSONP");
        Toast.makeText(this, person.getName(), Toast.LENGTH_SHORT).show();
        Toast.makeText(this, personP.getAge(), Toast.LENGTH_SHORT).show();
    }
}
