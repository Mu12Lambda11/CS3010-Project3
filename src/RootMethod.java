import java.util.ArrayList;

public abstract class RootMethod {
    ArrayList<Integer> roots = new ArrayList<Integer>();
    protected double error = 0;
    //Method to process the function
    void processFunction(){

    }

    //Method to calculate error
    //Default Error: |xn-(xn-1)|/|xn|
    void calcError(double x0, double x1){
        error=Math.abs(x1-x0)/Math.abs(x1);

    }

    //Display the table being produced by the class
    void displayGrapth(){

    }

    //Method to detect divergent solutions
    void stateDivergency(){

    }

    //Method to detect a slow convergency
    void stateSlowConvergency(){

    }
    //Method to calculate the class's respective error
    void methodError(){

    }
}
