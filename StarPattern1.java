
public class StarPattern1{
  public static void main(String[] args){
    int i, j;
    
    System.out.println("Printing Star Pattern 1");
    for(i=1; i<=5; ++i)
    {
        for(j=1; j<=i; ++j)
        {
            System.out.print(j);
        }
        System.out.print("\n");
    }
  }
}
