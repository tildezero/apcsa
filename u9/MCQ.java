package u9;

class MCQ {
  public static void main(String[] args) {
    char[][] answers = loadAnswers();
    char[] key = loadKey();
    int[] grades = gradeMCQ(answers, key); /* WRITE ME */
    printGrades(grades);
  }

  private static int[] gradeMCQ(char[][] answers, char[] key) {
    // make the grades array
    int[] grades = new int[answers.length];
    // loop through each student (row)
    for (int i = 0; i < answers.length; i++) {
      int cc = 0;
      // loop through each answer
      for (int j = 0; j < answers[i].length; j++) {
        if (answers[i][j] == key[j]) {
          cc++;
        }
      }
      grades[i] = cc;
    }

    return grades;

  }

  private static char[][] loadAnswers() {
    char[][] answers = {
      {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
      {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
      {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
      {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
      {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
      {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
      {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
      {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}
    };
    return answers;
  }

  private static char[] loadKey() {
    char[] key = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
    return key;
  }

  private static void printGrades(int[] grades) {
    for (int i = 0; i < grades.length; i++) {
      System.out.println("Student " + i + ": " + grades[i]);
    }
  }
}
