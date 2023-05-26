package Recursion;

public class GenerateParenthesis {
    public static void main(String[] args) {
generator(0,0,0,"");
    }
    public static void generator(int opening,int closing,int n,String ans){
        if(opening==n && closing==n){
            System.out.println(ans);
            return;
        }
        if(opening<n){
            generator(opening,closing,n,ans+'(');
        }

        if(closing<n){
            generator(opening,closing,n,ans+')');
        }
    }
}
