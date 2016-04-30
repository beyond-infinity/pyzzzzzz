import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;
public class keys implements NativeKeyListener {
	
	static String[] data;
	StringSelection stringSelection;
	Toolkit toolkit = Toolkit.getDefaultToolkit();
	Clipboard clipboard = toolkit.getSystemClipboard();
	Robot robot;
	String g;
	static String result;
	static int overflow ;
	public keys() throws AWTException
	{
		data = new String[10];
		toolkit = Toolkit.getDefaultToolkit();
		clipboard = toolkit.getSystemClipboard();
		robot = new Robot();
		clipboard.setContents(new StringSelection("Start"), null);
		overflow =0;
		for(int i = 0;i<data.length;i++)
		{
			data[i] = null;
		}
	}
	public String[] HandleOverflow(String[] data)
	{
		data[overflow] = result;
		overflow++;
		if(overflow==9)
		{
			overflow =0;
		}
		return data;
	}
	public void nothing()
	{
	
	}
	@Override
	public void nativeKeyPressed(NativeKeyEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++" + NativeKeyEvent.getKeyText(arg0.getKeyCode()) + "+++++++++++++++++++++");
		if(NativeKeyEvent.getKeyText(arg0.getKeyCode()) == "NumPad 1")
		{
			if(!contains(data , result))
			{
				int ind = checknull(data);
				if(ind>=0)
				{
					data[ind] = result;
				}
				else
				{
					data = HandleOverflow(data);
				}
			}
			System.out.println("=================================================================================True============================================");
			System.out.println("================================================================================" + data[0] + "==================================");
			stringSelection = new StringSelection(data[0]);			clipboard.setContents(stringSelection, null);			robot.keyPress(KeyEvent.VK_BACK_SPACE);
			robot.keyRelease(KeyEvent.VK_BACK_SPACE);
			 robot.keyPress(KeyEvent.VK_CONTROL);
			  robot.keyPress(KeyEvent.VK_V);
			  robot.keyRelease(KeyEvent.VK_V);
			  robot.keyRelease(KeyEvent.VK_CONTROL);
		}
		else if(NativeKeyEvent.getKeyText(arg0.getKeyCode()) == "NumPad 2" && data.length>0)
		{
			if(!contains(data , result))
			{
				int ind = checknull(data);
				if(ind>=0)
				{
					data[ind] = result;
				}
				else
				{
					data = HandleOverflow(data);
				}
			}
			System.out.println("=================================================================================True============================================");
			System.out.println("================================================================================" + data[1] + "==================================");
			stringSelection = new StringSelection(data[1]);
			clipboard.setContents(stringSelection, null);
			robot.keyPress(KeyEvent.VK_BACK_SPACE);
			robot.keyRelease(KeyEvent.VK_BACK_SPACE);
			 robot.keyPress(KeyEvent.VK_CONTROL);
			  robot.keyPress(KeyEvent.VK_V);
			  robot.keyRelease(KeyEvent.VK_V);
			  robot.keyRelease(KeyEvent.VK_CONTROL);
		}
		else if(NativeKeyEvent.getKeyText(arg0.getKeyCode()) == "NumPad 3" && data.length>0)
		{
			if(!contains(data , result))
			{
				int ind = checknull(data);
				if(ind>=0)
				{
					data[ind] = result;
				}
				else
				{
					data = HandleOverflow(data);
				}
			}
			System.out.println("=================================================================================True============================================");
			System.out.println("================================================================================" + data[2] + "==================================");
			stringSelection = new StringSelection(data[2]);
			clipboard.setContents(stringSelection, null);
			robot.keyPress(KeyEvent.VK_BACK_SPACE);
			robot.keyRelease(KeyEvent.VK_BACK_SPACE);
			 robot.keyPress(KeyEvent.VK_CONTROL);
			  robot.keyPress(KeyEvent.VK_V);
			  robot.keyRelease(KeyEvent.VK_V);
			  robot.keyRelease(KeyEvent.VK_CONTROL);
		}
		else if(NativeKeyEvent.getKeyText(arg0.getKeyCode()) == "NumPad 4" && data.length>0)
		{
			if(!contains(data , result))
			{
				int ind = checknull(data);
				if(ind>=0)
				{
					data[ind] = result;
				}
				else
				{
					data = HandleOverflow(data);
				}
			}
			System.out.println("=================================================================================True============================================");
			System.out.println("================================================================================" + data[3] + "==================================");
			stringSelection = new StringSelection(data[3]);
			clipboard.setContents(stringSelection, null);
			robot.keyPress(KeyEvent.VK_BACK_SPACE);
			robot.keyRelease(KeyEvent.VK_BACK_SPACE);
			 robot.keyPress(KeyEvent.VK_CONTROL);
			  robot.keyPress(KeyEvent.VK_V);
			  robot.keyRelease(KeyEvent.VK_V);
			  robot.keyRelease(KeyEvent.VK_CONTROL);
		}
		else if(NativeKeyEvent.getKeyText(arg0.getKeyCode()) == "NumPad 5" && data.length>0)
		{
			if(!contains(data , result))
			{
				int ind = checknull(data);
				if(ind>=0)
				{
					data[ind] = result;
				}
				else
				{
					data = HandleOverflow(data);
				}
			}
			System.out.println("=================================================================================True============================================");
			System.out.println("================================================================================" + data[4] + "==================================");
			stringSelection = new StringSelection(data[4]);
			clipboard.setContents(stringSelection, null);
			robot.keyPress(KeyEvent.VK_BACK_SPACE);
			robot.keyRelease(KeyEvent.VK_BACK_SPACE);
			 robot.keyPress(KeyEvent.VK_CONTROL);
			  robot.keyPress(KeyEvent.VK_V);
			  robot.keyRelease(KeyEvent.VK_V);
			  robot.keyRelease(KeyEvent.VK_CONTROL);
		}
		else if(NativeKeyEvent.getKeyText(arg0.getKeyCode()) == "NumPad 6" && data.length>0)
		{
			if(!contains(data , result))
			{
				int ind = checknull(data);
				if(ind>=0)
				{
					data[ind] = result;
				}
				else
				{
					data[overflow] = result;
					overflow++;
					if(overflow==9)
					{
						overflow =0;
					}
				}
			}
			System.out.println("=================================================================================True============================================");
			System.out.println("================================================================================" + data[4] + "==================================");
			stringSelection = new StringSelection(data[5]);
			clipboard.setContents(stringSelection, null);
			robot.keyPress(KeyEvent.VK_BACK_SPACE);
			robot.keyRelease(KeyEvent.VK_BACK_SPACE);
			 robot.keyPress(KeyEvent.VK_CONTROL);
			  robot.keyPress(KeyEvent.VK_V);
			  robot.keyRelease(KeyEvent.VK_V);
			  robot.keyRelease(KeyEvent.VK_CONTROL);
		}
		else if(NativeKeyEvent.getKeyText(arg0.getKeyCode()) == "NumPad 7" && data.length>0)
		{
			if(!contains(data , result))
			{
				int ind = checknull(data);
				if(ind>=0)
				{
					data[ind] = result;
				}
				else
				{
					data[overflow] = result;
					overflow++;
					if(overflow==9)
					{
						overflow =0;
					}
				}
			}
			System.out.println("=================================================================================True============================================");
			System.out.println("================================================================================" + data[4] + "==================================");
			stringSelection = new StringSelection(data[6]);
			clipboard.setContents(stringSelection, null);
			robot.keyPress(KeyEvent.VK_BACK_SPACE);
			robot.keyRelease(KeyEvent.VK_BACK_SPACE);
			 robot.keyPress(KeyEvent.VK_CONTROL);
			  robot.keyPress(KeyEvent.VK_V);
			  robot.keyRelease(KeyEvent.VK_V);
			  robot.keyRelease(KeyEvent.VK_CONTROL);
		}
		else if(NativeKeyEvent.getKeyText(arg0.getKeyCode()) == "NumPad 8")
		{
			if(!contains(data , result))
			{
				int ind = checknull(data);
				if(ind>=0)
				{
					data[ind] = result;
				}
				else
				{
					data[overflow] = result;
					overflow++;
					if(overflow==9)
					{
						overflow =0;
					}
				}
			}
			System.out.println("=================================================================================True============================================");
			System.out.println("================================================================================" + data[4] + "==================================");
			stringSelection = new StringSelection(data[7]);
			clipboard.setContents(stringSelection, null);
			robot.keyPress(KeyEvent.VK_BACK_SPACE);
			robot.keyRelease(KeyEvent.VK_BACK_SPACE);
			 robot.keyPress(KeyEvent.VK_CONTROL);
			  robot.keyPress(KeyEvent.VK_V);
			  robot.keyRelease(KeyEvent.VK_V);
			  robot.keyRelease(KeyEvent.VK_CONTROL);
		}
		else if(NativeKeyEvent.getKeyText(arg0.getKeyCode()) == "NumPad 9")
		{
			if(!contains(data , result))
			{
				int ind = checknull(data);
				if(ind>=0)
				{
					data[ind] = result;
				}
				else
				{
					data[overflow] = result;
					overflow++;
					if(overflow==9)
					{
						overflow =0;
					}
				}
			}
			System.out.println("=================================================================================True============================================");
			System.out.println("================================================================================" + data[4] + "==================================");
			stringSelection = new StringSelection(data[8]);
			clipboard.setContents(stringSelection, null);
			robot.keyPress(KeyEvent.VK_BACK_SPACE);
			robot.keyRelease(KeyEvent.VK_BACK_SPACE);
			 robot.keyPress(KeyEvent.VK_CONTROL);
			  robot.keyPress(KeyEvent.VK_V);
			  robot.keyRelease(KeyEvent.VK_V);
			  robot.keyRelease(KeyEvent.VK_CONTROL);
		}
		else if(NativeKeyEvent.getKeyText(arg0.getKeyCode()) == "NumPad 0")
		{
			if(!contains(data , result))
			{
				int ind = checknull(data);
				if(ind>=0)
				{
					data[ind] = result;
				}
				else
				{
					data[overflow] = result;
					overflow++;
					if(overflow==9)
					{
						overflow =0;
					}
				}
			}
			System.out.println("=================================================================================True============================================");
			System.out.println("================================================================================" + data[4] + "==================================");
			robot.keyPress(KeyEvent.VK_BACK_SPACE);
			robot.keyRelease(KeyEvent.VK_BACK_SPACE);
			String coll= "";
			for(int i=1;i<(data.length)-1;i++)
			{
				if(data[i]!= null)	
				{
					coll = coll + data[i] + " ";
				}
				else 
					break;
				
			}
			stringSelection = new StringSelection(coll);
			clipboard.setContents(stringSelection, null);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			
		}
		else if(NativeKeyEvent.getKeyText(arg0.getKeyCode()) == "Q")
		{
			robot.keyPress(KeyEvent.VK_BACK_SPACE);
			robot.keyRelease(KeyEvent.VK_BACK_SPACE);
			System.gc();
			System.exit(0);
		}
	}

