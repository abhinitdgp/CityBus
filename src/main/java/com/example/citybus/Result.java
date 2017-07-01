package com.example.citybus;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.Menu;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
//import android.widget.LinearLayout.LayoutParams;
import java.util.*;

public class Result extends Activity
{
	String error;
	int n,i,dip;
	TableLayout table;
	LinearLayout ll;
	LinearLayout.LayoutParams param;
	TableRow.LayoutParams rowparam;
	TableLayout.LayoutParams tbparam;
	TextView tv;
	TableRow row;
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.result);
		
		
		table=(TableLayout)findViewById(R.id.table);
		rowparam=new TableRow.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
		
		tbparam=new TableLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
		tbparam.setMargins(5, 0, 5, 0);
		
		n=Integer.parseInt(getIntent().getStringExtra("n"));
		dip = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,
                (float) 1, getResources().getDisplayMetrics());
		if(n==0)
		{
			String data=getIntent().getStringExtra("error");
			AddTextView("ERROR", data, 200);
			
		}
		for(i=1;i<=n;i++)
		{
			String BUS = getIntent().getStringExtra("BUS"+i);
			AddTextView("BUS", BUS, 200);
			
			String FROM = getIntent().getStringExtra("FROM"+i);
			AddTextView("FROM", FROM, 200);
			
			String TO = getIntent().getStringExtra("TO"+i);
			AddTextView("TO", TO, 200);
			
			String ROUTE = getIntent().getStringExtra("ROUTE"+i);
			AddTextView("ROUTE", ROUTE, 150);
			
		}
	
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) 
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void AddTextView(String key,String value,int clr)
	{
		
		row = new TableRow(this);
	    TableRow row2 = new TableRow(this);
		TextView tv1 = new TextView(this);
		TextView tv2 = new TextView(this);
		tv1.append(" "+key+" :");
    	tv1.setTextSize(15);
    	tv1.setTextColor(Color.WHITE);
		tv2.setText(value);
    	tv2.setTextSize(15);
    	tv2.setTextColor(Color.WHITE);
    	row.setBackgroundColor(Color.argb(clr, 0, 0, 0));
    	row.addView(tv1);
    	row.addView(tv2);
    	table.addView(row, tbparam);
    	
	}
}

