/* ************************************************************************** */
/*                                                                            */
/*                                                 :       ::    :: ::   ::   */
/*   DoWhile.java                                 :+:      :+    :+ :+  :+    */
/*                                               +:+:+     :+    :+ :+  :+    */
/*   By: ykliek <yurii.kliek@auk.edu.ua>        +#   :+    +#    :+ +#:+      */
/*                                             +#+#+#+#+   +#    +# +# +#     */
/*   Created: 2023/09/04 23:02:17 by ykliek   #+       #+  #+    #+ #+  #+    */
/*   Updated: 2023/09/04 23:02:19 by ykliek  ##         ##  ######  ##   ##   */
/*                                                                            */
/* ************************************************************************** */

package part_1;

import java.util.Scanner;

/**
 * This class demonstrates task 4.1.1: the use of do-while loop in Java.
 */
public class DoWhile {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number;

		do {
			System.out.print("Enter a number between 1 and 10: ");
			number = scanner.nextInt();
		} while(number < 1 || number > 10);
		System.out.println("You entered a valid number: " + number);
	}
}
