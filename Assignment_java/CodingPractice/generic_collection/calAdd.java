package CodingPractice.generic_collection;

import java.util.Scanner;

abstract class Calc{
    protected int a;
    protected int b;
    protected void setValue(int a, int b){
        this.a = a; this.b = b;
    }
    abstract protected int calculate();
}

class Add extends Calc{
    protected void setValue(int a, int b){
        this.a = a;
        this.b = b;
    }
    protected int calculate(){
        return a+b;
    }
}

class Sub extends Calc{
    @Override
    protected void setValue(int a, int b){        
        this.a = a;
        this.b = b;
    }
    protected int calculate(){
        return a-b;
    }
}

class Mul extends Calc{
    @Override
    protected void setValue(int a, int b){
        this.a = a;
        this.b = b;
    }
    protected int calculate(){
        return a*b;
    }
}

// class Div extends Calc{
//     protected double a;
//     protected double b;
//     protected void setValue(int a, int b){
//     }

//     @Override
//     protected double calculate(){
//         return a/b;
//     }
// }

public class calAdd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 2 operands & operator >>> ");
        int a = sc.nextInt();
        char op = sc.next().charAt(0);
        int b = sc.nextInt();
        
        int ans = 0;
        Add add = new Add();
        Sub sub = new Sub();
        Mul mul = new Mul();
        // Div div = new Div();

        switch (op) {
            case '+':
                add.setValue(a, b);
                ans = add.calculate();
                break;
            case '-':
                sub.setValue(a, b);
                ans = sub.calculate();
                break;
            case '*':
                mul.setValue(a, b);
                ans = mul.calculate();
                break;
            // case '/':
            //     div.setValue(a, b);
            //     div.calculate();
            //     break;
            
            default:
                break;
        }
        System.out.println(ans);

        sc.close();
    }
}
