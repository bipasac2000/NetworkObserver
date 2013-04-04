public class CountObserverProxy implements ObserverProxy, ServerFace {
	Processor processor; 
	ServerFace CNetSrv = new CNetServer(2); 
	
	CountObserverProxy(Processor p){
		processor = p;
		p.attach(this); 
	}
	//ServerFace proxy = new CountServerProxy(); 
	
	//ServerFace CNetSrv;
  /*CountServerProxy(){ 
  		CNetSrv = new CNetServer(2); 
  }*/
  
  public String handle (int input, int count) {
  	
  	if (count%4 == 0)
  		return CNetSrv.handle(input, 2);
  	else 
  		return ""; 
  }	
	
	public void update() {
		int count = processor.getCount();
		String output = this.handle(processor.getState(), count); 
		if (!output.equals(""))
			System.out.println("View of Count Server "+output); 
	}
	
	
	
}
