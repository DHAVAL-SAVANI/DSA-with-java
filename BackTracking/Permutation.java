public class Permutation {
    public static void permutation(String str, String ans){
        // Base caase
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }

        //recursion
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i); // taking ith character from string and concatenate into answer string
            String newStr = str.substring(0,i) + str.substring(i+1); // delete ith character and pass newString
            permutation(newStr, ans+ch);
            //OR permutation(str.substring(0,i)+str.substring(i+1), ans+str.charAt(i));
            // backtracking because i incremented and again call same function at this level
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        permutation(str, "");
    }
}
