public class NewtonRaphson extends RootMethod {
    private double xNext=0;
    
    //xi+1= xi - f(xi)/f'(xi)
    @Override
    void findRoot1() {
        //xi=boundB
        double functionX= processFunction1(boundB);
        double derivativeX= processDerivative1(boundB);

        xNext = boundB-(functionX/derivativeX);
        
    }

    @Override
    void findRoot2() {
        //xi=boundB
        double functionX= processFunction2(boundB);
        double derivativeX= processDerivative2(boundB);

        xNext = boundB-(functionX/derivativeX);
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
}
