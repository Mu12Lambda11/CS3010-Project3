public class Bisection extends RootMethod {
    private double c =0;

    //X2 = X0 + (X1-X0)/2
    @Override
    void findRoot1() {

        c = (boundB-boundA)/2;

        //find f(a)
        double functionA = processFunction1(boundA);

        //find f(b)
        double functionB = processFunction1(boundB);

        //find f(c)
        double functionC = processFunction1(c);

        compareBounds(functionA, functionB, functionC, c);
    }

    @Override
    void findRoot2() {
        c = (boundB-boundA)/2;

        //find f(a)
        double functionA = processFunction2(boundA);

        //find f(b)
        double functionB = processFunction2(boundB);

        //find f(c)
        double functionC = processFunction2(c);

        //compare values of f(a) and f(b)
        if(functionC*functionA<0){
            //root is to the left of the midpoint c
            //replace a with c
            setBoundA(c);
        }else if(functionC*functionB<0){
            //root is to the right of midpoint c
            //replace b with c
            setBoundB(c);
        }
    }

    //Error=b-a
    //x1=b, x0=a
    @Override
    void calcError(double x0, double x1) {
        error=(x1-x0);
    }

    public double getC() {
        return c;
    }
    public void setC(double c) {
        this.c = c;
    }
}
