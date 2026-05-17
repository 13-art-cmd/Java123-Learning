import java.util.Scanner;


class NegativeAgeException extends Exception{
    void display(){
        System.out.println("Kindly enter a valid age"); 
    }

}

class Pole{
    static void age(int n) throws NegativeAgeException{
        if(n<18){
            throw new NegativeAgeException();
        }
        System.out.println("You are eligible to Vote");
    }

    public static void main(String[] args){
        Scanner s1 = new Scanner(System.in);
        int num;
        num = s1.nextInt();
        try{
            age(num);
        }
        catch(NegativeAgeException e){
            e.display();
        }
    }
}