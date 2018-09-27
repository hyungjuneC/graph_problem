
public class Vertex {
	int BackNum = -1;
	
	int nextNum = -1;
	
	int prevNum = -1;
	
	String PlayerURl = "";
	
	String name = "";
	
	double avHit = 0.0;
	double OPS = 0.0;
	double WAR = 0.0;
	
	
	
	
	
	Vertex(int Backnum ,String name ,String PlayerURL){
		this.BackNum= Backnum;
		
		this.name = name;
		
		this.PlayerURl= PlayerURL;
		
	}

}
