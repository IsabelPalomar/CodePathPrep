package unit2.excercises;

public class ReverseString {

  public static void main(String[] args) {
    System.out.println(reverseWrong("HOLA"));
    System.out.println(reverseCorrect("HOLA"));

  }

  /**
   * Strings’ immutability means that the String variable `ans` is actually destroyed and re-created every time a new
   * character is added to it. Each time a new String is created for `ans`, Java allocates a new array of size `x +
   * 1`, where `x` is the number of characters in the existing String. Java then copies the existing `x` character
   * over and inserts the new character into the last slot. If `n` is the size of the given String, the loop means
   * this happens `n` times. Thus, the total time spent computing ans is `O(1 + 2 + 3 + … + n)`. By summation, this
   * reduces to `n(n+1)/2` or `O(n^2)`. No matter how efficient the algorithm, the function has at best quadratic
   * runtime – terrible.
   */
  public static String reverseWrong(String x) {
    // convert x into an array
    char[] string = x.toCharArray();
    // create variable to hold answer
    String ans = "";
    // iterate from the back of the array, each time adding a character to ans
    for (int i = string.length - 1; i >= 0; i--) {
      ans += string[i];
    }
    // return as a String
    return ans;
  }

  /**
   * The solution is to use a `StringBuffer`. This is an array pre-allocated with spare memory, with additional
   * characters inserting into the array itself. Dynamic arrays can also be used, if sizes are not known beforehand. The
   * final String is only created once all String manipulation operations have concluded. With only one pass through the
   * characters, total time drops to `O(n)` – linear. Java has kindly provided the helpful `StringBuffer` class for
   * this. Unlike `Strings`, the `StringBuffer` class is mutable, eliminating our quadratic runtime problem.
   */
  public static String reverseCorrect(String x) {
    // convert x into an arrayj
    char[] string = x.toCharArray();
    // create the StringBuffer object
    StringBuffer buffer = new StringBuffer();
    // iterate from the back of the array, each time adding a character to buffer
    for(int i = string.length - 1; i >= 0; i--) {
      buffer.append(string[i]);
    }
    return buffer.toString();
  }

}
