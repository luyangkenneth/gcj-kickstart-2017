import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int numCases = sc.nextInt();

    for (int caseId = 1; caseId <= numCases; caseId++) {
      // Inputs
      long numL = sc.nextLong();
      long numR = sc.nextLong();

      // Processing
      long maxPairs = Math.min(numL, numR);
      long ans = maxPairs * (1 + maxPairs) / 2;

      // Print
      p("Case #" + caseId + ": " + ans);
    }
  }

  //////////

  private static void p() {
    p("");
  }

  private static void p(String s) {
    System.out.println(s);
  }
}
