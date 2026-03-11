package Learning;

public class Reverse_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s = "Gurinder";
        String r = "";

        for (int i = 0; i < s.length(); i++){
            
            // prepend each character
            r = s.charAt(i) + r; 
        }
        System.out.println(r);
		
	}

}
