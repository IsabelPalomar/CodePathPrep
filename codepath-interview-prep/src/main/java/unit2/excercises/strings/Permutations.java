package unit2.excercises.strings;

public class Permutations {

  //TODO Improve solution
  public static void main(String[] args) {
    permutation("", "abc");
  }

  /**
   * The trick here is to realize that generating all permutations of a given String of size n always results in a O(n!)
   * time, both iteratively and recursively.
   * Consider the string “abc”. The first character ‘a’ can be placed in 3 slots – first, second and third. ‘b’ can be
   * placed in only 2 slots, since one slot is already taken by ‘a’. ‘c’ has no choice but to go into the remaining
   * slot. Hence the total permutations are 3 x 2 x 1 = 6 = 3!. Correspondingly, there are 6 permutations: “abc”, “acb”,
   * “bac”, “bca”, “cab” and “cba”.
   * We implement a recursive solution as it is more elegant and thus easier to understand
   */

  private static void permutation(String ans, String remain) {
    int n = remain.length();
    // ans serves as an accumulator variable
    // base case: we print out ans since there are no more letters to be added
    if (n == 0) {
      System.out.println(ans);
    }
    // recursive case
    else {
      for (int i = 0; i < n; i++) {
        // we call permutation, each time combining prefix with the individual letters in str
        // we also remove these letters from str
        permutation(ans + remain.charAt(i), remain.substring(0, i) + remain.substring(i + 1, n));
      }
    }
  }
}
