class Main {
  private static boolean primerNumber(int number) {
    int countDivider = 0;
    for (int i = 2; i <= number; i++) {
      if (number % i == 0) {
        countDivider++;
      }
    }
    if (countDivider > 2) {
      return false;
    }
    return true;
  }

  public static void main(String args[]) {
    System.out.println(primerNumber(11)); // true
    System.out.println(primerNumber(13)); // true
    System.out.println(primerNumber(17)); // true
    System.out.println(primerNumber(20)); // false
    System.out.println(primerNumber(35)); // false
  }

}