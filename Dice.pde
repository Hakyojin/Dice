void setup()
{
	size (300,300);
	noLoop();
}
void draw()
{
	Die bob = new Die(100,100);
	bob.show();
}
void mousePressed()
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
	void roll()
	{
		roll = (int)(Math.random()*6)+1; 
	}
	void show()
	{
		fill(255,255,255);
		rect(myX,myY,50,50);
		fill(0,0,0);
		if(roll == 1)
		{
			ellipse(125,125,15,15);
		}
		else if(roll == 2)
		{
			ellipse(110,110,15,15);
			ellipse(140,140,15,15);
		}
		else if(roll == 3)
		{
			ellipse(110,110,15,15);
			ellipse(125,125,15,15);
			ellipse(140,140,15,15);
		}
		else if(roll == 4)
		{
			ellipse(110,110,15,15);
			ellipse(110,140,15,15);
			ellipse(140,110,15,15);
			ellipse(140,140,15,15);
		}
		else if(roll == 5)
		{
			ellipse(110,110,15,15);
			ellipse(110,140,15,15);
			ellipse(125,125,15,15);
			ellipse(140,110,15,15);
			ellipse(140,140,15,15);
		}
		else
		{
			ellipse(108,108,15,15);
			ellipse(108,142,15,15);
			ellipse(108,125,15,15);
			ellipse(142,108,15,15);
			ellipse(142,125,15,15);
			ellipse(142,142,15,15);
		}
	}
}