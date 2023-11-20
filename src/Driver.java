import java.util.Scanner;

public class Driver {
    static Scanner input = new Scanner(System.in);
    static int maxIterations=100;
    static double stoppingError =.01;
    public static void main(String[] args) {

        boolean continueProcess=true;
        

        while(continueProcess){
            System.out.println("Welcome! Please select your desired root finding method.");
            System.out.println("1.Bisection 2.False Position 3.Newton-Raphson 4.Secant");
            int selection = input.nextInt();


            switch (selection) {
                case 1:
                    System.out.println("Bisection has been chosen");
                    useBisection();
                    break;
                
                case 2:
                    System.out.println("False Position has been chosen");
                    useFalsePosition();
                    break;

                case 3:
                    System.out.println("Newton-Raphson has been chosen");
                    useNewton();
                    break;

                case 4:
                    System.out.println("Secant has been chosen");
                    useSecant();
                    break;
            
                default:
                System.out.println("Error. Please enter a valid number.");
                    break;
            }
            System.out.println("Would you like to continue. Enter y or n.");
            if(input.next().equalsIgnoreCase("y")){
                continueProcess=true;
            }else if(input.next().equalsIgnoreCase("n")){
                continueProcess=false;
            }else{
                System.out.println("Error. Please enter a proper value.");
            }
        }
        
    }
    static void useBisection(){
        //initialize the method object and set bounds
        Bisection bisectionInstance = new Bisection();
        setBounds(bisectionInstance);

        if(selectFunction()==1){
            System.out.println("Bisection Method - Function 1");
            //preliminarily process some variables
            bisectionInstance.setFunctionA(bisectionInstance.processFunction1(bisectionInstance.getBoundA()));
            bisectionInstance.setFunctionB(bisectionInstance.processFunction1(bisectionInstance.getBoundB()));
            //Loop to process all necessary iterations
            while(bisectionInstance.getIteration()<maxIterations||
            bisectionInstance.getError()>stoppingError){
                //display graph and handle calculations
                bisectionInstance.displayGraph();
                bisectionInstance.findRoot1();
            }
        }
        if(selectFunction()==2){
            System.out.println("Bisection Method - Function 2");
            //preliminarily process some variables
            bisectionInstance.setFunctionA(bisectionInstance.processFunction2(bisectionInstance.getBoundA()));
            bisectionInstance.setFunctionB(bisectionInstance.processFunction2(bisectionInstance.getBoundB()));
            //Loop to process all necessary iterations
            while(bisectionInstance.getIteration()<maxIterations||
            bisectionInstance.getError()>stoppingError){
                //display graph and handle calculations
                bisectionInstance.displayGraph();
                bisectionInstance.findRoot2();
            }
        }
    }
    
    static void useFalsePosition(){
        FalsePosition falseInstance = new FalsePosition();
        setBounds(falseInstance);
        if(selectFunction()==1){
            System.out.println("False Position Method - Function 1");
            //preliminarily process some variables
            falseInstance.setFunctionA(falseInstance.processFunction1(falseInstance.getBoundA()));
            falseInstance.setFunctionB(falseInstance.processFunction1(falseInstance.getBoundB()));
            //Loop to process all necessary iterations
            while(falseInstance.getIteration()<maxIterations||
            falseInstance.getError()>stoppingError){
                //display graph and handle calculations
                falseInstance.displayGraph();
                falseInstance.findRoot1();
            }
        }
        if(selectFunction()==2){
            System.out.println("False Position Method - Function 2");
            //preliminarily process some variables
            falseInstance.setFunctionA(falseInstance.processFunction2(falseInstance.getBoundA()));
            falseInstance.setFunctionB(falseInstance.processFunction2(falseInstance.getBoundB()));
            //Loop to process all necessary iterations
            while(falseInstance.getIteration()<maxIterations||
            falseInstance.getError()>stoppingError){
                //display graph and handle calculations
                falseInstance.displayGraph();
                falseInstance.findRoot2();
            }
        }
    }

    static void useNewton(){
        NewtonRaphson newtonInstance = new NewtonRaphson();
        setBounds(newtonInstance);
        if(selectFunction()==1){
            System.out.println("Newton-Raphson Method - Function 1");
            //preliminarily process some variables
            newtonInstance.setFunctionX(newtonInstance.processFunction1(newtonInstance.getXi()));
            newtonInstance.setDerivativeX(newtonInstance.processDerivative1(newtonInstance.getXi()));
            //Loop to process all necessary iterations
            while(newtonInstance.getIteration()<maxIterations||
            newtonInstance.getError()>stoppingError){
                //display graph and handle calculations
                newtonInstance.displayGraph();
                newtonInstance.findRoot1();
            }
        }
        if(selectFunction()==2){
            System.out.println("Newton-Raphson Method - Function 2");
            //preliminarily process some variables
            newtonInstance.setFunctionX(newtonInstance.processFunction2(newtonInstance.getXi()));
            newtonInstance.setDerivativeX(newtonInstance.processDerivative2(newtonInstance.getXi()));
            //Loop to process all necessary iterations
            while(newtonInstance.getIteration()<maxIterations||
            newtonInstance.getError()>stoppingError){
                //display graph and handle calculations
                newtonInstance.displayGraph();
                newtonInstance.findRoot2();
            }
        }
    }

    static void useSecant(){
        Secant secantInstance = new Secant();
        setBounds(secantInstance);
        if(selectFunction()==1){
            System.out.println("Secant Method - Function 1");
            //preliminarily process some variables
            secantInstance.setFunctionX(secantInstance.processFunction1(secantInstance.getXi()));
            secantInstance.setFunctionXPrev(secantInstance.processFunction1(secantInstance.getxPrev()));
            //Loop to process all necessary iterations
            while(secantInstance.getIteration()<maxIterations||
            secantInstance.getError()>stoppingError){
                //display graph and handle calculations
                secantInstance.displayGraph();
                secantInstance.findRoot1();
            }
        }
        if(selectFunction()==2){
            System.out.println("Secant Method - Function 2");
            //preliminarily process some variables
            secantInstance.setFunctionX(secantInstance.processFunction2(secantInstance.getXi()));
            secantInstance.setFunctionXPrev(secantInstance.processFunction2(secantInstance.getxPrev()));
            //Loop to process all necessary iterations
            while(secantInstance.getIteration()<maxIterations||
            secantInstance.getError()>stoppingError){
                //display graph and handle calculations
                secantInstance.displayGraph();
                secantInstance.findRoot2();
            }
        }
    }

    static int selectFunction(){
        System.out.println("Select your desired function");
        System.out.println("1.f(x)=2x^3-11.7x^2+17.7x-5");
        System.out.println("2.f(x)=x+10-xcosh(50/x)");
        int selection = input.nextInt();

        return selection;

    }

    static void setBounds(RootMethod method){
        System.out.println("Please set the lower bound a");
        method.setBoundA(input.nextInt());
        System.out.println("Please set the upper bound b");
        method.setBoundB(input.nextInt());
    }
}
