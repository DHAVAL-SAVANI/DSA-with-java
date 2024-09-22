class FindSubSets{
    public static void findSubSets(String str, String ans, int i){
        // Base case
        if(i >= str.length()){
            System.out.println(ans);
            return;
        }

        // Recursion
        findSubSets(str,ans+str.charAt(i),i+1); // adding character in answer
        findSubSets(str,ans,i+1); // backtrack and for not adding character in answer
    }
    public static void main(String[] args) {
        String str = "abc";
        findSubSets(str, "", 0);
    }
}