
public class AllObserverProxy implements ObserverProxy, ServerFace {
	Processor processor; 
	 ServerFace CNetSrv = new CNetServer(0); 
	 
	AllObserverProxy(Processor p){
		processor = p;
		p.attach(this); 
	}
	
	public void update() {
		System.out.println("View of All Observer "+ this.handle(processor.getState(), 0)); 
	}
	
	public String handle (int input, int id) {
  	
  	return CNetSrv.handle(input, id); 
    
  }	
}
