public class ReverseStringASCII {
    public static void main(String[] args) {
        String s = "abc";
        int ans =reverseDegree(s);
        System.out.println(ans);
    }
    static int reverseDegree(String s) {
        int ans = 0 ;
        for (int i = 0 ; i < s.length() ; i++){
            ans += s.charAt(i);
            System.err.println((int)(s.charAt(i)));
            System.err.println(ans);
        }
        return ans;
        
    }
}