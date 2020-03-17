/* 
The second exercise was too simple (the program just defining two integer variables 
and printing their values) and I desided to calculate the value of pi constant by a 
known primitive way with using java.

Sorry Herbert Schildt.
*/
class ex2 {
    public static void main(String args[]) {
        if (args.length < 1) {
            System.out.println("You should enter number of iterations as a program argument.");
            return;
        }
        else if (args.length > 1) {
            System.out.println("Too many arguments.");
            return;
        } 
        else {
            try{
                if (Integer.parseInt(args[0]) < 0) throw new NumberFormatException();
            }
            catch (Exception e) {
                System.out.println("Incorrect number format.\n"+
                    "Number of interations is a  positive integer value.");
                return;
            }
        }
        double x = 0.0, y = 0.0; //random coordinates in unity sqare;
        int numOfIter =  Integer.parseInt(args[0]), 
            hits = 0; // the number of hits in the quater-circle

        for (int i = 0; i < numOfIter; i++) {
            x = Math.random();
            y = Math.random();
            if (x*x+y*y <= 1.0) hits++;
        }
        
        System.out.println("Pi ~= " + Double.toString(4.0 * (double) hits / (double) numOfIter));

    }
}
