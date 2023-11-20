import java.util.Scanner;

public class Driver {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        double stoppingError =.05;
        boolean continueProcess=true;

        while(continueProcess){
            System.out.println("Welcome! Please select your desired root finding method.");
            System.out.println("1.Bisection 2.False Position 3.Newton-Raphson 4.Secant");
            int selection = input.nextInt();

            System.out.println("Please enter a desired stopping error. Default is .05");
            if(input.nextLine()==null){
                
            }else{
                stoppingError=input.nextInt();
            }

            switch (selection) {
                case 1:
                    System.out.println("Bisection has been chosen");
                    useBisection(stoppingError);
                    break;
                
                case 2:
                    System.out.println("False Position has been chosen");
                    useFalsePosition(stoppingError);
                    break;

                case 3:
                    System.out.println("Newton-Raphson has been chosen");
                    useNewton(stoppingError);
                    break;

                case 4:
                    System.out.println("Secant has been chosen");
                    useSecant(stoppingError);
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
    static void useBisection(double givenError){
        Bisection bisectionInstance = new Bisection();
        setBounds(bisectionInstance);
        if(selectFunction()==1){
            
        }
        if(selectFunction()==2){

        }
    }
    
    static void useFalsePosition(double givenError){
        FalsePosition falseInstance = new FalsePosition();
        setBounds(falseInstance);
    }

    static void useNewton(double givenError){
        NewtonRaphson newtonInstance = new NewtonRaphson();
        setBounds(newtonInstance);
    }

    static void useSecant(double givenError){
        Secant secantInstance = new Secant();
        setBounds(secantInstance);
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
