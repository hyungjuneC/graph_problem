import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Edgemaking {
	
	
	static Scanner s;
	
	public static double[][] avHitarr = new double[25][9];
	
	public static double[][] OPSarr= new double[25][9];
	
	public static double[][] WPAarr= new double[25][9];
	
	
	Edgemaking() {
		int count = 0;
		File inputfile = new File("batterinfo.txt");
		try {
			s = new Scanner(inputfile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		while(s.hasNextLine()) {
			
			String infostr = s.nextLine();
			
			String[] infos = infostr.split(",");
			
			int backnum = Integer.parseInt(infos[0]);
			for(int i =0; i< 9; i++) {
			avHitarr[backnum][i]= Double.parseDouble(infos[(i*3)+1]);
			OPSarr[backnum][i]=Double.parseDouble(infos[(i*3)+2]);
			WPAarr[backnum][i]=Double.parseDouble(infos[(i*3)+3]);
			}
			
			
		}
		
	}
	
	public static void main(String[] args) {
		
		int count = 0;
		File inputfile = new File("battersinfo.txt");
		try {
			s = new Scanner(inputfile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		while(s.hasNextLine()) {
			
			String infostr = s.nextLine();
			
			String[] infos = infostr.split(",");
			
			
			for(int i =0; i< 9; i++) {
			avHitarr[count][i]= Double.parseDouble(infos[(i*3)+1]);
			OPSarr[count][i]=Double.parseDouble(infos[(i*3)+2]);
			WPAarr[count][i]=Double.parseDouble(infos[(i*3)+3]);
			
			System.out.println(infos[0]+":"+avHitarr[count][i]+","+OPSarr[count][i]+","+WPAarr[count][i]);
			}
			
			
			count++;
			
			
		}
		
		
	}

}
