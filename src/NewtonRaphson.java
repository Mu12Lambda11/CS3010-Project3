public class NewtonRaphson extends RootMethod {
    private double xNext=0;
    private double xi=0;
    private double xPrev=0;
    private double functionX=0;
    private double derivativeX=0;
    
    //xi+1= xi - f(xi)/f'(xi)
    @Override
    void findRoot1() {
        functionX= processFunction1(xi);
        derivativeX= processDerivative1(xi);

        xNext = xi-(functionX/derivativeX);
        
        calcError(xPrev, xi);

        xPrev=xi;
        
    }

    @Override
    void findRoot2() {
        //xi=boundB
        functionX= processFunction2(xi);
        derivativeX= processDerivative2(xi);

        xNext = xi-(functionX/derivativeX);

        calcError(xPrev, xi);

        xPrev=xi;
    }

    @Override
    void displayGraph() {
        System.out.println("n= "+iteration+" xi: " + getXi()+ " xi-1: " + getxPrev()+"xi+1"+getxNext()
        +" f(x): " + getFunctionX()+ " f'(x): "+ getDerivativeX());

        System.out.print(" Error: "+ getError());
    }

   
    double processDerivative1(double x){
        System.out.println("6x^2-23.4x+17.7");
        double tempDouble=0;

        tempDouble = (6*Math.pow(x, 2)-(23.4*x)+17.7);
        return tempDouble;
    }

    double processDerivative2(double x){
        System.out.println("[(50sinh(50/x))/x]-cosh(50/x)+1");
        double tempDouble=0;

        tempDouble=(((50*Math.sinh(50/x))/x) - Math.cosh(50/x)+1);
        return tempDouble;
    }

    public double getxNext() {
        return xNext;
    }
    public void setxNext(double xNext) {
        this.xNext = xNext;
    }
    public void setXi(double xi) {
        this.xi = xi;
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
    public double getDerivativeX() {
        return derivativeX;
    }
}
