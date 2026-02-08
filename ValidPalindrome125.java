/*- 32 (space)
- 33–47 → ! " # $ % & ' ( ) * + , - . /
- 58–64 → : ; < = > ? @
- 91–96 → `[ \ ] ^ _ ``
- 123–126 → { | } ~
 */
class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder c = new StringBuilder();
        for (char ch : s.toLowerCase().toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                c.append(ch);
            }
        }

int left = 0;

int right = c.length()-1;
while(left < right){
    if(c.charAt(left) == c.charAt(right)){
        left++;
        right--;
    }
    else{
        return false;
    }
}
    return true;
    }
}
class VaildPalindrome125 {
    public static void main(String args[]){
        String s = "God is Great";
        Solution obj = new Solution();
        System.out.println(obj.isPalindrome(s));
    }
}
