/* ************************************************************************** */
/*                                                                            */
/*                                                 :       ::    :: ::   ::   */
/*   PrintChar.java                               :+:      :+    :+ :+  :+    */
/*                                               +:+:+     :+    :+ :+  :+    */
/*   By: ykliek <yurii.kliek@auk.edu.ua>        +#   :+    +#    :+ +#:+      */
/*                                             +#+#+#+#+   +#    +# +# +#     */
/*   Created: 2023/09/04 23:02:52 by ykliek   #+       #+  #+    #+ #+  #+    */
/*   Updated: 2023/09/04 23:02:53 by ykliek  ##         ##  ######  ##   ##   */
/*                                                                            */
/* ************************************************************************** */

package part_1;

/**
 * This class demonstrates task 4.1.3: the use of for loop in Java.
 */
public class PrintChar {
	public static void main(String[] args) {
		String str = "Don't Panic!";

		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
	}
}
