package org.richit.advancedrecyclerview.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import org.richit.advancedrecyclerview.Adapter.AppAdapter;
import org.richit.advancedrecyclerview.Model.App;
import org.richit.advancedrecyclerview.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<App> apps = new ArrayList<>();
    AppAdapter appAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        initObject();
        requiredTask();
        getData();
    }

    private void initObject() {
        recyclerView = findViewById( R.id.recViewtopChart );
        appAdapter = new AppAdapter( apps, this );
    }

    private void requiredTask() {
        recyclerView.setLayoutManager( new LinearLayoutManager( this ) );
        recyclerView.setAdapter( appAdapter );
    }

    private void getData() {
        apps.add( new App( "App", "Description" ) );
        apps.add( new App( "App", "Description" ) );
        apps.add( new App( "App", "Description" ) );
        apps.add( new App( "App", "Description" ) );
        apps.add( new App( "App", "Description" ) );
        apps.add( new App( "App", "Description" ) );
        apps.add( new App( "App", "Description" ) );
        appAdapter.notifyDataSetChanged();
    }
}