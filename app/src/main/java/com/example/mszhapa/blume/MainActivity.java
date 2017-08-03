package com.example.mszhapa.blume;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void bookTable(View view) {


        Intent intent = new Intent(Intent.ACTION_SENDTO);
       String timeAndDate=" When would you like to reserve a table, and for how many people ?";
        String party = " If it is a party you want to host at ours, we'll gladly have you! Just write us down the number of people, and your wish of drinks, and we'll answer you promptly!";

        intent.setData(Uri.parse("mailto: table@blumecph.dk")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_SUBJECT, "Table reservation");
        intent.putExtra(Intent.EXTRA_TEXT, "Welcome! "+ timeAndDate + party);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }

    }
}
