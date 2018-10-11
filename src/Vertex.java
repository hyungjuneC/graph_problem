
public class Vertex {
	int BackNum = -1;
	
	int nextNum = -1;
	
	int prevNum = -1;
	
	String PlayerURl = "";
	
	String name = "";
	
	public double avHit[];
	public double OPS[];
	public double WPA[];
	
	
	
	
	
	Vertex(int Backnum ,String name ,String PlayerURL){
		this.BackNum= Backnum;
		
		this.name = name;
		
		this.PlayerURl= PlayerURL;
		
	}

}
