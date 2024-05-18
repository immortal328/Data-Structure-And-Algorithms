package dsa.data_structure.a_string;

public class ReverseString {
	public static void main(String[] args) {
		
		String str = "Amar";
		String[] charArray = str.split("");		
		StringBuilder strBuilder = new StringBuilder(str);
		System.out.println("Revsered Using StringBuilder :"+strBuilder.reverse());
		System.out.println("Reversed String Array : "+ String.valueOf(charArray.toString()));
		
		Thread tsd = new Thread();
		
		String amr ="amaar";
		System.out.println(amr.contains("am"));
		System.out.println(amr.contains("ma"));
		System.out.println(amr.contains("ar"));
		System.out.println(amr.contains("aa"));
		System.out.println(amr.contains("aaa"));
	}
	
	public void revserStringArray(String[] charArray) {
		int start =0;
		int end = charArray.length-1;
		while(start < end) {
			String temp = charArray[start];
			charArray[start] = charArray[end];
			charArray[start] = temp;
		}		
	}
	
	public static void printArray(){
		
	}
}
