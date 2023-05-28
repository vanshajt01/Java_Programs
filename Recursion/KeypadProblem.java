package Recursion;

public class KeypadProblem {
    static String[] Arr={"","abc","def","ghi","jkl","mno","pqr","stu","vwx","yz"};
    public static void main(String[] args) {
        keypad("12","");
    }
    public static void keypad(String a,String ans){
        if(a.isEmpty()){

        }
        for(int i=0;i<a.length();i++){
            for(int j=0;j<Arr[i].length();j++){
              //  keypad(a.substring(),ans+Arr[i]);
            }
        }
    }

}
