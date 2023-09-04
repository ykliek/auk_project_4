/* ************************************************************************** */
/*                                                                            */
/*                                                 :       ::    :: ::   ::   */
/*   InsertionSort.java                           :+:      :+    :+ :+  :+    */
/*                                               +:+:+     :+    :+ :+  :+    */
/*   By: ykliek <yurii.kliek@auk.edu.ua>        +#   :+    +#    :+ +#:+      */
/*                                             +#+#+#+#+   +#    +# +# +#     */
/*   Created: 2023/09/04 23:02:39 by ykliek   #+       #+  #+    #+ #+  #+    */
/*   Updated: 2023/09/04 23:02:41 by ykliek  ##         ##  ######  ##   ##   */
/*                                                                            */
/* ************************************************************************** */

package part_1;

/**
 * This class demonstrates task 4.1.3: the use of nested loops in Java.
 */
public class InsertionSort {
	public static void main(String[] args) {
		int[] arr = {17, 27, 3, 16, 13, 10, 1, 5, 7, 12, 4, 8, 9, 0};
		insertionSort(arr);
		printArray(arr);
	}

	/**
	 * Sorts an array using insertion sort.
	 * @param array The array to be sorted.
	 */
	public static void insertionSort(int[] array) {
		int n = array.length;
		for (int i = 1; i < n; ++i) {
			int key = array[i];
			int j = i - 1;

			// Move elements of array[0...i-1] that are greater than key
			// to one position ahead of their current position
			while (j >= 0 && array[j] > key) {
				array[j + 1] = array[j];
				j = j - 1;
			}
			array[j + 1] = key;
		}
	}

	/**
	 * Prints the array.
	 * @param arr The array to be printed.
	 */
	public static void printArray(int[] arr) {
		for (int value : arr) {
			System.out.print(value + " ");
		}
		System.out.println();
	}
}
