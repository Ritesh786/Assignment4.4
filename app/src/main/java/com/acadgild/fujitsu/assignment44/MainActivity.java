
package com.acadgild.fujitsu.assignment44;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView mgridview;

    private Adapter mNameAdapter;

    private ArrayList<PojoClass> dummydata;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mgridview  = (GridView) findViewById(R.id.gridview);

        dummydata = new ArrayList<>();
        PojoClass c1 = new PojoClass(R.drawable.eye,"EYE");
        PojoClass c2 = new PojoClass(R.drawable.bookfirst,"BOOK3");
        PojoClass c3 = new PojoClass(R.drawable.booksec,"BOOK2");
        PojoClass c4 = new PojoClass(R.drawable.bookthird,"BOOK1");
        PojoClass c5 = new PojoClass(R.drawable.eone,"EXAMS");
        PojoClass c6 = new PojoClass(R.drawable.hone,"HOME");


        dummydata.add(c1);
        dummydata.add(c2);
        dummydata.add(c3);
        dummydata.add(c4);
        dummydata.add(c5);
        dummydata.add(c6);

        mNameAdapter = new Adapter(MainActivity.this, dummydata);

        mgridview.setAdapter(mNameAdapter);


    }
}
