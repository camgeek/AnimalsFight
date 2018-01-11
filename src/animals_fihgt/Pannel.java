package animals_fihgt;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Pannel extends JPanel { 
	  /*public void paintComponent(Graphics g){
		    //Vous verrez cette phrase chaque fois que la méthode sera invoquée
		    System.out.println("Je suis exécutée !"); 
		    //g.fillOval(20, 20, 75, 75);
		    g.drawString("La Bataille des monstre", 10, 20);
		    Image img;
		    Image chat;
			try {
				img = ImageIO.read(new File("Poochyena.png"));
				chat = ImageIO.read(new File("Cat.png"));
			     g.drawImage(img, 0, 0, this);
			     g.drawImage(chat, 300, 0, this);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  }  */
	 private int posX = -50;
	  private int posY = -50;

	  public void paintComponent(Graphics g){
	    //On choisit une couleur de fond pour le rectangle
	    g.setColor(Color.white);
	    //On le dessine de sorte qu'il occupe toute la surface
	    g.fillRect(0, 0, this.getWidth(), this.getHeight());
	    
	    Image img;
	    Image chat;
		try {
			img = ImageIO.read(new File("Pictures/Poochyena.png"));
			chat = ImageIO.read(new File("Pictures/Cat.png"));
		     g.drawImage(img, posX, posY, this);
		     g.drawImage(chat, posX + 300, posY, this);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }

	  public int getPosX() {
	    return posX;
	  }

	  public void setPosX(int posX) {
	    this.posX = posX;
	  }

	  public int getPosY() {
	    return posY;
	  }

	  public void setPosY(int posY) {
	    this.posY = posY;
	  }
}
