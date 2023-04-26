package com.shaheen;

public class ReverseSubString {
  public String reverse(String originalString) {
    System.out.println(String.format("Input: %s", originalString));
    int startIndex = originalString.indexOf("(");
    while (startIndex != -1) {
      int endIndex = originalString.indexOf(")", startIndex);
      if (endIndex != -1) {
        String substring = originalString.substring(startIndex + 1, endIndex);
        StringBuilder reversedSubstring = new StringBuilder(substring).reverse();
        originalString = originalString.substring(0, startIndex + 1) + reversedSubstring + originalString.substring(endIndex);
      }
      startIndex = originalString.indexOf("(", startIndex + 1);
    }
    System.out.println(String.format("Output: %s", originalString));
    return originalString;
  }
}
