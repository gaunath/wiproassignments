package com.wipro.assignment.palindromeFinder;

import java.util.Scanner;

/**
 * @author gaunath
 *
 */
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your String ? ");
		String longestPalindromeString = longestPalindromeString(scanner.next());
		System.out.print("Your longestPalindrome String ? " + longestPalindromeString);
	}

	public static String longestPalindromeString(String in) {
		char[] input = in.toCharArray();
		int longestPalindromeStart = 0;
		int longestPalindromeEnd = 0;

		for (int mid = 0; mid < input.length; mid++) {
			// for odd Palindrome case
			int left = mid - 1;
			int right = mid + 1;
			while (left >= 0 && right < input.length) {
				if (input[left] == input[right]) {

					if (right - left > longestPalindromeEnd - longestPalindromeStart) {
						longestPalindromeStart = left;
						longestPalindromeEnd = right;
					}
				}
				left--;
				right++;
			}
			// for even palindrome
			left = mid - 1;
			right = mid + 2;
			while (left >= 0 && right < input.length)

			{
				if (input[left] == input[right]) {
					if (right - left > longestPalindromeEnd - longestPalindromeStart) {
						longestPalindromeStart = left;
						longestPalindromeEnd = right;
					}
				}
				left--;
				right++;
			}
		}
		// after the loop we return
		return in.substring(longestPalindromeStart, longestPalindromeEnd + 1);

	}
}
