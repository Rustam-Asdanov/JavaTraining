import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ExerciseTwo {
    public static void main(String[] args){



    }

    public static void homeworkOne(){
//         homework 1 version 1
        Scanner input = new Scanner(System.in);
        System.out.print("a: ");
        int a = input.nextInt();
        System.out.print("b: ");
        int b = input.nextInt();
        System.out.print("c: ");
        int c = input.nextInt();

        System.out.println("Sum " + (a+b+c));
        System.out.println("Mul " + (a*b*c));
    }

    public static void homeworkOne2(){
//         homework 1 version 2
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("a: ");
        try {
            int a = Integer.parseInt(reader.readLine());
            System.out.print("b: ");
            int b = Integer.parseInt(reader.readLine());
            System.out.print("c: ");
            int c = Integer.parseInt(reader.readLine());

            System.out.println("Sum " + (a+b+c));
            System.out.println("Mul " + (a*b*c));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void homeworkTwo(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String text = reader.readLine();

            String[] arrText = text.split(" ");
            for(int i=0; i<arrText.length; i++){
                System.out.println(arrText[i]);
            }

            for(String s : arrText){
                System.out.println(s);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void homeworkThree(){
        for(int i=1; i<=10; i++){

            for(int j=1; j<=10; j++){
                System.out.print(i*j + "  ");
            }

            System.out.println();
        }
    }
}
