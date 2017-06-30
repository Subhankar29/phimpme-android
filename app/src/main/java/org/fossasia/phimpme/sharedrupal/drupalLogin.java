package org.fossasia.phimpme.sharedrupal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.fossasia.phimpme.R;

public class drupalLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drupal_login);
        getActionBar().setTitle("Drupal Login");
    }
}
