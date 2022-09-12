public class Ex01TauBautista {

	public static void main(String[] args) {
		String name1 = "Micah";
		int age1 = 15;
		String faveMilktea1 = "Taro";

		String name2 = "Skylar";
		int age2 = 16;
		String faveMilktea2 = "Matcha";

		String name3 = "Ashlynn";
		int age3 = 15;
		String faveMilktea3 = "Wintermelon";

		int totalAge = age1 + age2 + age3;
		boolean sameAge = age1 == age3;
		boolean milkteaFlavor = false;

		if ((faveMilktea1.equals(faveMilktea2)) && (faveMilktea2.equals(faveMilktea3)) && (faveMilktea3.equals(faveMilktea1))) {
			milkteaFlavor = true;
		}

		System.out.printf("The sum of Micah, Skylar, and Ashlynn's ages is %d%n", totalAge);
		System.out.printf("Micah and Ashlynn are at the same age: %b%n", sameAge);
		System.out.printf("All three of them have the same favorite milktea flavor: %b%n", milkteaFlavor);
	}
	
}