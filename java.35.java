 public class Lista35 {
    
        public static void main(String[] args) {
            double S = 1,i,j;
    
            for (i = 3,j = 2;  i <= 39; i+=2,j *= 2) {
                S += i / j;
            }
            
            System.out.println("S = "+S);
        }
    }

