public class pattern12 {
    public static void main(String[] args) {
        int num = 5;
        for (int i = 0; i<num;i++){
            for(int j = 0; j< num-i;j++){
                System.out.print(" ");
            }
            for (int j = 0; j<=i;j++){
                System.out.print(i+1+" ");
            }
            System.out.println();
        }
    }
}
