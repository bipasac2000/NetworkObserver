import java.awt.Button;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

	class ButtonListener implements ActionListener {
		
     Processor chain = Processor.setUpChain(1); 
		
	   public void actionPerformed( ActionEvent e) {
	      Button      btn  = (Button) e.getSource();
	      Component[] btns = btn.getParent().getComponents();
	      int i = 0;
	      for ( ; i < btns.length; i++)
	         if (btn == btns[i]) break; 
	      chain.handle(Integer.parseInt(e.getActionCommand())); 
	   }
	}


