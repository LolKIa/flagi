package com.example.flagi;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) this.findViewById(R.id.listViews);

        ArrayList<DataFlags> list = new ArrayList<>();
        list.clear();

        list.add(new DataFlags(R.drawable.ru, R.string.russian, R.string.russianRUB, R.string.capital1));
        list.add(new DataFlags(R.drawable.af, R.string.africa, R.string.africaZAR, R.string.capital2));
        list.add(new DataFlags(R.drawable.sg, R.string.singapore, R.string.singaporeSGD, R.string.capital3));
        list.add(new DataFlags(R.drawable.tr, R.string.turkish, R.string.turkishTRY, R.string.capital4));
        list.add(new DataFlags(R.drawable.jp, R.string.japon, R.string.japonJPY, R.string.capital5));
        list.add(new DataFlags(R.drawable.de, R.string.deutschland, R.string.germanEUR, R.string.capital6));
        list.add(new DataFlags(R.drawable.al, R.string.albanien, R.string.albanienALL, R.string.capital7));

        MyListAdapter myListAdaptery = new MyListAdapter(this, list);
        listView.setAdapter(myListAdaptery);
    }

}