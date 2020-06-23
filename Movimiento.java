import javax.swing.*;
import java.util.Random;
import java.awt.*;

public class Movimiento implements Runnable{

	JLabel jlPared;
	int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
	int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
	int y;
	int x;
	Rectangle posPared;

	public Movimiento(JLabel jlPared)
	{
		this.jlPared = jlPared;
	}
	public void setPosPared(Rectangle posPared)
	{
		this.posPared=posPared;
	}

	@Override
	public void run()
	{
		while(true)
			{
			Random rnd = new Random();
			y=(int)(rnd.nextDouble() * alto + 0);
			for (x=ancho; x>-380 ; x=x-10) 
			{
				this.jlPared.setLocation(x,y);
				retardo(50);
			}						
		}
	}	
	public void retardo(int ms)
	{
		try
			{
				Thread.sleep(ms);
			}catch(Exception e){
				System.out.println("Error: al ejecutar el sleep");
			}
	}
}