package com.example.citybus;

import android.content.Intent;
import android.sax.StartElementListener;
import android.util.Log;
import android.widget.TextView;


public class CityData 
{
	private String Route[]=new String[]{"TR1","TR2","TR3","SR1","SR2","SR3","SR4","SR5","SR6","SR7"};
	private String Stop[]=new String[]
			{	
			"11 Mile",
			"11 No Stop",
			"1250 Hospital",
			"Airport Tiraha",
			"Akash Ganga Colony",
			"Alkapuri",
			"Alpana Talkies",
			"Alpana Tiraha",
			"Anand Nagar",
			"Anna Nagar",
			"Arif Nagar",
			"Avadhpuri Khajuri Kalan",
			"Ayappa Mandir",
			"Ayodhya Nagar",
			"Ayushmaan Hospital",
			"Badbhada Square",
			"Bairagarh Chinchali",
			"Bairagarh Railway Station",
			"Bairagarh Stand",
			"Banganga Square",
			"Barkhadi RC",
			"Basant Kunj",
			"Bhanpur Railway crossing", 
			"Bharat Nagar",
			"Bharat Talkies",
			"BHEL Gate -6",
			"BHMRC",
			"Bhopal Sultania Infantry",
			"Bhopal Talkies",
			"BJP Bhawan",
			"Board Office",
			"Bogda Pul",
			"Bus Stand",
			"Campion School",
			"Carrier College",
			"Center Point",
			"Chhunabhati Collar Tiraha",
			"Chuna Bhatti",
			"City Depot",
			"Collectorate",
			"Damkheda 1",
			"Damkheda 2",
			"DIG Bungalow",
			"Ekant Park, Main Road 3",
			"Fun City",
			"Gandhi Chouraha",
			"Gandhi Nagar",
			"Govindpura South",
			"Govindpura Thana",
			"Govt Quarters",
			"Gulmohar Colony West",
			"Habibganj Naka W",
			"Habibganj Station",
			"Halalpur",
			"Hanuman Mandir",
			"HEG Mandideep",
			"Housing Colony",
			"IIFM",
			"Indus Town",
			"Jahangirabad",
			"Jatkhedi",
			"Jawahar Chowk",
			"Jehangirabad",
			"Jinsi Square",
			"JK Road Tiraha",
			"Jyoti Talkies",
			"Kamla Park",
			"Karond Chauraha",
			"Kasturba Nagar",
			"Kazi Camp",
			"Khushiran Ayurvedic College",
			"Kokta Tiraha",
			"Kolar Colony",
			"Krishi Upaj Mandi",
			"Lady Hospital",
			"Lalghati",
			"MACT",
			"Mahavir Tekri ",
			"Maholi",
			"Mandideep",
			"Manisha Market",
			"Map Cast Aradhana Nagar",
			"Mata Mandir",
			"Militry Gate",
			"Misrod",
			"Moti Masjid",
			"Motilal Nehru Stadium",
			"Narela Shankari",
			"Nayapur",
			"Nehru Nagar",
			"New Court",
			"New Jail",
			"New Market",
			"Nikhil Homes",
			"Old Vidhan Sabha",
			"Oriental College",
			"P&T Squre",
			"Palasi",
			"Panchsheel Pulia",
			"Paras City",
			"Paryavaas Bhawan",
			"Patel Nagar Bypass",
			"Patel Nagar",
			"Patra Pul",
			"Patrakar Colony",
			"Peer Gate",
			"People's Campus",
			"PHQ",
			"Piplani Petrol Pump",
			"Police Control Room",
			"Polytechnic",
			"Post Office",
			"Prabhat Petrol Pump",
			"Prakash Nagar",
			"Prakash Taran Pushkar",
			"Press Complex",
			"Purani Jail",
			"Raisen Hoshangabad Bypass",
			"Raj Express",
			"Rajeev Gandhi Nagar",
			"Rajiv Gandhi Chowk",
			"Rajiv Gandhi college",
			"Ram Nagar, Navri Road",
			"Rangmahal",
			"Rangmahal",
			"Ratnagiri Bypass",
			"Regional Musium of Natural History",
			"RGPV",
			"Roshanpura",
			"Royal Market",
			"RRL",
			"Sabji Mandi",
			"Sagar Homes",
			"Sai Board",
			"Saint Xavier",
			"Saket Nagar",
			"Samardha",
			"Sant Asharam Tiraha",
			"Sargam Talkies",
			"Sarvadharama Colony",
			"SBI LHO",
			"shahjahanabad",
			"Shahpura Nahar",
			"Shaitaansingh Market",
			"Sharda Nagar",
			"Sindhi Colony",
			"St Mont Fort School",
			"State Bank Square",
			"Subhash Railway Fatak",
			"Suyaah Hospital",
			"Taj Mahal",
			"Tin Shed",
			"Truba College",
			"University",
			"Upaj Mandi",
			"Vaishali Nagar",
			"Vallabh Bhawan",
			"Vidya Nagar",
			"Vijay Market",
			"Vijay Nagar",
			"VIP Guest House", 
			"Vyapam"
	};
	private String rt[][]=new String[][]
			{
				{    //TR1
					"Bairagarh Railway Station",
					"Halalpur",
					"Lalghati",
					"VIP Guest House",
					"Collectorate",
					"Royal Market",
					"Peer Gate",
					"Moti Masjid",
					"Kamla Park",
					"Polytechnic",
					"Roshanpura",
					"New Market",
					"Prakash Taran Pushkar",
					"1250 Hospital",
					"Vyapam",
					"Board Office",
					"Sargam Talkies",
					"BJP Bhawan",
					"Habibganj Station",
					"Habibganj Naka W",
					"Paras City"
				},
				{	//TR2
					"Bus Stand",
					"Alpana Talkies",
					"Bharat Talkies",
					"Patra Pul",
					"Barkhadi RC",
					"Upaj Mandi",
					"Bogda Pul",
					"Jinsi Square",
					"Subhash Railway Fatak",
					"SBI LHO",
					"Post Office",
					"Press Complex",
					"Board Office",
					"Sargam Talkies",
					"Habibganj Station",
					"Paras City",
					"RRL",
					"University",
					"Vidya Nagar",
					"Nikhil Homes",
					"Jatkhedi",
					"Misrod",
					"11 Mile",
					"Fun City",
					"Indus Town",
					"Samardha",
					"Mandideep",
					"HEG Mandideep"
				},
				{ 	//TR3
					"Bairagarh Railway Station",
					"Bairagarh Stand",
					"Halalpur",
					"Lalghati",
					"VIP Guest House",
					"Collectorate",
					"State Bank Square",
					"Royal Market",
					"Bhopal Talkies",
					"Bus Stand",
					"Alpana Talkies",
					"Bharat Talkies",
					"Patra Pul",
					"Barkhadi RC",
					"Upaj Mandi",
					"Bogda Pul",
					"Prabhat Petrol Pump",
					"Govindpura South",
					"JK Road Tiraha",
					"Piplani Petrol Pump",
					"Ratnagiri Bypass",
					"Anand Nagar",
					"Raj Express",
					"Patel Nagar",
					"Oriental College",
					"St Mont Fort School",
					"Raisen Hoshangabad Bypass",
					"Kokta Tiraha"
				},
				{	//SR1
					"Lalghati",
					"VIP Guest House", 
					"Collectorate",
					"Royal Market",
					"Peer Gate",
					"Moti Masjid",
					"Kamla Park",
					"Polytechnic",
					"Banganga Square",
					"Rangmahal",
					"Jawahar Chowk",
					"City Depot",
					"P&T Squre",
					"Govt Quarters",
					"Nehru Nagar",
					"IIFM",
					"Badbhada Square",
					"City Depot"
				},
				{	//SR2
					"City Depot",
					"Jawahar Chowk",
					"Rangmahal",
					"Center Point",
					"Tin Shed",
					"Mata Mandir",
					"MACT",
					"Panchsheel Pulia",
					"Patrakar Colony",
					"Kolar Colony",
					"Suyaah Hospital",
					"Chuna Bhatti",
					"Shahpura Nahar",
					"Ayushmaan Hospital",
					"Manisha Market",
					"Shaitaansingh Market",
					"Campion School",
					"Hanuman Mandir",
					"Paras City",
					"RRL",
					"Alkapuri",
					"Saket Nagar"
				},
				{	//SR3
					"Gandhi Nagar",
					"Sant Asharam Tiraha",
					"Airport Tiraha",
					"Mahavir Tekri ",
					"Vijay Nagar",
					"Halalpur",
					"Lalghati",
					"Ram Nagar, Navri Road",
					"Bhopal Sultania Infantry",
					"Militry Gate",
					"Taj Mahal",
					"shahjahanabad",
					"Bhopal Talkies",
					"Bus Stand",
					"Sabji Mandi",
					"Alpana Tiraha"
				},
				{	//SR4
					"Karond Chauraha",
					"Housing Colony",
					"Krishi Upaj Mandi",
					"Arif Nagar",
					"DIG Bungalow",
					"Kazi Camp",
					"Sindhi Colony",
					"Bhopal Talkies",
					"Bus Stand",
					"Sabji Mandi",
					"Alpana Tiraha",
					"Bharat Talkies",
					"Lady Hospital",
					"Jahangirabad",
					"PHQ",
					"Police Control Room",
					"Old Vidhan Sabha",
					"Roshanpura",
					"Rangmahal",
					"Jawahar Chowk",
					"City Depot",
					"P&T Square",
					"Govt Quarters",
					"Nehru Nagar",
					"Map Cast Aradhana Nagar",
					"Khushiran Ayurvedic College",
					"Chhunabhati Collar Tiraha",
					"Sarvadharama Colony",
					"Nayapur",
					"Bairagarh Chinchali"
				},
				{	//SR5
					"Bus Stand",
					"Alpana Tiraha",
					"Bharat Talkies",
					"Lady Hospital",
					"Jehangirabad",
					"PHQ",
					"Motilal Nehru Stadium",
					"Purani Jail",
					"New Court",
					"Paryavaas Bhawan",
					"Vallabh Bhawan",
					"Board office",
					"Jyoti Talkies",
					"Kasturba Nagar",
					"Anna Nagar",
					"Carrier College",
					"Govindpura Thana",
					"BHEL Gate -6",
					"Vijay Market",
					"Gandhi Chouraha",
					"Ayappa Mandir",
					"Saint Xavier",
					"Avadhpuri Khajuri Kalan"
				},
				{	//SR6
					"P&T Square",
					"Govt Quarters",
					"Nehru Nagar",
					"Vaishali Nagar",
					"MACT",
					"Panchsheel Pulia",
					"Patrakar Colony",
					"kolar Colony",
					"Ekant Park, Main Road 3",
					"Rajiv Gandhi Chowk",
					"Regional Musium of Natural History",
					"Hanuman Mandir",
					"11 No Stop",
					"Sai Board",
					"Basant Kunj",
					"Bharat Nagar",
					"Akash Ganga Colony",
					"Gulmohar Colony West",
					"Rajiv Gandhi college"
				},
				{	//SR7
					"Gandhi Nagar",
					"Sant Asharam Tiraha",
					"RGPV",
					" New Jail",
					"Truba College",
					"Palasi",
					"Karond Chauraha",
					"BHMRC",
					"People's Campus",
					"Bhanpur Railway crossing", 
					"Maholi",
					"Damkheda 1",
					"Damkheda 2",
					"Sagar Homes",
					"Sharda Nagar",
					"Ayodhya Nagar",
					"Narela Shankari",
					"Rajeev Gandhi Nagar",
					"Prakash Nagar",
					"Ratnagiri Bypass",
					"Patel Nagar Bypass"
				}
				
			};
	
