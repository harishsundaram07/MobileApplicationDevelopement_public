// Assignment : Homework 04
//File Name : HW04;
//Full name of the student : HARIKRISHNAN SUNDARAM  & MALHAR JOSHI
package com.example.groupb09hw04;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements FragmentInterface{
    

    public static final String fragment="Fragment";
    DataServices.Account mainaccount;
    public static final String key="KEY";
    int counter=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction().add(R.id.mainContainer,new LoginFragment(),fragment).commit();


    }

    @Override
    public void home() {
        mainaccount=null;
        //TODO
        getSupportFragmentManager().popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);
        getSupportFragmentManager().beginTransaction().replace(R.id.mainContainer,new LoginFragment(),fragment).commit();
    }

    @Override
    public void goProfile(String token) {
        getSupportFragmentManager().popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);
        getSupportFragmentManager().beginTransaction().replace(R.id.mainContainer, CategoriesFragment.newInstance(token),fragment).commit();

    }



    @Override
    public void goRegister() {
        getSupportFragmentManager().beginTransaction().replace(R.id.mainContainer,new RegisterFragment(),fragment).addToBackStack(null).commit();
    }

    @Override
    public void goAppList(String category, String token) {
        getSupportFragmentManager().beginTransaction().replace(R.id.mainContainer,AppListFragment.newInstance(token,category),fragment).addToBackStack(null).commit();
    }

    @Override
    public void goAppDetails(DataServices.App app) {
        getSupportFragmentManager().beginTransaction().replace(R.id.mainContainer,AppDetailsFragment.newInstance(app),fragment).addToBackStack(null).commit();
    }


}