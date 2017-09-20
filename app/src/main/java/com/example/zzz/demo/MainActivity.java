package com.example.zzz.demo;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import static android.R.attr.data;

public class MainActivity extends AppCompatActivity {

    List<CityItem> cityList;
    RelativeLayout itmel;
    GridView gridView;
    SharedPreferences prefs;

    Button contactButton;
    Button submitButton;

    private List<News> newses=new ArrayList<News>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NewAdapter newAdapter=new NewAdapter(MainActivity.this,R.layout.news_layout,newses);
        ListView listView=(ListView)findViewById(R.id.news_liaotian);
        listView.setAdapter(newAdapter);

        LayoutInflater layoutInflater=(LayoutInflater)this.getSystemService(LAYOUT_INFLATER_SERVICE);
        gridView = (GridView) findViewById(R.id.grid);
        setData();
        setGridView();
        initFruits();
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "Click item" + i, Toast.LENGTH_SHORT).show();
                if(i==1){

                }
            }
        });


        contactButton=(Button)findViewById(R.id.contact_button);
        contactButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
            }
        });

        submitButton=(Button)findViewById(R.id.submit_button);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2=new Intent(MainActivity.this, Main3Activity.class);
                startActivity(intent2);
            }
        });
    }

    private void setGridView() {
        int size = cityList.size();
        int length = 100;
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        float density = dm.density;
        int gridviewWidth = (int) (size * (length + 4) * density);
        int itemWidth = (int) (length * density);

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                gridviewWidth, LinearLayout.LayoutParams.FILL_PARENT);
        gridView.setLayoutParams(params); // 设置GirdView布局参数,横向布局的关键
        gridView.setColumnWidth(itemWidth); // 设置列表项宽
        gridView.setHorizontalSpacing(5); // 设置列表项水平间距
        gridView.setStretchMode(GridView.NO_STRETCH);
        gridView.setNumColumns(size); // 设置列数量=列表集合数

        GridViewAdapter adapter = new GridViewAdapter(getApplicationContext(),
                cityList);
        gridView.setAdapter(adapter);
    }

    private void selectData(int Type){


    }


    private void setData() {
        cityList = new ArrayList<CityItem>();
        CityItem item = new CityItem();

        item.setCityName("全部");
        cityList.add(item);
        item = new CityItem();
        item.setCityName("考研");
        cityList.add(item);
        item = new CityItem();
        item.setCityName("雅思");
        cityList.add(item);
        item = new CityItem();
        item.setCityName("四级");
        cityList.add(item);
        item = new CityItem();
        item.setCityName("大二");
        cityList.add(item);
        item = new CityItem();
        item.setCityName("计算机学院");
        cityList.add(item);
        item = new CityItem();
        item.setCityName("机电学院");
        cityList.add(item);
        item = new CityItem();
        item.setCityName("娱乐");
        cityList.add(item);
        item = new CityItem();
        item.setCityName("地理");
        cityList.add(item);
        item = new CityItem();
        item.setCityName("生活");
        cityList.add(item);
        item = new CityItem();
        item.setCityName("教育");
        cityList.add(item);
        item = new CityItem();
        item.setCityName("其他");
        cityList.add(item);

        prefs=getSharedPreferences("book_type",MODE_PRIVATE);
        SharedPreferences.Editor editor=prefs.edit();

        editor.putString("BOOK_TYPE_0","全部");
        editor.putString("BOOK_TYPE_1","科技");
        editor.putString("BOOK_TYPE_2","青春");
        editor.putString("BOOK_TYPE_3","小说");
        editor.putString("BOOK_TYPE_4","文学");
        editor.putString("BOOK_TYPE_5","艺术");
        editor.putString("BOOK_TYPE_6","动漫");
        editor.putString("BOOK_TYPE_7","娱乐");
        editor.putString("BOOK_TYPE_8","地理");
        editor.putString("BOOK_TYPE_9","生活");
        editor.putString("BOOK_TYPE_10","教育");
        editor.putString("BOOK_TYPE_11","其他");
        editor.commit();

        cityList.addAll(cityList);
    }


    private void initFruits(){
        News apple=new News("求借","  《时间简史》--斯蒂芬·霍金",0,News.JIAOYU);
        newses.add(apple);
        News pear=new News("我有","《C++语言程序设计》--谭浩强",1,News.JIAOYU);
        newses.add(pear);
        News orange=new News("我有","《人间失格》--太宰治",1,News.WENXUE);
        newses.add(orange);
        News apple1=new News("求借","《中国地理》--中国地质大学出版社",1,News.DILI);
        newses.add(apple1);
        News pear1=new News("pear1","3",0,News.WENXUE);
        newses.add(pear1);
        News orange1=new News("orange1","3",1,News.WENXUE);
        newses.add(orange1);
        News apple2=new News("apple2","3",0,News.WENXUE);
        newses.add(apple2);
        News pear2=new News("pear2","3",0,News.WENXUE);
        newses.add(pear2);
        News orange3=new News("orange3","3",1,News.WENXUE);
        newses.add(orange3);
    }

}
