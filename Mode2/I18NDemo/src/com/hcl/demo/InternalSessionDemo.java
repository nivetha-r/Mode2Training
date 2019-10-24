package com.hcl.demo;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class InternalSessionDemo {
 public static void main(String[] args) {
	 
	 //NumberFormat in I18N for some countries
	 double d=123456.789;
		NumberFormat nf=NumberFormat.getInstance(Locale.ITALY);
		NumberFormat nf1=NumberFormat.getInstance(Locale.US);
		NumberFormat nf2=NumberFormat.getInstance(Locale.ENGLISH);
		System.out.println("Italy representation of " + d + " : "+nf.format(d));
		System.out.println("US representation of " + d + " : " +nf1.format(d));
		System.out.println("Japan representation of " + d + " : " +nf2.format(d));
		
	   //DateTimeFormat in short,long and medium with getDateTimeInstance
		DateFormat df=DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.SHORT);
	    System.out.println("Short format of date: "+df.format(new Date()));
	    DateFormat df1=DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG);
	    System.out.println("Long format of date: "+df1.format(new Date()));
	    DateFormat df2=DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.MEDIUM);
	    System.out.println("Medium format of date: "+df2.format(new Date()));
	  
	    //Locale date format giving countries starting letters to get time but using only getDateInstance(de-denmark)
	    DateFormat df3=DateFormat.getDateInstance(DateFormat.SHORT,new Locale("de","DE"));
	    System.out.println("Short format of date: "+df3.format(new Date()));
	    DateFormat df4=DateFormat.getDateInstance(DateFormat.LONG,new Locale("de","DE"));
	    System.out.println("Long format of date: "+df4.format(new Date()));
	    DateFormat df5=DateFormat.getDateInstance(DateFormat.MEDIUM,new Locale("de","DE"));
	    System.out.println("Medium format of date: "+df5.format(new Date()));
	    

}
}
