public class Bisection extends RootMethod {
    private double c =(boundB-boundA)/2;
    private double functionA=0;
    private double functionB=0;
    private double functionC=0;

    //X2 = X0 + (X1-X0)/2
    @Override
    void findRoot1() {

        c = (boundB+boundA)/2;

        //find f(a)
        functionA = processFunction1(boundA);

        //find f(b)
        functionB = processFunction1(boundB);

        //find f(c)
        functionC = processFunction1(c);
        //calculate the error
        calcError(boundA, boundB);
        //display graph
        displayGraph();
        //compare the bounds and replace one
        compareBounds(functionA, functionB, functionC, c);
        //iterate
        iteration++;
    }

    @Override
    void findRoot2() {
        c = (boundB+boundA)/2;

        //find f(a)
        functionA = processFunction2(boundA);

        //find f(b)
        functionB = processFunction2(boundB);

        //find f(c)
        functionC = processFunction2(c);
        //calculate the error
        calcError(boundA, boundB);
        //display graph
        displayGraph();
        //compare the bounds and replace one
        compareBounds(functionA, functionB, functionC, c);
        //iterate
        iteration++;
    }

    //Error=b-a
    //x1=b, x0=a
    @Override
    void calcError(double x0, double x1) {
        error=(x1-x0);
    }

    @Override
    void displayGraph() {
        System.out.println("n= "+iteration+" a: " + getBoundA()+ " b: " + getBoundB() + " c: "+ getC()
        +" f(a): " + getFunctionA()+ " f(b): "+ getFunctionB()+" f(c): " + getFunctionC());
        System.out.println(" Error: "+ getError());
    }

    public double getC() {
        return c;
    }
    public void setC(double c) {
        this.c = c;
    }

    public double getFunctionA() {
        return functionA;
    }
    public void setFunctionA(double functionA) {
        this.functionA = functionA;
    }
    public double getFunctionB() {
        return functionB;
    }
    public void setFunctionB(double functionB) {
        this.functionB = functionB;
    }
    public double getFunctionC() {
        return functionC;
    }
 
}
