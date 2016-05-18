import java.util.ArrayList;
import java.util.Random;


public class permstring {
	public String input;
	
	public static void main(String[] args) {
		ninelogix(12345);
		//System.out.println(chkValid(1423));
		/*ArrayList<Long> list = gennines((long) 4);
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i) + "");*/
	}
	public static void randomlogix()
	{
		permstring s= new permstring();
		String input = "permutatations";
		ArrayList<String> output = new ArrayList<String>();
		ArrayList<Integer> num = new ArrayList<Integer>();
		for(long k =0;k<s.fact(input.length());k++)
		{
			for (int i = 0; i<input.length();i++)
			{
				Random r = new Random();
			
				if(i==0)
				{
					num.add(r.nextInt(input.length()));
				}
				else
				{
					int ind = r.nextInt(input.length());
					if(!num.contains(ind))
					{
						num.add(ind);
					}
					else
					{
						i--;
					}
				}
			}
			String temp = "";
			for(int j=0;j<num.size();j++)
			{
				temp = temp + input.charAt(num.get(j));
			}
			if(!output.contains(temp))
			{
				output.add(temp);
			}
			num.clear();
		}
		for(int h = 0;h<output.size();h++)
		{
			System.out.println(output.get(h));
		}
		
	}
	public long fact(long n)
	{
		if(n>0)
		{
			return n* fact(n-1);
		}
		return 1;
	}
	void diffmain()
	{
		String input = "ankit";
		ArrayList<String> list = strg.StringtoList(input);
		ArrayList<String> cpylist = (ArrayList<String>) strg.copylist(list);
		for(int i= 0;i<fact(list.size());i++)
		{
			for(int j=input.length();j<=0;j--)
			{
				for(int k = input.length()-j;k>=0;k--)
				{
					
				}
			}
		}
	}
	
	
	
	
	
	
	
	
	static void ninelogix(long len)
	{
		long num = len;
		int colsize = (len+"").length();
		permstring s = new permstring();
		long fact =  s.fact(colsize);
		System.out.println(fact+"");
		//long matrix[][] = new long[(int) fact][colsize];
		ArrayList<Long> mat = new ArrayList<Long>();
		ArrayList<Long> list = new ArrayList<Long>();
		ArrayList<Long> numbs = gennines(colsize);
		for(int l=0;l<numbs.size();l++)
			System.out.println(numbs.get(l)+ "");
		for(int i = 1,k=1,m=0;k<fact;k++,m++)
		{
			for(int j =1;j<colsize;j++)
			{
				if(k==1)
				{
					long el = num + numbs.get(j);
					//matrix[k][0] = num;
					if(chkValid(el))
					{
						//matrix[k][j] = el;
						if(!list.contains(el))
						{	
							list.add(el);
							i++;
						}
					}
				}
				else
				{
					/*for(int u=0;u<list.size();u++)
						System.out.println(list.get(u)+"=========================================");*/
					try{
						//matrix[k][0] = list.get(k-2);
						long el = list.get(m) + numbs.get(j);
						if(chkValid(el))
						{
							//matrix[k][j] = el;
							if(!list.contains(el))
							{
								list.add(el);
								i++;
							}
						}
					}
					catch(Exception e)
					{
						System.out.println("exception break");
						break;
					}
				}
			}
			if(i==fact)
			{
				System.out.println("limit break");
				break;
			}
		}
		
		
		for(int u=0;u<list.size();u++)
			System.out.println(list.get(u)+"=========================================");
	}
	
	
	
	
	static boolean chkValid(long num)
	{
		String s = num + "";
		ArrayList<String> p = strg.StringtoList(s);
		//System.out.println(s);
		int len = s.length();
		for(int i = 0;i<p.size();i++)
		{
			int h = Integer.parseInt(p.get(i));
			p.remove(i);
			if(!(h>0 && h<=len) || p.contains(h+""))
			{
				return false;
			}
			p = strg.StringtoList(s);
		}
		return true;
	}
	static ArrayList<Long> gennines(long colsize)
	{
		ArrayList<Long> list = new ArrayList<Long>();
		list.add((long) 9);
		if(colsize==2)
			return list;
		for(int i=1;i<colsize-1;i++)
		{
			long num = (long) (9 * Math.pow(10, i));
			long bnum=0;
			list.add(num);
			while(bnum<Math.pow(10,i+1))
			{
				for(int j=0;j<list.size();j++)
				{
					bnum = num + list.get(j);
					if(bnum<Math.pow(10, i+1))
					{
						list.add(bnum);
					}
				}
				
			}
		}
		return list;
	}
	static private boolean validnines(int n)
	{
		String s = n + "";
		
		for(int i =0;i<s.length();i++)
		{
			if(Integer.parseInt(s.charAt(i) + "")!=9 || Integer.parseInt(s.charAt(i)+ "")!=0)
			{
				return false;
			}
		}
		return true;
	}
}
