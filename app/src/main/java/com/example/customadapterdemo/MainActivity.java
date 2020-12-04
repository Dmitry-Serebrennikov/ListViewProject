package com.example.customadapterdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import com.google.gson.Gson;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class MainActivity extends AppCompatActivity {

    UserListAdapter adapter;
    ListView listView;
    ArrayList<User> users;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.list);
        InputStream stream = getResources().openRawResource(R.raw.users);
        Gson gson = new Gson();
        User[] users_arr = gson.fromJson(new InputStreamReader(stream), User[].class);

        users = new ArrayList<>(Arrays.asList(users_arr));
        Log.d("mytag", "users: " + users_arr.length);


        adapter = new UserListAdapter(this, users);

        listView.setAdapter(adapter);
    }
    public void onClickPhone(View view) {
        Collections.sort(users, new PhoneComp());
        adapter.notifyDataSetChanged();
    }

    public void onClickName(View view) {
        Collections.sort(users, new NameComp());
        adapter.notifyDataSetChanged();
    }

    public void onClickSex(View view) {
        Collections.sort(users, new SexComp());
        adapter.notifyDataSetChanged();
    }
}
