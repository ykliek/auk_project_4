/* ************************************************************************** */
/*                                                                            */
/*                                                 :       ::    :: ::   ::   */
/*   ImprovedDialogWithLoop.java                  :+:      :+    :+ :+  :+    */
/*                                               +:+:+     :+    :+ :+  :+    */
/*   By: ykliek <yurii.kliek@auk.edu.ua>        +#   :+    +#    :+ +#:+      */
/*                                             +#+#+#+#+   +#    +# +# +#     */
/*   Created: 2023/09/04 23:03:16 by ykliek   #+       #+  #+    #+ #+  #+    */
/*   Updated: 2023/09/04 23:03:18 by ykliek  ##         ##  ######  ##   ##   */
/*                                                                            */
/* ************************************************************************** */

package part_3;

import java.util.Scanner;

/**
 * This class demonstrates task 4.3: the use of for loop in Java.
 */
public class ImprovedDialogWithLoop {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String isOn = "Y";

		System.out.println("42!");

		while (isOn.equals("Y")) {
			System.out.println("Write your favorite quote: ");
			String input = scanner.nextLine();
			printReverseString(input);
			System.out.println("Do you want to continue? (Y/N)");
			isOn = scanner.nextLine();
		}
	}

	/**
	 * This method prints the reverse string.
	 * @param str - the string to be reversed.
	 */
	public static void printReverseString(String str) {
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
	}
}
