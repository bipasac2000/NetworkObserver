

import java.awt.*;
import javax.swing.JFrame;

	
	class FlyWeightButton {

	   public static void main( String[] args ) {
	      JFrame frame = new JFrame( "Flyweight Demo" );
	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      frame.setLayout( new GridLayout( 15, 20 ) );
	      for (int i=0; i < 15 * 20; i++)
	            frame.add( FlyWeightFactory.makeButton( Integer.toString(i+1) ) );
	      frame.pack();
	      frame.setVisible( true );
	}
}

