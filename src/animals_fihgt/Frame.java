package animals_fihgt;

import javax.swing.JFrame;

public class Frame extends JFrame {
	private Pannel _pannel = new Pannel();
	
		  public Frame(){
		    this.setTitle("Anmials Fight");
		    this.setSize(1200, 850);
		    //this.setSize(300, 300);
		    this.setLocationRelativeTo(null);
		    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    this.setContentPane(_pannel);
		    this.setVisible(true);
		    go();
		  }

private void go(){
    for(int i = 50; i < _pannel.getWidth(); i++){
      int x = _pannel.getPosX(), y = _pannel.getPosY();
      //x++;
      if ((i % 2) == 0)
      {
    	  _pannel.setChoice(1);
    	  //y--;
      }
      else
      {
    	  _pannel.setChoice(2);
      }
      _pannel.setPosX(x);
      _pannel.setPosY(y);
      _pannel.repaint();  
      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
