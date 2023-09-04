/* ************************************************************************** */
/*                                                                            */
/*                                                 :       ::    :: ::   ::   */
/*   DialogWithLoop.java                          :+:      :+    :+ :+  :+    */
/*                                               +:+:+     :+    :+ :+  :+    */
/*   By: ykliek <yurii.kliek@auk.edu.ua>        +#   :+    +#    :+ +#:+      */
/*                                             +#+#+#+#+   +#    +# +# +#     */
/*   Created: 2023/09/04 23:03:06 by ykliek   #+       #+  #+    #+ #+  #+    */
/*   Updated: 2023/09/04 23:03:07 by ykliek  ##         ##  ######  ##   ##   */
/*                                                                            */
/* ************************************************************************** */

package part_2;

import java.util.Scanner;

/**
 * This class demonstrates task 4.2: the use of for loop in Java.
 */
public class DialogWithLoop {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String isOn = "Y";

		System.out.println("42!");

		while (isOn.equals("Y")) {
			System.out.println("Write your favorite quote: ");
			String input = scanner.nextLine();
			System.out.println(input.toUpperCase());
			System.out.println("Do you want to continue? (Y/N)");
			isOn = scanner.nextLine();
		}
	}
}
