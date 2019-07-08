public class ErrorHandling{
    static void anyFunction ( int x, int y ) {

        // Arthematic exception
        int a = x/y;
        System.out.println ( " Result : " + a );
        
        // Array bound exception
        int[] array = {1, 2, 3};
        System.out.println ( " Array[3] : " + array[3] );

        // NUll pointer exception
        String str = null; //null value 
        System.out.println(str.charAt(0));

    }
     public  static void main (String args [  ] )
     {
        try
        {
            anyFunction (25, 0) ; 		// Exception occurs here as y = 0 
            
        }

        catch(Exception e){ 
            System.out.println ("Exceptions Occured"); 
        } 
        
        System.out.println ("I am out of try block"); 

     }
} 
