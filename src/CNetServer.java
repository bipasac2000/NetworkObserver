
class CNetServer implements ServerFace {  
/* this is how the server looks if you want the server
	to live over the net as a separate process
*/															
	NetProxy primeNet;
	NetProxy allNet; 
	NetProxy countNet; 
	
	CNetServer(int id){
		if (id == 1)
			primeNet = new NetProxy("127.0.0.1", 9876, false); 
		else if (id == 0)
			allNet = new NetProxy("127.0.0.1", 9877, false);  
		else if (id == 2)
			countNet = new NetProxy("127.0.0.1", 9878, false); 
	}
																
   public String handle (int input, int id) {
	   if (id == 0){
  	 allNet.sendMessage("handle");
	   allNet.sendMessage(input, id);
	   return allNet.getMessage();
	   }
	   
  	 else if (id == 1){
  		 primeNet.sendMessage("handle"); 
  		 primeNet.sendMessage(input, id); 
  		 return primeNet.getMessage();
  	 }
  	 else if (id == 2){
  		 countNet.sendMessage("handle"); 
  		 countNet.sendMessage(input, id);
  		 return countNet.getMessage(); 
  	 }
		return "";
	}	
}
