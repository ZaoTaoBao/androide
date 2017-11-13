package org.uab.dedam.todoman;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        if (savedInstanceState == null) {

            FragmentManager manager = getFragmentManager();
            FragmentTransaction transaction = manager.beginTransaction();

            NewTaskFragment newTaskFragment = new NewTaskFragment();
            /*
            if (findViewById(R.id.fragment_new_task) != null) {
                transaction.add(R.id.fragment_main, new MainFragment());
                transaction.add(R.id.fragment_new_task,
                        newTaskFragment);
            }

            else {
                transaction.add(R.id.fragment_main, newTaskFragment);
            }
            */
            transaction.commit();
        }
    }
}
