package com.example.zzz.demo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by zzz on 2017/9/14.
 */

public class UserAdapter extends ArrayAdapter<Contact> {
    private int resourceid;
    public UserAdapter(Context context, int textVi, List<Contact> objects){
        super(context,textVi,objects);
        resourceid=textVi;
    }

    public View getView(int pos, View con, ViewGroup par)
    {
        Contact contact=getItem(pos);
        View view= LayoutInflater.from(getContext()).inflate(resourceid,null);
        TextView textView=(TextView)view.findViewById(R.id.username);
        textView.setText(contact.getName());
        ImageView imageView=(ImageView)view.findViewById(R.id.touxiang);
        imageView.setImageResource(contact.getImageId());
        return view;
    }
}
