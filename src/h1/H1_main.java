package h1;

public class H1_main {
	public static void main(String[] args) {
		int [ ] myArray = {5, 6, 7, 10, 77};
		int [ ] notmyArray = {0, 0, 0, 0, 0};
		int ende = 0, nr = 0;
		
		
		
		ende = myArray.length -1;
		
		while (nr <= ende) {
			notmyArray[nr] = myArray[ende - nr];
			nr = nr + 1;
		}
		
		nr = 0;
		while (nr <= ende) {
			myArray[nr] = notmyArray[nr];
			nr = nr + 1;
		}
		
		System.out.println(myArray[0]);
		System.out.println(myArray[1]);		
		System.out.println(myArray[2]);
		System.out.println(myArray[3]);		
		System.out.println(myArray[4]);		}
}
