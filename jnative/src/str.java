
public class str {
	public void ref(int n)
	{
		n+=10;
		System.out.println("in ref" + n);
	}
	public static void main(String[] args) {
		int n=10;
		str s = new str();
		s.ref(n);
		System.out.println(n);
		
	
		
	}
}
