import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int numCases = sc.nextInt();

    for (int caseId = 1; caseId <= numCases; caseId++) {
      int numPeople = sc.nextInt();
      sc.nextLine();

      int leaderScore = 0;
      String leaderName = "";

      // Each name contains max 20 chars and at least 1 uppercase letter (could have spaces)
      for (int i = 0; i < numPeople; i++) {
        String name = sc.nextLine();
        HashSet<Character> hashset = new HashSet<Character>();

        // Add all chars to HashSet
        for (int j = 0; j < name.length(); j++) {
          if (name.charAt(j) != ' ') hashset.add(name.charAt(j));
        }

        // A new leader has arrived!
        if (hashset.size() > leaderScore) {
          leaderScore = hashset.size();
          leaderName = name;
        } else if (hashset.size() == leaderScore && leaderName.compareTo(name) > 0) {
          leaderName = name;
        }
      }

      p("Case #" + caseId + ": " + leaderName);
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
