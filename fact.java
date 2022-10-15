class fact {
    
    //print factorial of any number

    public static void printFactorial(int n){
        if(n<0){
            System.out.println("invaild number");
        }
        int factorial= 0;   
        for(int i=n; i>=1; i--){
            factorial= factorial*i;
        }
        
        System.out.println("factorial of "+n+" is "+factorial);
        return;
    }

    public static void main(String[] args) {
        printFactorial(6);
    }
}
