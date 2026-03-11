package Data_structures;

public class New_to_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		suminanarray();{
			
		}
		
		find_largest_in_array();{
			
		}
		
		count_even_in_array();{
	}
		
		reverse_element_in_array();{
			
		}
		
	}

	

	private static void reverse_element_in_array() {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6};
		
		int n=arr.length;
		for(int i=n-1;i>=0;i--) 
			System.out.print(+arr[i]);
		
	}



	private static void suminanarray() {
		// TODO Auto-generated method stub
		int arr[] = {5,10,15};
        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }

        System.out.println("Sum is: " + sum);
	}
	
			
			
			private static void find_largest_in_array() {
				
				
				int numbers[]= {3,7,2,9,4};
				int max= numbers[0];
				for(int i=0;i<numbers.length;i++) {
					if(max<numbers[i]) {
						max=numbers[i];
					}
					
				}
				System.out.println("The maximum in the numbers array is " +max);
				
			}
			private static void count_even_in_array() {
				// TODO Auto-generated method stub
				
				int arr[]= {11,12,20,24,29,31,36,54,89,93};
				int n=arr.length;
				int count_even = 0, count_odd = 0;
				
				for(int i=0;i<n;i++) {
					if((arr[i]%2)== 0){
						count_even+=1;
					}else
						count_odd+=1;
				}
				System.out.println("The number of Even Elements in an array is "+count_even);
				System.out.println("The Number of odd Elements in an array is "+count_odd);
			}

}
