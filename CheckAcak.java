public class CheckAcak {
    private static boolean stringAcak(String str1,String str2 ) {
        int str1Len = str1.length();
        int str2Len = str2.length();
        if(str1Len != str2Len){
            return false;
        }
        if(str1 == str2){
            return false;
        } 
        int diff = 0;
        for (int i = 0; i < str1Len; i++) {
            if (str1.charAt(i) != str2.charAt(i)){
                diff++;
            }
        }
        if (diff > 0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String str1 = "malang";
        String str2 = "agmlan" ;
        boolean result = stringAcak(str1, str2);
        if (result){
            System.out.println("YA"); 
        } else {
            System.out.println("TIDAK"); 
        }
    }
}
