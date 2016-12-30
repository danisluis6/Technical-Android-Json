package com.example.enclaveit.json;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private String TAG = MainActivity.class.getSimpleName();
    private ProgressDialog pDialog;
    private ListView listView;

    private String URL = "http://api.androidhive.info/contacts/";
    private ArrayList<HashMap<String, String>> contactList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar)this.findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(R.mipmap.ic_launcher);
        this.setSupportActionBar(toolbar);

        contactList = new ArrayList<>();

        addOnListener();
    }

    private void addOnListener() {
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Ok",Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_menu, menu);
        return true;
    }
}
