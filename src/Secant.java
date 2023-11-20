public class Secant extends RootMethod {
    private double xNext=0;
    private double xi=0;
    private double xPrev=0;
    private double functionX=0;
    private double functionXPrev=0;

    //xi+1= xi -f(xi)/[(f(xi)-f(xi-1)/(xi-(xi-1)))]
    @Override
    void findRoot1() {
        //xi=boundB
        //xi-1=boundA
        functionX = processFunction1(xi);
        functionXPrev= processFunction1(xPrev);

        xNext=(xi-functionX)/((functionX-functionXPrev)/(xi-xPrev));

        calcError(xPrev, xi);

        displayGraph();

        xPrev=xi;
        
    }

    @Override
    void findRoot2() {
        //xi=boundB
        //xi-1=boundA
        functionX = processFunction2(xi);
        functionXPrev= processFunction2(xPrev);

        xNext=(xi-functionX)/((functionX-functionXPrev)/(xi-xPrev));

        calcError(xPrev, xi);

        displayGraph();
        
        xPrev=xi;
    }
    @Override
    void displayGraph() {
        System.out.println("n= "+iteration+" xi: " + getXi()+ " xi-1: " + getxPrev()+"xi+1"+getxNext()
        +" f(x): " + getFunctionX()+ " f(xi-1): "+ getFunctionXPrev());

        System.out.println(" Error: "+ getError());
    }
    
    public double getxNext() {
        return xNext;
    }
    public void setxNext(double xNext) {
        this.xNext = xNext;
    }
    public double getXi() {
        return xi;
    }
    public double getxPrev() {
        return xPrev;
    }
    public double getFunctionX() {
        return functionX;
    }
    public void setFunctionX(double functionX) {
        this.functionX = functionX;
    }
    public double getFunctionXPrev() {
        return functionXPrev;
    }
    public void setFunctionXPrev(double functionXPrev) {
        this.functionXPrev = functionXPrev;
    }
}
