import java.util.LinkedList;
import java.util.ListIterator;

public class Processor {
   
    private int count; 
    private LinkedList<ObserverProxy> observerProxy = new LinkedList<ObserverProxy>();
  	private ListIterator<ObserverProxy> obIter;
  	private int state;
    
    Processor(){
    	count = 0; 
    }
    public int getCount() {return count;}
    public int getState() {return state;}
    public void attach(ObserverProxy ob) { observerProxy.add(ob); }
    public void setState (int newNum) { state = newNum; notifyObservers(); }
  	
  	public void notifyObservers () {
  	  obIter = observerProxy.listIterator(0);
  	  while(obIter.hasNext()) { ((ObserverProxy)obIter.next()).update(); }
  	}
    
    public void handle( int input ) {
    	count++; 
    	setState(input); 
    	}
  

 static public Processor setUpChain(int num) {
    Processor root = new Processor(); 
    new PrimeObserverProxy(root); 
    new CountObserverProxy(root); 
    new AllObserverProxy(root); 
    return root;
 }
}

