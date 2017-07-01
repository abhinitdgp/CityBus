package com.example.citybus;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

public class BusEnquiry extends Activity implements OnClickListener
{
	Button b1;
	AutoCompleteTextView searchBus;
	LinearLayout ll;
	TableLayout table;
	LinearLayout.LayoutParams param;
	TableRow.LayoutParams rowparam;
	TableLayout.LayoutParams tbparam;
	String busno;
	TextView tv;
	TableRow row;
	String data,from,to;
	CityData db = new CityData();
	int n,dip;
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_bus_enquiry);
		
		table=(TableLayout)findViewById(R.id.table2);
		rowparam=new TableRow.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
		tbparam=new TableLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
		tbparam.setMargins(5, 0, 5, 0);
		
		//n=Integer.parseInt(getIntent().getStringExtra("n"));
		dip = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,
                (float) 1, getResources().getDisplayMetrics());
                
                
		ArrayAdapter localArrayAdapter = new ArrayAdapter<String>(this,R.layout.list_detail,db.getAllRoute());
	    this.searchBus = (AutoCompleteTextView)findViewById(R.id.searchBusin);
	    this.searchBus.setAdapter(localArrayAdapter);
	    //tv = (TextView)findViewById(R.id.searchview);
		b1 = (Button)findViewById(R.id.searchbutton);
		b1.setOnClickListener(this);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.bus_enquiry, menu);
		return true;
	}

	@Override
	public void onClick(View v) 
	{
		// TODO Auto-generated method stub
		busno = searchBus.getText().toString();
		if(busno.equalsIgnoreCase("")==true)
		{
			Toast.makeText(BusEnquiry.this, "Enter a Bus name", Toast.LENGTH_SHORT).show();
		}
		else
		{
			Log.d("Busname", busno);
			int i=db.getRouteNo(busno);
			if(i==-1)
			{
				Toast.makeText(BusEnquiry.this, "Invalid Bus name", Toast.LENGTH_SHORT).show();
			}
			else
			{
				table.removeAllViews();
				from=db.getFirstStop(i);
				to=db.getLastStop(i);
				AddTextView("BUS",busno,200);
				AddTextView("FROM",from,200);
				AddTextView("TO",to,200);
				AddTextView("ROUTE",db.getFromToStops(i, from, to),150);
			}
					
		}
	}
	
	public void AddTextView(String key,String value,int clr)
	{
		
		row = new TableRow(this);
		TextView tv1 = new TextView(this);
		TextView tv2 = new TextView(this);
		tv1.setText(" "+key+" :");
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
