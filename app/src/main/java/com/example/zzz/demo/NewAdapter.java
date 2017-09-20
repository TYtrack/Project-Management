package com.example.zzz.demo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by zzz on 2017/9/5.
 */



public class NewAdapter extends ArrayAdapter <News>{
    private int resourceid;

    public NewAdapter(Context context, int textVi, List<News> objects){
        super(context,textVi,objects);
        resourceid=textVi;
    }

    class ViewHolder {
        LinearLayout leftLayout;
        LinearLayout rightLayout;
        TextView leftMsg;
        TextView rightMsg;
    }

    public View getView(int pos, View con, ViewGroup par)
    {
        View view= LayoutInflater.from(getContext()).inflate(resourceid,null);
        ViewHolder viewHolder=new ViewHolder();
        viewHolder.leftLayout = (LinearLayout)view.findViewById(R.id.borrow_id);
        viewHolder.rightLayout = (LinearLayout)view.findViewById(R.id.lend_id);
        News news=getItem(pos);

        TextView textView=(TextView)view.findViewById(R.id.news_title);
        TextView textView1=(TextView)view.findViewById(R.id.news_cont);
        textView.setText(news.getTitle());
        textView1.setText(news.getCont());

        TextView textView2=(TextView)view.findViewById(R.id.news_title_1);
        TextView textView3=(TextView)view.findViewById(R.id.news_cont_1);
        textView2.setText(news.getTitle());
        textView3.setText(news.getCont());

        if (news.getFlag()==News.BORROW_BOOK){
            viewHolder.leftLayout.setVisibility(View.VISIBLE);
            viewHolder.rightLayout.setVisibility(View.GONE);
        } else if(news.getFlag() == News.LEND_BOOK) {

            viewHolder.rightLayout.setVisibility(View.VISIBLE);
            viewHolder.leftLayout.setVisibility(View.GONE);
        }
        return view;
    }

}