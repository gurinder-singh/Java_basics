package Learning;

public class Find_max_min_in_array {
	
	public static void main(String args[])
	  {
	int arr[] = {12, 13, 1, 10, 34, 10};

    int max = arr[0];

    for(int i=0; i<arr.length; i++)
    {
      if(max < arr[i])
      {
         max = arr[i];
      }

    }
    
    int min = arr[0];
    for(int i=0;i<arr.length;i++) {
    	if(min>arr[i])
    	{
    		min=arr[i];
    	}
    }

   System.out.println("maximum in the array is "+max); 
   System.out.println("Mnimum in the array is "+min);
 }

	
	
}
