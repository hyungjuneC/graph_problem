import java.io.IOException;
import java.util.Scanner;

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
	static Element avHit;
	static Elements infos;
	static Elements nutritions;
	static Element a; 
	static Scanner s;
	static Batters bat;
	static FileWriter crawlwriter;
	private static final String LINE_SEPARATOR = System

            .getProperty("line.separator");



	Crawling(){
		
	
	
	}
	
	
	//25
	
	
    
	public static void main(String[] args) {
		
		File outputfile = new File("battersinfo.txt");
		try {
			crawlwriter = new FileWriter(outputfile);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		File inputfile = new File("battersURL.txt");
		
		try {
			s = new Scanner(inputfile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
		
		
		
		while(s.hasNextLine()) {
		try {
			
			String teststr = s.nextLine();
		    String[] playerinfo = teststr.split(",");
		    
		    crawlwriter.write(playerinfo[1]+",");
			Document batterinfo = Jsoup.connect(playerinfo[2]).get();
			String html = batterinfo.html();
			
			
			infos = batterinfo.select("td[class=statdata]");
			
			Elements info = infos.select("span");
			
			int length = info.size();
			String prins = info.html();
			Element test = info.get(44);
			String testst = test.text();
			System.out.println(testst);
			for(int i = 2; i < length/25; i++){
				int avH = 19+25*i;
				int OP = 21+25*i;
				int WP  = 24+25*i;
				
				
				
					Element a = info.get(avH);
					String avHit = a.text();
					if(avHit==null) {
						crawlwriter.write("0,");
						}
						else {
						crawlwriter.write(avHit+",");
						System.out.println("avHIT:"+avHit);
						}
					
					
					
						Element b = info.get(OP);
						String OPS = b.text();
						if(OPS==null) {
							crawlwriter.write("0,");
							}
						else {
						crawlwriter.write(OPS+",");
						System.out.println("OPS:"+OPS);
						}
					
					
					
						
						Element c = info.get(WP);
						String WPA = c.text();
						if(WPA==null) {
							crawlwriter.write("0,");
							}
						else {
						crawlwriter.write(WPA+",");
						System.out.println("WPA:"+WPA);
						}
				
				}
			
			crawlwriter.write(LINE_SEPARATOR);
				
			
			
			
		     
		    	 
		     
		        
		    
		      

		   

			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 
		}
		
		s.close();
		try {
			crawlwriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 

}
	
public void Crawl(int BackNum){
	
	File outputfile = new File("battersinfo.txt");
	try {
		crawlwriter = new FileWriter(outputfile);
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
	
	File inputfile = new File("battersURL.txt");
	
	try {
		s = new Scanner(inputfile);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	
	}
	
	
	
	while(s.hasNextLine()) {
	try {
		
		String teststr = s.nextLine();
	    String[] playerinfo = teststr.split(",");
	    
	    crawlwriter.write(playerinfo[1]+",");
		Document batterinfo = Jsoup.connect(playerinfo[2]).get();
		String html = batterinfo.html();
		
		
		infos = batterinfo.select("td[class=statdata]");
		
		Elements info = infos.select("span");
		
		int length = info.size();
		String prins = info.html();
		Element test = info.get(44);
		String testst = test.text();
		System.out.println(testst);
		for(int i = 2; i < length/25; i++){
			int avH = 19+25*i;
			int OP = 21+25*i;
			int WP  = 24+25*i;
			
			
			
				Element a = info.get(avH);
				String avHit = a.text();
				
				if(avHit==null) {
				crawlwriter.write("0,");
				}
				else {
				crawlwriter.write(avHit+",");
				System.out.println("avHIT:"+avHit);
				}
			
			
			
				Element b = info.get(OP);
				String OPS = b.text();
				if(OPS==null) {
					crawlwriter.write("0,");
					}
				else {
				crawlwriter.write(OPS+",");
				System.out.println("OPS:"+OPS);
				}
			
			
			
				
				Element c = info.get(WP);
				String WPA = c.text();
				if(WPA==null) {
					crawlwriter.write("0,");
					}
				else {
				crawlwriter.write(WPA+",");
				System.out.println("WPA:"+WPA);
				}
			
			}
		
		
		
		
		
	     
	    	 
	     
	        
	    
	      

	   

		
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	 
	}
	
	s.close();
	try {
		crawlwriter.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}



}

