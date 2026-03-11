package Learning;

public class Find_2nd_largest {

	public static void main(String[] args) {
		//Firstly arrange the Elements In ascending order and then select the 2ndElement
		// TODO Auto-generated method stub

		int temp, size;
	      int array[] = {10, 20, 25, 63, 96, 57};
	      size = array.length;

	      for(int i = 0; i<size; i++ ){
	         for(int j = i+1; j<size; j++){

	            if(array[i]>array[j]){
	               temp = array[i];
	               array[i] = array[j];
	               array[j] = temp;
	            }
	         }
	      }
	      System.out.println("Third second largest number is:: "+array[size-2]);
	   
		
	}

}