	@Override
	public void nativeKeyReleased(NativeKeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void nativeKeyTyped(NativeKeyEvent arg0) {
		// TODO Auto-generated method stub		
	}
	public boolean contains(String[] data , String element)
	{
		for(int i=0;i<data.length;i++)
		{
			if(data[i]== null)
				return false;
			if(data[i].equals(element))
			{
				return true;
			}
		}
		return false;
	}
	public int checknull(String[] data)
	{
		for(int i=0;i<data.length;i++)
		{
			if(data[i] == null)
				return i;
		}
		return -1;
	}
	public void save()
	{
		if(!contains(data , result))
		{
			int ind = checknull(data);
			if(ind>0)
			{
				data[ind] = result;
			}
			else
			{
				data[overflow] = result;
				overflow++;
				if(overflow==9)
				{
					overflow =0;
				}
			}
		}
	}
	
	public static void main(String[] args) throws Exception
	{
		try
		{
			GlobalScreen.registerNativeHook();
		}
		catch (NativeHookException ex)
		{
			System.err.println("there was an error registring hook!!");
			
		}
		keys k = new keys();
		GlobalScreen.addNativeKeyListener(k);
		Logger logger = Logger.getLogger(GlobalScreen.class.getPackage().getName());
		logger.setLevel(Level.OFF);
		//Toolkit toolkit = Toolkit.getDefaultToolkit();
		//Clipboard clipboard = toolkit.getSystemClipboard();
		
		String prev;
		try
		{
			prev = (String) k.clipboard.getData(DataFlavor.stringFlavor);
		}
		catch(Exception e)
		{
			prev = "";
		}
		System.out.println("=====================================" + prev + "=======================================");
		//System.out.println("String from Clipboard:" + result);
		int ind =0;
		while (true)
		{
			Thread.sleep(1000);
			
			result =  (String) k.clipboard.getData(DataFlavor.stringFlavor);
			
			if(!prev.equals(result))
			{
				if(!k.contains(keys.data,prev))
					keys.data[ind] =prev;
				prev = result;
				ind++;
			}
			if(ind==10)
			{
				ind=0;
			}
		}
	}
	
	
}
