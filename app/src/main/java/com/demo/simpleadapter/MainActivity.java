package com.demo.simpleadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private String[] items = new String[]{"擦汗", "猪头", "玫瑰"};
    private int[] imgs = new int[]{R.mipmap.f006, R.mipmap.f007, R.mipmap.f008};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView= (ListView) findViewById(R.id.lv_list);
        // 简易适配器
        SimpleAdapter simpleAdapter = new SimpleAdapter(this, getData(), R.layout.layout_item, new String[]{"txt", "img"}, new int[]{R.id.tv, R.id.iv});

        listView.setAdapter(simpleAdapter);
    }


    private List<Map<String, Object>> getData() {
        List<Map<String, Object>> list = new ArrayList<Map<String,Object>>();
        for (int i = 0; i < items.length; i++) {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("txt", items[i]);
            map.put("img", imgs[i]);
            list.add(map);
        }
        return list;
    }
}
