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
        c=((boundA*functionB)-(boundB*functionA)
        /(functionB-functionA));

        functionC=processFunction1(c);
        
        compareBounds(functionA, functionB, functionC, c);

        calcError(cPrev, c);

        cPrev=c;
    }

    @Override
    void findRoot2() {
        double functionA=processFunction2(boundA);
        double functionB=processFunction2(boundB);
        c=((boundA*functionB)-(boundB*functionA)
        /(functionB-functionA));

        double functionC=processFunction2(c);
        
        compareBounds(functionA, functionB, functionC, c);

        calcError(cPrev, c);
        
        cPrev=c;
    }
    @Override
    void displayGraph() {
        System.out.println("n= "+iteration+" a: " + getBoundA()+ " b: " + getBoundB()
        +" f(a): " + getFunctionA()+ " f(b): "+ getFunctionB()+" f(c): " + getFunctionC());
        if(boundBoolean){
            System.out.print(" f(a)*f(c): -" + "f(b)+f(c): +");
        }else{
            System.out.print(" f(a)*f(c): +" + "f(b)+f(c): -");
        }
        System.out.print(" Error: "+ getError());
    }

    public double getFunctionA() {
        return functionA;
    }
    public double getFunctionB() {
        return functionB;
    }
    public double getFunctionC() {
        return functionC;
    }

}
