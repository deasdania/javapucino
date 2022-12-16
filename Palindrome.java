class Palindrome {
    private static boolean palindromeF(String value) {
        String reverse = "";
        int length = value.length();
        for (int i = length -1; i >= 0; i--){
            reverse = reverse + value.charAt(i);
        }
        if (value.equals(reverse)){
            return true;
        }
      return false;
    }
  
    public static void main(String args[]) {
      System.out.println(palindromeF("civic")); // true
      System.out.println(palindromeF("katak")); // true
      System.out.println(palindromeF("kasur rusak")); // true
      System.out.println(palindromeF("kupu-kupu")); // false
      System.out.println(palindromeF("lion")); // false
    }
  
  }