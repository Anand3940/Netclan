package com.example.netclan;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
ArrayList<IndoModel> list=new ArrayList<>();
boolean invite=false;
private SearchView searchView;
    RecyclerIndoAdapter adapter=new RecyclerIndoAdapter(this,list);
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView=(RecyclerView)findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        String aboutus="Hi Community i am open to new Connections";
        list.add(new IndoModel(R.drawable.user_img,"Radhika Yadav","Bhopal | Software Engineer",
                "Within 200-300 m",10,"Coffee | Business |Friendship",aboutus));
        list.add(new IndoModel(R.drawable.user_img,"Aditya Soni", "Kanpur | Fresher",
                "Within 700-800 m",40,"Coffee | Business |Friendship",aboutus));
        list.add(new IndoModel(R.drawable.user_img,"Devesh nankani","Gurugram | Student",
                "Within 1 KM",35,"Business |Friendship",aboutus));
        list.add(new IndoModel(R.drawable.user_img,"Anuj Arora","Kanpur | Student",
                "Within 2 KM",15,"Coffee | Friendship",aboutus));
        list.add(new IndoModel(R.drawable.user_img,"Anuj Gangwar","Barelli | Student",
                "Within 5 KM",22,"Friendship",aboutus));
        list.add(new IndoModel(R.drawable.user_img,"Kushaal Singh","Faridabad | Student",
                "Within 10 KM",55,"Coffee | Friendship",aboutus));
        list.add(new IndoModel(R.drawable.user_img,"Punam Gupta","Bihar | Student",
                "Within 200 KM",45,"Coffee | Friendship | Matrimonial",aboutus));
        list.add(new IndoModel(R.drawable.user_img,"Ajay Gupta","Mumbai | Deigner",
                "Within 20 M",85,"Coffee | Friendship | Brotherhood",aboutus));
        list.add(new IndoModel(R.drawable.user_img,"Rohit Singh","Kanpur | Student",
                "Within 1 KM",85,"Coffee | Friendship",aboutus));
        list.add(new IndoModel(R.drawable.user_img,"Abhishek Bindra","New Delhi | Student",
                "Within 2 KM",48,"Friendship | Mentor",aboutus));
        list.add(new IndoModel(R.drawable.user_img,"Akashay Arora","Lucknow | Developer",
                "Within 700-900 m",48,"Coffee ",aboutus));

        recyclerView.setAdapter(adapter);

        searchView=(SearchView) findViewById(R.id.search_view);
        searchView.clearFocus();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                filterText(newText);
                return false;
            }
        });

    }

    private void filterText(String newText) {
        ArrayList<IndoModel> filteredList=new ArrayList<>();
        for(IndoModel indoModel:list){
            if(indoModel.getName().toLowerCase().contains(newText.toLowerCase())){
                filteredList.add(indoModel);
            }
        }
        if(filteredList.isEmpty()){
            Toast.makeText(this,"No Data Found",Toast.LENGTH_SHORT).show();
        }
        else{
            adapter.setFilteredData(filteredList);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        final MenuItem itemMyProfile = menu.findItem(R.id.refine);
        final Menu finalMenu = menu;
        itemMyProfile.getActionView().setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View v)
        {
            Intent i=new Intent(MainActivity.this,refine_activity.class);
            startActivity(i);
        }
        });
        return true;
    }
}