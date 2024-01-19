public class SpiralFigure {
    public static void main(String[] args) {
        double a = 1.2;
        double b = 0.65;

        int width = 60; 
        int height = 60; 

        double thetaIncrement = 0.01;

        for (int y = -14; y < height; y++) {
            for (int x = -12; x < width; x++) {
                boolean printO = false;

                for (double theta = 0; theta <= 6 * Math.PI; theta += thetaIncrement) {
                    double r = a + b * theta;
                    double x0 = r * Math.cos(theta);
                    double y0 = r * Math.sin(theta);

                    if (Math.abs(x0 - x) < 0.5 && Math.abs(y0 - y) < 0.5) {
                        printO = true;
                        break;
                    }
                }

                if (printO) {
                    System.out.print('O');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println(); 
        }
    }
}
/*Output:
        OOOOOOOOOO                                                      
      OOO        OOO                                                    
     OO            OOO                                                  
    OO               OO                                                 
   OO    OOOOOOOO     OO                                                
  OO   OOO      OOO    O                                                
  O   OO          OO   OO                                               
 OO   O            OO   O                                               
 O   OO   OOOOOO    O   OO                                              
 O   O   OO    OO   OO   O                                              
 O   O   O      OO   O   O                                              
 O   O   O       O   O   O                                              
 O   O   O   O   O   O   O                                              
 O   O   OO  O   O   O                                                  
 O   O    OOOO   O   O                                                  
 O   OO          O   O                                                  
 OO   OO        O    O                                                  
  O    OO     OOO   OO                                                  
  OO    OOOOOOO    OO                                                   
   OO              O                                                    
    OO           OO                                                     
     OOO        OO                                                      
       OOOOOOOOOO       
       
*/       
