package com.example.atvlikes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import com.example.atvlikes.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding tela = DataBindingUtil.setContentView(this, R.layout.activity_main);
        tela.setLifecycleOwner(this);

        LikesViewModel lk = new ViewModelProvider(this).get(LikesViewModel.class);
        tela.setVm(lk);
    }
}