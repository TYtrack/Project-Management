package com.example.zzz.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {

    private List<Contact> contactList=new ArrayList<Contact>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initUser();
        UserAdapter users=new UserAdapter(Main2Activity.this,R.layout.contact_layout_item,contactList);
        ListView listView=(ListView)findViewById(R.id.list_view_contact);
        listView.setAdapter(users);
    }
    private void initUser(){
        Contact A=new Contact("Tom",R.drawable.bilibili);
        contactList.add(A);
        Contact B=new Contact("Jerry",R.drawable.bilibili);
        contactList.add(B);
        Contact C=new Contact("Richard",R.drawable.bilibili);
        contactList.add(C);
        Contact D=new Contact("Bob",R.drawable.bilibili);
        contactList.add(D);

    }
}
