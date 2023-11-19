public class FalsePosition extends RootMethod {
    private double c=0;

    //c=xi+1=(a*f(b)-b*f(a))/(f(b)-f(a)))
    @Override
    void findRoot1() {
        double functionA=processFunction1(boundA);
        double functionB=processFunction1(boundB);
        c=((boundA*functionB)-(boundB*functionA)
        /(functionB-functionA));

        double functionC=processFunction1(c);
        
        compareBounds(functionA, functionB, functionC, c);
    }

    @Override
    void findRoot2() {
        double functionA=processFunction2(boundA);
        double functionB=processFunction2(boundB);
        c=((boundA*functionB)-(boundB*functionA)
        /(functionB-functionA));

        double functionC=processFunction2(c);
        
        compareBounds(functionA, functionB, functionC, c);
    }

}
