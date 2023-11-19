public class Secant extends RootMethod {
    double xNext=0;
    //xi+1= xi -f(xi)/[(f(xi)-f(xi-1)/(xi-(xi-1)))]
    @Override
    void findRoot1() {
        //xi=boundB
        //xi-1=boundA
        double functionX = processFunction1(boundB);
        double functionXPrev= processFunction1(boundA);

        xNext=(boundB-functionX)/((functionX-functionXPrev)/(boundB-boundA));
        
    }

    @Override
    void findRoot2() {
        //xi=boundB
        //xi-1=boundA
        double functionX = processFunction2(boundB);
        double functionXPrev= processFunction2(boundA);

        xNext=(boundB-functionX)/((functionX-functionXPrev)/(boundB-boundA));
    }
    
    public double getxNext() {
        return xNext;
    }
    public void setxNext(double xNext) {
        this.xNext = xNext;
    }
}
