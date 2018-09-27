import java.io.IOException;

import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.jsoup.nodes.*;
import org.jsoup.Jsoup;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;


public class Crawling extends Thread{
	 static int count = 0;
	 static int j  = 0 ;
	static int count2 = 0; 
	static Element foodname;
	static Elements names;
	static Elements nutritions;
	static Element a; 
	
	static File output = new File("FoodDB.db");
    
	public static void main(String[] args) {
		
		try {
			for(int i = 1; i<6; i++) {
		    String url = "https://www.foodsafetykorea.go.kr/portal/healthyfoodlife/foodnutrient/simpleSearch.do?menu_no=2805&menu_grp=MENU_NEW03&code4=2&code2=&search_name=&page=";
		    url = url.concat(String.valueOf(i));
			Document kofood = Jsoup.connect(url).get();
			String html = kofood.html();
			 foodname =kofood.select("#tab2").get(0);
			 names = foodname.select("a");
			 nutritions = foodname.select("td");
			 
			
			
		     
		    	 
		         count = 0;
		         count2 = 0;
		        
		         for(Element e: names) {
		        	 count++;
		        	 if(count>=3) {
				        System.out.print(e.text());
				        System.out.print(":");
		        	 
		        	 for(j = 2+count2*11; j<(6+count2*11); j++) {
							
							a = nutritions.get(j);
							 if(j==(5+count2*11)) {
					        	 System.out.print(a.text());
					        	 System.out.println("");
					         }else {
					        	 System.out.print(a.text());
					        	 System.out.print(":");
						
					         }
						}
		        	 count2++;
		        	 }
		        	 
		        	 
		         }
		        
		    
		      

		   
	}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 

}}

