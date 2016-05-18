import java.util.ArrayList;


public class strg {
	public void ref(int n)
	{
		n+=10;
		System.out.println("in ref" + n);
	}
	static public boolean Checknull(String s)
	{
		try
		{
			if(s.length()>0)
			{
				return false;
			}
			return true;
		}
		catch(NullPointerException e)
		{
			return true;
		}
	}
	static public boolean isEqual(String s1 , String s2)
	{
		if(s1.length() == s2.length())
		{
			for(int i=0;i<s1.length();i++)
			{
				if(s1.charAt(i) != s2.charAt(i))
				{
					return false;
				}	
			}
			return true;
		}
		return false;
	}
	public static String Assign(String from , String to)
	{
		if(!Checknull(from))
		{
			to = "";
			for(int i = 0;i<from.length();i++)
			{
				to = to + from.charAt(i);
			}
			return to;
		}
		return null;
	}
	static public ArrayList<?> copylist(ArrayList<?> src)
	{
		ArrayList<String> list = new ArrayList<String>();
		long s = src.size();
		if(s>0)
		{
			for(int i=0;i<s;i++)
			{
				String  el= (String)src.get(i);
				list.add(el);
			}
		}
		return list;
	}
	static public String copy(String s)
	{
		String temp = "";
		for(int i=0;i<s.length();i++)
		{
			temp = temp + s.charAt(i);
		}
		return temp;
	}
	static public ArrayList<String> StringtoList(String s)
	{
		ArrayList<String> retlist= new ArrayList<String>();
		for(int i= 0;i<s.length();i++)
		{
			retlist.add(s.charAt(i) + "");
		}
		return retlist;
	}
	public static void main(String[] args) {
		int n=10;
		strg s = new strg();
		s.ref(n);
		System.out.println(n);
		strg S = new strg();
		String chk = "";
		System.out.println((s.Checknull(chk)));
		ArrayList<String> l = new ArrayList<String>();
		l.add("ankit");
		ArrayList<String> a = (ArrayList<String>) S.copylist(l);
		a.add("Working!!");
		for(int g= 0;g<l.size();g++)
			System.out.println(l.get(g));
		System.out.println("ArrayList-a");
		for(int h=0;h<a.size();h++)
		{
			System.out.println(a.get(h));
		}
	}
}
