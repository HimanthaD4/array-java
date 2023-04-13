import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in) ;
        String std[] = new String[10];

        for(int i=0; i<5; i++){

            System.out.println("Enter student " +(i+1)+" name");
            String name = sc.nextLine();
            std[i] = name;

        }

        int i=0;

        while(i < 5){
            System.out.println("student name :"+std[i]);
            i++;

        }
    }
}