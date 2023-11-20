public class FalsePosition extends RootMethod {
    private double c=0;
    private double cPrev=c;
    private double functionA=0;
    private double functionB=0;
    private double functionC=0;


    //c=xi+1=(a*f(b)-b*f(a))/(f(b)-f(a)))
    @Override
    void findRoot1() {
        functionA=processFunction1(boundA);
        functionB=processFunction1(boundB);
        c=((boundA*functionB)-(boundB*functionA))
        /(functionB-functionA);

        functionC=processFunction1(c);

        calcError(cPrev, c);

        displayGraph();

        cPrev=c;

        compareBounds(functionA, functionB, functionC, c);

        iteration++;
    }

    @Override
    void findRoot2() {
        functionA=processFunction2(boundA);
        functionB=processFunction2(boundB);
        c=((boundA*functionB)-(boundB*functionA))
        /(functionB-functionA);

        functionC=processFunction2(c);
        
        calcError(cPrev, c);

        displayGraph();

        cPrev=c;

        compareBounds(functionA, functionB, functionC, c);

        iteration++;
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
