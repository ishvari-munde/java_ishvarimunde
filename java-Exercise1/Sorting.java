class Sorting
{
	public static void main(String args[])
	{
		int array[] = { 4,10 , 15, 2 ,6, 20, 1,3} ;
        
        sortFirstHalfAscending ( array);
        sortSecondHalfDescending(array) ;
        System.out.println("sorted array : ") ;
       for (int num : array)
       {
	         System.out.print(num +" ");

        }	
    }
    public static void sortFirstHalfAscending(int [] array)
    {
      for (int i =0 ; i < array.length/2-1 ; i++)
      {
	     for ( int j = i+1 ; j < array.length/2; j++)
	     {
	       if (array[i] > array[j]) 
	       {
	       
	 	    int temp = array [i];
	 	   array [i] = array[j];
	 	   array[j] = temp;
	   
          }

	     }
      }
}

public static void sortSecondHalfDescending(int [] array)
{
	for (int i = array.length/2; i< array.length-1; i++)
	{

	
	for ( int j= i+1 ; j< array.length; j++)
	{
	 if (array[i] < array[j]){
	 	int temp= array [i];
	 	array [i] = array[j];
	 	array[j] = temp;
	 
	 }
	}
}
}
}