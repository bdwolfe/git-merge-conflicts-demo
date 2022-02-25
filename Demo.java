public class Demo {
  public static double pow(double base, int exponent){
    double answer = 1.0;
    
    if(exponent < 0){
      throw new IllegalArgumentException("exponent must be non-negagtive");
    }
    
    while(exponent > 1){
      if(exponent % 2 == 1){
        answer *= base;
        exponent -= 1;
      }
      // Now we have an even exponent
      
      exponent /= 2;
      base *= base;
    }
    
    answer *= base;
    
    return answer;
  }

  /**
   * @param args prints a table of x^y for different values of x and y
   */
  public static void main(String[] args){
    final int upperLimit = 10;
    for(int base=0; base<upperLimit; base++){
      System.out.print("Powers of " + base + ": ");
      for(int j=0; j<upperLimit; j++){
        System.out.print(pow(base,j) + "   ");
      }
      System.out.print("\n");
    }
  }
}
      
