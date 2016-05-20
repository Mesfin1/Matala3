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

public class msgClass {
	//passed from main GUI
	GUI window = null;

	public int x,y;
	static Robot robot[] = new Robot[5];
	int n = robot.length;
	int i = 0;

	public msgClass(GUI window)	{
		this.window = window;
		this.x=0;
		this.y=0;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}


	/*
	 * send message from robot a to all other robot
	 */
	public void sendMsg() throws BadLocationException	{

		String tfrom=window.txtFrom.getText();
		String tMsg=window.txtMsg.getText();
		String msg="from "+tfrom+" "+ " to "+ "send msg "+tMsg;

		x=(int) (Math.random()*100);
		y=(int) (Math.random()*100);
		//System.out.println(x+","+y);
		this.window.pGraphics=window.txtPoint.getGraphics();
		String x1=window.txtLog.getText().valueOf(x);
		String y1=window.txtLog.getText().valueOf(y);
		this.window.pGraphics.fillOval(x, y, 5, 5);
		window.txtLog.append(msg);

		if(i < n){
			robot[i] = new Robot(new Point(x,y));
			System.out.println(robot[i].p.getX() + "," + robot[i].p.getY() );
		}

		else if(i == n) window.btnConnect.setVisible(false); 
		else i++;
	}




	public void MoveLeft() throws BadLocationException {
		this.x = x-5;
		this.window.pGraphics.fillOval(x, y, 8, 8);
	}

	public void MoveRight() throws BadLocationException {
		this.x = x+5;
		this.window.pGraphics.fillOval(x, y, 8, 8);
	}

	public void MoveUp() throws BadLocationException {
		this.y = y+5;
		this.window.pGraphics.fillOval(x, y, 8, 8);
	}

	public void MoveDown() throws BadLocationException {
		this.y = y-5;
		this.window.pGraphics.fillOval(x, y, 8, 8);
	}



}
