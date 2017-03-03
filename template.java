import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int numCases = sc.nextInt();

    for (int caseId = 1; caseId <= numCases; caseId++) {
      // Inputs
      int numLines = sc.nextInt();
      sc.nextLine();

      // Setup
      String ans = "";

      for (int i = 0; i < numLines; i++) {
        String name = sc.nextLine();

        // Processing
      }

      // Print results
      // String ans = new DecimalFormat("#0.000000000000").format(someFloatorDouble);
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
