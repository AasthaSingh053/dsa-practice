//List[string] --> string = encode
//string --> list[string] = decode
import java.util.*;
class Solution{
    public String encode(List<String> strs){
        StringBuilder sb = new StringBuilder();
        for(String s : strs){
        int i = 0;
        while(i<s.length()){
        if(s.charAt(i) == ";")
        {
            sb.append("/;");
        }
        if(s.charAt(i) == "/"){
            sb.append("//");
        }
        i++;
        }
        sb.append(";");
    }
        return sb.toString();
        }
    
public List<String>decode(String s){
    List<String> decodedStrings = new ArrayList<>();
    StringBuilder sb = new StringBuilder();
    int i = 0;
    while(i<s.length()){
        if(s.charAt(i) == "/"){
            sb.append(i+1);
            i = i+2;
        }
        else if (s.charAt(i) != ";"){
            sb.append(i);
            i++;

        }
        else{
            decodedStrings.add(sb.toString());
            sb.setLength(0);
            i++;

        }
        return decodedStrings;
        decodedStrings.encode();
    }



}
}
class Encode_and_Decode_Strings{
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        str = sc.nextLine();
        Solution obj = new Solution();
        obj.decode(str);
        System.out.println()

        int choice ;
        System.out.println("Enter choice(0\1)");
        while(choice == 1){
            obj.encode();
        }
    }
}
