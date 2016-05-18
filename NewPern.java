import java.util.ArrayList;


public class NewPern {
	static ArrayList<Long> gennines(long colsize)
	{
		ArrayList<Long> list = new ArrayList<Long>();
		list.add((long) 9);
		if(colsize==2)
			return list;
		long lim =0;
		for(int i=1;i<colsize-1;i++)
		{
			lim = lim + nPr(i);
		}
		System.out.println("++++++++++++++++++++++++++++++++++++++lim :" + lim);
		for(int i=1;i<colsize-1;i++)
		{
			long num = (long) (9 * Math.pow(10, i));
			long bnum=0;
			list.add(num);
			//while(bnum<Math.pow(10,i+1))
			for(int k=0;k<lim;k++)
			{
				for(int j=0;j<list.size();j++)
				{
					bnum = num + list.get(j);
					if(bnum<Math.pow(10, i+1))
					{
						list.add(bnum);
						System.out.println(bnum + "");
					}
				}
				
			}
		}
		return list;
	}
	private static long StringtoNum(String s)
	{
		String num = "";
		for(int i=0;i<s.length();i++)
		{
			num = num + (i+1);
		}
		return Long.parseLong(num);
	}
	
	public static void permute(String inp)
	{
		long num = StringtoNum(inp);
		permstring s = new permstring();
		int numlen = (num + "").length();
		long limit = s.fact(numlen);
		ArrayList<Long> list = new ArrayList<Long>();
		ArrayList<Long> gen = permstring.gennines(numlen);
		for(int i =0;i<gen.size();i++)
		{
			long el = num + gen.get(i);
			if(permstring.chkValid(el))
			{
				if(!list.contains(el))
				{
					list.add(el);
					try{
						longtoString(list.get(i) , inp);
					}
					catch(IndexOutOfBoundsException e){}
				}
			}
		}
		
		for(int i=0;i<limit;i++)
		{
			for(int j=0;j<gen.size();j++)
			{
				try
				{
					long el = list.get(i) + gen.get(j);
					if(permstring.chkValid(el))
					{
						if(!list.contains(el))
						{
							list.add(el);
							
						}
					}
				}
				catch (IndexOutOfBoundsException e)
				{}
			}
		}
		list.add(num);
		for(int i=0;i<list.size();i++)
		{
			longtoString(list.get(i) , inp);
		}
		System.out.println("size is " + list.size());
	}
	
private static void longtoString(Long num , String input)
	{
		String ind = num.toString();
		String r = "";
		for(int i=0;i<ind.length();i++)
		{
			r = r+ input.charAt(Integer.parseInt(ind.charAt(i)+"")-1);
		}
		System.out.println(r);
	}
	
	public static void main(String[] args) {
		//permute("permutation");
		ArrayList<Long> s= gennines(11);
		System.out.println(s.size() +"");
		for(int i=0;i<s.size();i++)
			System.out.println(s.get(i) + "");
	}
	
	private static long nPr(int r)
	{
		if(r>1)
		{
			permstring s = new permstring();
			int numnine=r;
			int numzero = r-1;
			long sum = s.fact(r+1)/s.fact(numnine)*s.fact(numzero);
			return sum;
		}
		else
			return 1;
	}
}
