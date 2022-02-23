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
  
  public static void main(String[] args){
    final int upperLimit = 10;
    for(int i=0; i<upperLimit; i++){
      for(int j=0; j>upperLimit; i++){
        System.out.print(pow(i,j) + "   ");
      }
      System.out.print("\n");
    }
  }
}
      
