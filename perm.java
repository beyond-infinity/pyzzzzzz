import java.util.ArrayList;


public class perm {

	/**
	 * @param args
	 */
	ArrayList<String> inp;
	ArrayList<String> oper;
	ArrayList<String> list;
	public static void main(String[] args) {
		perm p = new perm();
		p.permute("ankit");
	}
	static public long fact(long n)
	{
		if(n>0)
		{
			return n* fact(n-1);
		}
		return 1;
	}
	 public void permute(String s)
	{
		
		inp = strg.StringtoList(s);
		oper = (ArrayList<String>) strg.copylist(inp);
		System.out.println(oper.size()+"");
		
		list = new ArrayList<String>();
		list.add(s);
			for(int j = oper.size()-1;j>-1;j--)
			{
				String temp2 = oper.remove(j);
				String temp = oper.remove(j);
				oper.add(j-1 , temp2);
				oper.add(j , temp);
				String g = strg.listtostring(oper);
				if(!list.contains(g))
				{
					System.out.println(g);
					list.add(g);
					permute(g);
				}
				oper = (ArrayList<String>) strg.copylist(inp);
			}
	}
	
}
