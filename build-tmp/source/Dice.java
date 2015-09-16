import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Dice extends PApplet {

public void setup()
{
	size (300,300);
	noLoop();
}
public void draw()
{
	for(int t = 0; t<3; t++)
	{
		for(int r = 0; r<3; r++)
		{
			Die bob = new Die(t*100+25,r*100+25);
			bob.show();
		}
	}
}
public void mousePressed()
{
	redraw();
}
class Die //models one single dice cube
{
	int myX;
	int myY; 
	int roll;   //variable declarations here
	Die(int x, int y) //constructor
	{
		myX = x;
		myY = y;//variable initializations here
		roll(); 
	}
	public void roll()
	{
		roll = (int)(Math.random()*6)+1; 
	}
	public void show()
	{
		fill(255,255,255);
		rect(myX,myY,50,50);
		fill(0,0,0);
		if(roll == 1)
		{
			ellipse(myX+25,myY+25,15,15);
		}
		else if(roll == 2)
		{
			ellipse(myX+10,myY+10,15,15);
			ellipse(myX+40,myY+40,15,15);
		}
		else if(roll == 3)
		{
			ellipse(myX+10,myY+10,15,15);
			ellipse(myX+25,myY+25,15,15);
			ellipse(myX+40,myY+40,15,15);
		}
		else if(roll == 4)
		{
			ellipse(myX+10,myY+10,15,15);
			ellipse(myX+10,myY+40,15,15);
			ellipse(myX+40,myY+10,15,15);
			ellipse(myX+40,myY+40,15,15);
		}
		else if(roll == 5)
		{
			ellipse(myX+10,myY+10,15,15);
			ellipse(myX+10,myY+40,15,15);
			ellipse(myX+25,myY+25,15,15);
			ellipse(myX+40,myY+10,15,15);
			ellipse(myX+40,myY+40,15,15);
		}
		else
		{
			ellipse(myX+8,myY+8,15,15);
			ellipse(myX+8,myY+42,15,15);
			ellipse(myX+8,myY+25,15,15);
			ellipse(myX+42,myY+8,15,15);
			ellipse(myX+42,myY+25,15,15);
			ellipse(myX+42,myY+42,15,15);
		}
	}
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Dice" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
