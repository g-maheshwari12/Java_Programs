public class Replace {
	public static void main(String[] args) {
		String str = args[0];
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '0') {
				str.chatAt(i) = str.charAt(i) + 1;
			}
		}
		System.out.print("The updated number is --> " + str);
	}
}