package com.jk.listviewusingbaseadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    Context context;
    String  countryList[];
    int flags[];
    LayoutInflater inflater;

    public CustomAdapter(Context context, String[] countryList, int[] flags) {
        this.context = context;
        this.countryList = countryList;
       this.flags = flags;
        inflater=(LayoutInflater.from(context));
    }

    @Override
    public int getCount() {
        return countryList.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView=inflater.inflate(R.layout.activity_listview_rows, null);
        TextView country=convertView.findViewById(R.id.textView);
        ImageView icon=convertView.findViewById(R.id.icon1);
        country.setText(countryList[position]);
        icon.setImageResource(flags[position]);
        return convertView;
    }
}