	public String[] getRoute(int i)
	{
		switch(i)
		{
		case 0:
			return rt[0];
		case 1:
			return rt[1];
		case 2:
			return rt[2];
		case 3:
			return rt[3];
		case 4:
			return rt[4];
		case 5:
			return rt[5];
		case 6:
			return rt[6];
		case 7:
			return rt[7];
		case 8:
			return rt[8];
		case 9:
			return rt[9];
		default:
			return null;
		}
	}
	
	public int getRouteNo(String bus)
	{
		int i;
		Log.d("Busname2", bus);
		for(i=0;i<Route.length;i++)
		{
			if(Route[i].equalsIgnoreCase(bus)==true)
				return i;
		}
		return -1;
	}
	public String[] getAllRoute()
	{
		return Route;
	}
	
	public String[] getStops()
	{
		return Stop;
	}
	
	public String getFromToStops(int bus,String src,String dest)
	{
		String data="\0";
		int i,j,cnt=0;
		i=searchStop(bus, src);
		j=searchStop(bus, dest);
		Log.d("i", String.valueOf(i));
		Log.d("j", String.valueOf(j));
		if(i<j)
		{
			for(int k=i;k<=j;k++)
			{
				++cnt;
				data+="\n"+cnt+".  "+rt[bus][k];
			}
		}
		else
		{
			for(int k=i;k>=j;k--)
			{
				++cnt;
				data+="\n\t"+cnt+". "+rt[bus][k];
			}
		}
		return data;
		
	}
	
	public String getBusName(int i)
	{
		return(Route[i]);
	}
	
	public String getFirstStop(int i)
	{
		return(rt[i][0]);
	}
	
	public String getLastStop(int i)
	{
		return(rt[i][rt[i].length-1]);
	}
	
	public int getDirectBus(int bus,String src,String dest)
	{
		int f=0,j,k;
			if(searchStop(bus,src)!=-1)
			{
				if(searchStop(bus,dest)!=-1)
				{
					f=1;
				}
			}
			return f;
	}
	public int searchStop(int bus,String stop)
	{
		int j,k,f;
		for(j=0;j<(rt[bus].length);j++)
		{
			if(rt[bus][j].equalsIgnoreCase(stop)==true)
			{
				return j;
			}	
		}
		return -1;
	}
	
}
