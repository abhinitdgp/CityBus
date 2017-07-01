package com.example.citybus;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.*;

public class MainActivity extends Activity implements OnClickListener
{
	CityData db=new CityData();
	private AutoCompleteTextView src,dest;
	TextView t1;
	private Button b1,b2,b3;
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		ArrayAdapter localArrayAdapter = new ArrayAdapter<String>(this,R.layout.list_detail,db.getStops());
		
	    src = (AutoCompleteTextView)findViewById(R.id.srcin);
	    src.setAdapter(localArrayAdapter);
	    
	    dest= ((AutoCompleteTextView)findViewById(R.id.destin));
	    dest.setAdapter(localArrayAdapter);
	    
	    b1=(Button)findViewById(R.id.button1);
	    b2=(Button)findViewById(R.id.button2);
	   // b3=(Button)findViewById(R.id.button3);
	    b1.setOnClickListener(this);
	    b2.setOnClickListener(this);
	   // b3.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) 
	{
		int j,rs=0,n=0;
		String busname,data="\0",from,to;
		switch(v.getId())
		{
		case R.id.button1:
		{
			Intent i = new Intent("com.example.citybus.Result");
			Bundle b = new Bundle();
			from = src.getText().toString();
			to = dest.getText().toString();
			Log.d("Source", from);
			Log.d("Destination", to);
			if(from.equalsIgnoreCase("")==true && to.equalsIgnoreCase("")==true)
			{
				Toast.makeText(MainActivity.this, "Enter Source & Destination", Toast.LENGTH_LONG).show();
			}
			else if(from.equalsIgnoreCase("")==true )
			{
				Toast.makeText(MainActivity.this, "Enter Source Station", Toast.LENGTH_LONG).show();
			}
			else if(to.equalsIgnoreCase("")==true)
			{
				Toast.makeText(MainActivity.this, "Enter Destination Station", Toast.LENGTH_LONG).show();
			}
			else if(from.equalsIgnoreCase(to)==true)
			{
				String error="You are at the same Destination only";
				Toast.makeText(MainActivity.this, error, Toast.LENGTH_LONG).show();
			}
			else if(from.equalsIgnoreCase(to)==false)
			{
				for(int bus=0;bus<10;bus++)
				{
					
					rs=db.getDirectBus(bus, from, to);
					Log.d("result",String.valueOf(rs));
					if(rs==1)
					{
						n+=1;
						busname=db.getBusName(bus);
						b.putString("BUS"+n,busname);
						Log.d("Test",busname);
						b.putString("FROM"+n, db.getFirstStop(bus));
						b.putString("TO"+n, db.getLastStop(bus));
						b.putString("ROUTE"+n, db.getFromToStops(bus, from, to));
					
					}
				
				}
				if(n==0)
				{
					data="NO DIRECT BUS FOUND WITH THIS SOURCE AND DESTINATION\n";
					b.putString("error", data);
				}
				b.putString("n", String.valueOf(n));
				i.putExtras(b);
				startActivity(i);
			}
		}
			break;
		case R.id.button2:
			Intent in= new Intent("com.example.citybus.BusEnquiry");
	        startActivity(in);
	        
			break;
		//case R.id.button3:
			
		//	break;
		}
	}

}
