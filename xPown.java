public class xPown {
    
    //print X ke power n (X^n) by recursion
    //base case at oth and 1th
    
    public static int calcPower(int X, int n){
        //operation
        int xPownm_1= calcPower(X, n-1);
        int xPown= X*xPownm_1;
        return xPown;
    }
    public static void main(String[] args) {
        int ans= calcPower(2,0);
        System.out.println(ans);
    }
}
