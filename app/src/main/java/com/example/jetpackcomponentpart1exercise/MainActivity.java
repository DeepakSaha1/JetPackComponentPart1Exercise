package com.example.jetpackcomponentpart1exercise;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.jetpackcomponentpart1exercise.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private UserAdapter userAdapter;
    private RecyclerView recyclerView;
    private ActivityMainBinding binding;
    private UserModel userModel;
    List<UserModel> models;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // set layout view using data binding
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        models = new ArrayList<>();

        initRecyclerView();
        initData();
    }
//  setting recycler view as Linear layout list type
    private void initRecyclerView() {
        recyclerView = binding.recyclerViewList;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);

//      initiating UserAdapter and passig List<UserModel> obj to set the list inside the UserAdapter
        userAdapter = new UserAdapter(models);

        recyclerView.setAdapter(userAdapter);
    }
//    dummy data for recycle view
    private void initData() {
        userModel = new UserModel();
        userModel.setName("Deepak");
        userModel.setEmail("deepak.saha1@gmail.com");
        userModel.setNumber("9971895555");
        models.add(userModel);

        userModel = new UserModel();
        userModel.setName("Deepak1");
        userModel.setEmail("deepak.saha2@gmail.com");
        userModel.setNumber("9971895555");
        models.add(userModel);

        userModel = new UserModel();
        userModel.setName("Deepak3");
        userModel.setEmail("deepak.saha3@gmail.com");
        userModel.setNumber("9971895555");
        models.add(userModel);

        userModel = new UserModel();
        userModel.setName("Deepak4");
        userModel.setEmail("deepak.saha4@gmail.com");
        userModel.setNumber("9971895555");
        models.add(userModel);

        userModel = new UserModel();
        userModel.setName("Deepak5");
        userModel.setEmail("deepak.saha5@gmail.com");
        userModel.setNumber("9971895555");
        models.add(userModel);

        userModel = new UserModel();
        userModel.setName("Deepak6");
        userModel.setEmail("deepak.saha6@gmail.com");
        userModel.setNumber("9971895555");
        models.add(userModel);

        userModel = new UserModel();
        userModel.setName("Deepak");
        userModel.setEmail("deepak.saha1@gmail.com");
        userModel.setNumber("9971895555");
        models.add(userModel);

        userModel = new UserModel();
        userModel.setName("Deepak1");
        userModel.setEmail("deepak.saha2@gmail.com");
        userModel.setNumber("9971895555");
        models.add(userModel);

        userModel = new UserModel();
        userModel.setName("Deepak3");
        userModel.setEmail("deepak.saha3@gmail.com");
        userModel.setNumber("9971895555");
        models.add(userModel);

        userModel = new UserModel();
        userModel.setName("Deepak4");
        userModel.setEmail("deepak.saha4@gmail.com");
        userModel.setNumber("9971895555");
        models.add(userModel);

        userModel = new UserModel();
        userModel.setName("Deepak5");
        userModel.setEmail("deepak.saha5@gmail.com");
        userModel.setNumber("9971895555");
        models.add(userModel);

        userModel = new UserModel();
        userModel.setName("Deepak6");
        userModel.setEmail("deepak.saha6@gmail.com");
        userModel.setNumber("9971895555");
        models.add(userModel);
    }
}
