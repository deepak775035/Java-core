package session5;

public class Calc {

    String sum(){
        return "need minimum 2 operands";
    }

    String sum(int a){
        return sum();
    }

    int sum(int a,int b){
        return a+b;
    }

    int sum(int a,int b,int c){
        return a+b+c;
    }

    int sum(int a,int b,int c,int d){
        return a+b+c+d;
    }



    public static void main(String[] args) {
        Calc o1= new Calc();
        System.out.println(o1.sum(5));
        System.out.println(o1.sum(5, 7));
        System.out.println(o1.sum(6, 1, 2));
        System.out.println(o1.sum(6, 1, 2,1));
    }
    
}
