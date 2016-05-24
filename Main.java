import java.util.*;

public class Main
{
	ArrayList<String> s;
	ArrayList<String> a;
	ArrayList<String> result;
	String inp;
	public Main(String inp)
	{
		this.inp = inp;
		s= strg.StringtoList(inp);
		a = new ArrayList<String>();
	}
	public static void main(String[] args)
	{
		Main m= new Main("permutayu");
		m.perm(m.s);
		for(int i=0;i<m.a.size();i++)
		{
			System.out.println(m.a.get(i));
		}
		System.out.println(m.a.size());
		
	
	}
	public void perm(ArrayList<String> str)
	{
		
		
		for(int i =0;i<s.size();i++)
		{
			for(int j=i+1;j<str.size();j++)
			{
				if(check(s.get(i), str.get(j)))
				{
					String d= s.get(i) + str.get(j);
					if(!a.contains(d))
					a.add(d);
					d= strg.reverse(d);
					if(!a.contains(d))
					a.add(d);
				}
			}
		}
		for (int i=0;i<a.size();i++)
		{
			//strg.displist(a);
			if(a.get(i).length()<inp.length())
			{
				str =(ArrayList<String> )strg.copylist(a);
				a.clear();
				perm(str);
			}
		}
	}
	public boolean check(String c , String d)
	{
		
		for(int i =0;i<c.length();i++)
		{
			for(int j=0;j<d.length();j++)
			{
				if(c.charAt(i) == d.charAt(j))
				{
					return false;
				}
			}
		}
		return true;
	}
	
}
