import java.util.*;

public class Main {
    public static void main(String[] args) {
      
    
    
      int someNumber = 55;
      
      int d = someNumber/10;
      int u = someNumber%10;
      int sum = d+u;
      
      System.out.println(sum);
    
      boolean result1 = ((sum>9))&&((sum<100));
      System.out.println(result1);
      
      boolean result2 = (someNumber>sum);
      System.out.println(result2);
 

  }
}