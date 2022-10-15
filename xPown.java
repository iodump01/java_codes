public class xPown {
    
    //print X ke power n (X^n) by recursion
    //base case at oth and 1th
    
    public static int calcPower(int X, int n){
        if(X == 0){
            return 0;
        }
        if(n == 0){
            return 1;
        }
        //operation
        int xPownm_1= calcPower(X, n-1);
        int xPown= X*xPownm_1;
        
        return xPown;
    }
    public static void main(String[] args) {
        int ans1= calcPower(2,5);
        int ans2= calcPower(2,7);
        int ans= calcPower(2,0);
        System.out.println(ans);
        System.out.println(ans2);
        System.out.println(ans1);
    }
}
