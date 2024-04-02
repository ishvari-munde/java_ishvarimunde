class ReplaceChar 
{
	public static void main(String args[])
	{
		String s = "anmdjyf 248 ! @ # $ %" ; 

		//use repaceAll( "[^replace all other than this]" , " by it")
		String s1 = s.replaceAll("[^a-zA-Z0-9]", " ");
		System.out.println(s1);
	}
}