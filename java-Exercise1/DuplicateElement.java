public class DuplicateElement

{
	public static void main(String args[])
	{
		int array[] = { 2, 5, 0, 5, 7, 100, 25, 100, 0} ;


		boolean flag= false ;
		for(int i=0 ; i<array.length ; i++)
		{
			for (int j = i+1; j< array.length; j++)
			{
				if( array[i]== array[j])
				{
					System.out.println("Duplicate Element:" +array[i]);
					flag= true ;
				}
			}
		}
       if(flag==false)
       {
       	System.out.println("Duplicate Element not found");
       }




	}
}