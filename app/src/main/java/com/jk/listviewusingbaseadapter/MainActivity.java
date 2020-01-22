package com.jk.listviewusingbaseadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.media.session.PlaybackState;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView simpleListView;
            String countryList[]=
                    {
                            "Iraq",
                            "USA",
                            "Canada",
                            "France",
                            "UK"
                    };

            int flags []=
                    {
                            R.drawable.iraq,
                            R.drawable.usa,
                            R.drawable.canada,
                            R.drawable.france,
                            R.drawable.uk
                    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        simpleListView=findViewById(R.id.listView);
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), countryList,flags);
        simpleListView.setAdapter(customAdapter);
    }
}
