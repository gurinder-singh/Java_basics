package Data_structures;

public class new_to_strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* 1️⃣ What is a String?

  A String is a sequence of characters.
  "hello"
"QAEngineer"
"automation123"
String str = "hello";

2️⃣ String Length
String str = "hello";
System.out.println(str.length());

3️⃣ Access Characters from String
char ch = str.charAt(1);
System.out.println(ch);

 */
		
		Revers_a_string();{
			
		}
		To_check_a_string_is_palindrome();{
			 
		 }
		To_count_number_of_vowels_in_a_string();{
			
		}
		
	}

	



	private static void Revers_a_string() {
		// TODO Auto-generated method stub
		String s = "Gurinder";
        String r = "";

        for (int i = 0; i < s.length(); i++){
            
            // prepend each character
            r = s.charAt(i) + r; 
        }
        System.out.println(r);
		
	}
	private static void To_check_a_string_is_palindrome() {
		// TODO Auto-generated method stub
		String str = "level";
        String rev = "";

        for(int i = str.length() - 1; i >= 0; i--){
            rev = rev + str.charAt(i);
        }

        if(str.equals(rev)){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    
	}
	private static void To_count_number_of_vowels_in_a_string() {
		// TODO Auto-generated method stub
		String str = "GeeksForGeeks";
        str = str.toLowerCase();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' 
            	|| str.charAt(i) == 'e'
                || str.charAt(i) == 'i'
                || str.charAt(i) == 'o'
                || str.charAt(i) == 'u') {
                count++;
            }
        }
        System.out.println("Total no of vowels in string are: " + count);
    }
	}
	 


