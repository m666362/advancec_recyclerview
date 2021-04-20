package org.richit.advancedrecyclerview.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import org.richit.advancedrecyclerview.Adapter.AgeAppAdapter;
import org.richit.advancedrecyclerview.Adapter.RecommendedAppAdapter;
import org.richit.advancedrecyclerview.Model.App;
import org.richit.advancedrecyclerview.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recommendedRV;
    RecyclerView ageRV;

    ArrayList<App> apps = new ArrayList<>();

    RecommendedAppAdapter recommendedAppAdapter;
    AgeAppAdapter ageAppAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        initObject();
        requiredTask();
        getData();
    }

    private void initObject() {
        recommendedRV = findViewById( R.id.recViewtopChart );
        ageRV = findViewById( R.id.ageRV );
        recommendedAppAdapter = new RecommendedAppAdapter( apps, this );
        ageAppAdapter = new AgeAppAdapter( apps, this );
    }

    private void requiredTask() {
        recommendedRV.setLayoutManager( new LinearLayoutManager( this ) );
        recommendedRV.setAdapter( recommendedAppAdapter );

        ageRV.setLayoutManager( new LinearLayoutManager( getApplicationContext(), RecyclerView.HORIZONTAL, false ) );
        ageRV.setAdapter( ageAppAdapter );
    }

    private void getData() {
        apps.add( new App( "App", "Description" ) );
        apps.add( new App( "App", "Description" ) );
        apps.add( new App( "App", "Description" ) );
        apps.add( new App( "App", "Description" ) );
        apps.add( new App( "App", "Description" ) );
        apps.add( new App( "App", "Description" ) );
        apps.add( new App( "App", "Description" ) );
        apps.add( new App( "App", "Description" ) );
        apps.add( new App( "App", "Description" ) );
        apps.add( new App( "App", "Description" ) );
        apps.add( new App( "App", "Description" ) );
        apps.add( new App( "App", "Description" ) );
        apps.add( new App( "App", "Description" ) );
        apps.add( new App( "App", "Description" ) );
        apps.add( new App( "App", "Description" ) );
        apps.add( new App( "App", "Description" ) );
        apps.add( new App( "App", "Description" ) );
        apps.add( new App( "App", "Description" ) );
        apps.add( new App( "App", "Description" ) );
        apps.add( new App( "App", "Description" ) );
        apps.add( new App( "App", "Description" ) );
        apps.add( new App( "App", "Description" ) );
        apps.add( new App( "App", "Description" ) );
        apps.add( new App( "App", "Description" ) );
        apps.add( new App( "App", "Description" ) );
        recommendedAppAdapter.notifyDataSetChanged();
        ageAppAdapter.notifyDataSetChanged();
    }
}