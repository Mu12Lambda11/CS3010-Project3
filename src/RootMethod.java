import java.util.ArrayList;

public abstract class RootMethod {
    ArrayList<Integer> roots = new ArrayList<Integer>();
    protected double error = 0;
    protected double boundA=0;
    protected double boundB=0;
    protected int iteration=0;
    protected Boolean boundBoolean=false;

    //Method to process the function
    double processFunction1(double x){
        double tempDouble=0;


        //case for function 1
        tempDouble = (2*Math.pow(x, 3))-(11.7*Math.pow(x, 2))+(17.7*x)-5;

        return tempDouble;
    }

    //Method to process the function
    double processFunction2(double x){
        double tempDouble=0;

        //case for function 2
        tempDouble=x+10-(x*Math.cosh(50/x));
        return tempDouble;
    }

    //Method to find the root for function 1
    void findRoot1(){

    }

    //Method to find the root for function 2
    void findRoot2(){

    }

    void compareBounds(double functionA, double functionB, double functionC, double c){
        //compare values of f(a) and f(b)
        if(functionC<0){
            //root is to the left of the midpoint c
            //replace a with c
            setBoundA(c);
            boundBoolean=true;
        }else if(functionC>0){
            //root is to the right of midpoint c
            //replace b with c
            setBoundB(c);
            boundBoolean=false;
        }
    }

    //Method to calculate error
    //Default Error: |xn-(xn-1)|/|xn|
    void calcError(double x0, double x1){
        error=Math.abs(x1-x0)/Math.abs(x1);

    }

    //Display the table being produced by the class
    void displayGraph(){

    }

    //method to iterate
    void iterate(){
        iteration++;
    }

    //Method to detect divergent solutions
    void testDivergency(){
        System.out.println("Bound contains multiple roots. Divergency detected");
    }

    //Method to detect a slow convergency
    void testSlowConvergency(){
        System.out.println("Convergence is feasible but very slow.");
    }

    public double getBoundA() {
        return boundA;
    }
    public double getBoundB() {
        return boundB;
    }
    public void setBoundA(double boundA) {
        this.boundA = boundA;
    }
    public void setBoundB(double boundB) {
        this.boundB = boundB;
    }
    public double getError() {
        return error;
    }
    public double getIteration() {
        return iteration;
    }
}
