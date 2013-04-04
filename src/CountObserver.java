
public class CountObserver {
	
	public static void main( String[] args ) {
		 SSNetClient demo = new SSNetClient(9878); 
		 ServerFace srv = new Server();
		 
	   demo.start(srv); 
		 System.out.println("server is finished");
		                              	  
	  }  


}
