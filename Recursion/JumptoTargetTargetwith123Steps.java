package Recursion;

class JumptoTargetwith123Steps {
    public static void main(String[] args) {
        System.out.println(stepOn(4,0,""));
    }
    public static int stepOn(int target,int curr,String Steps){
        if(curr==target){
            System.out.println(Steps);
            return 1;
        }
        else if(curr>target){
            return 0;
        }
     int f1=   stepOn(target,curr+1,Steps+1);
     int f2=   stepOn(target,curr+2,Steps+2);
     int f3=   stepOn(target,curr+3,Steps+3);
        return f1+f2+f3;
    }
}
