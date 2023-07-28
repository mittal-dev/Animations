import java.awt.*;
import java.util.*;
import java.applet.*;
/*
<Applet code="balls" Width=1000 Height=1000>
</Applet>
*/
public class  balls extends Applet implements Runnable
{
	int x=10,y=10,he=1000,wi=1000;
	public void paint(Graphics g)
	{
		Random r=new Random();
		g.setColor(new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255)));
		g.fillOval(x+40,y+50,100,100);
	}
	public void init()
	{
		Thread t=new Thread(this);
		t.start();
	}
	public void run()
	{
		while(true)
		{
			try
			{
				repaint();
				Thread.sleep(10);
				if(x < wi -200)
					x+=10;
				if(y < he -400)
					y+=10;
			}
			catch(Exception e)
			{ }
		}
	}
}