import java.util.*;
public class TextToSpeech {

	public static void main(String[] args) {
		System.out.println("You are welcome sir\nPlease what's your name");
		Scanner take = new Scanner(System.in);
		String name;
		name = take.nextLine();
		System.out.println("You are welcome Mr. "+name);

	}

}
