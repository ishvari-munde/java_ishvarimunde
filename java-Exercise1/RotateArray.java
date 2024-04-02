public class RotateArray
{
    public static void main(String args[])
    {
    	int array[] = { 36, 20, 6, 11, 40, 10, 4, 55, 7} ;
         int temp =array[0];

         for ( int i=1 ; i< array.length; i++)
         {
         	array[i-1]= array[i] ;
         }
    
    array[array.length-1] =temp ;

    for (int i: array )
    	{
          System.out.println(i);
    	}

}
}