/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



import gnu.io.*;
import java.awt.Color;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.TooManyListenersException;

import javax.swing.text.BadLocationException;

public class msgClass 
{
	//passed from main GUI
	GUI window = null;

	public int x,y;

	/*
	 * Constructor of 
	 */
	public msgClass(GUI window)
	{
		this.window = window;
		this.x=0;
		this.y=0;
	}

	/*
	 * send message from robot a to all other robot
	 */
	public void sendMsg() throws BadLocationException
	{

		String tfrom=window.txtFrom.getText();
		String tMsg=window.txtMsg.getText();
		String msg="from "+tfrom+" "+ " to "+ "send msg "+tMsg;
		Point point=new Point(5, 5);
		x=(int) (Math.random()*100);
		y=(int) (Math.random()*100);
		System.out.println(x+","+y);
		this.window.pGraphics=window.txtPoint.getGraphics();
		 
		  String x1=window.txtLog.getText().valueOf(x);

		  String y1=window.txtLog.getText().valueOf(y);

		this.window.pGraphics.fillOval(x, y, 8, 8);

		window.txtLog.append(msg );
	 
	 System.out.println("x1 "+x1+" y1 "+y1);
 

	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void MoveLeft() {

	}
}
