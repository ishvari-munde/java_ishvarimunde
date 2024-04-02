class FibonacciSeries
{
	public static void main(String args[])
	{
		int num= 16 ,i ;
		int a= 0, b=1 ;
		System.out.print(a+","+b+ ",");
		int nextNum;

  for(i=2; i<num;  i++)
  {
  	nextNum= a+b;
  	a= b;
  	b=nextNum;

  
  System.out.print(nextNum+",") ;
}

}
}

