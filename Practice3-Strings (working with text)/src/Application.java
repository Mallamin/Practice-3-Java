
public class Application {
	public static void main(String[] args) {
		
		int myInt=8;
		//String is an object; text is capable of not holding but of referring
		//to an object of type String and hello is an instance of String 
		String text="hello";
		System.out.println(myInt);
		System.out.println(text);
		//Concatenating strings
		String empty= " ";
		String name="Lamin";
		String greeting=text+empty+name;
		System.out.println(greeting);
		System.out.println("hello" + " " + "Lamin");
		// Concatenating strings and other types
		System.out.println("My integer is:"+myInt);
		double myDouble=3.6;
		System.out.println("My number is:"+myDouble);
		
}
}
