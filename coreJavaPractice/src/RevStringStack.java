import java.util.Stack;

public class RevStringStack {

	public static void main(String[] args) {

		String string = "abc abc abc";
		rev(string);
		revOfString(string);

	}

	private static void revOfString(String string) {
		
		StringBuilder out=new StringBuilder();
		for(int i=string.length()-1;i>=0;i--)
		{
			char ch = string.charAt(i);
			out.append(ch);
		}
		System.out.println(out.toString());
		
	}

	private static void rev(String string) {

		Stack<Character> st = new Stack<>();
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) != ' ') {
				st.push(string.charAt(i));
			} else {
				while (st.empty() == false) {
					System.out.print(st.pop());
				}
				System.out.print(" ");
			}
			
		}
		while (st.empty() == false) {
			System.out.print(st.pop());
		}

	}

}
