public class Bisection extends RootMethod {
    //X2 = X0 + (X1-X0)/2
    @Override
    void processFunction() {
        // TODO Auto-generated method stub
        super.processFunction();
    }
    //Error=(b-a)/2
    //x1=b, x0=a
    @Override
    void calcError(double x0, double x1) {
        error=(x1-x0)/2;
    }
}
