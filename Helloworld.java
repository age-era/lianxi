import java.util.Scanner;
public class Helloworld {

    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int in = Scanner.nextInt();
        System.out.println("guess the number");
        Scanner gu = new Scanner(System.in);
        gu = new Scanner(System.in);
        while (gu != in){
            if (gu > in){
                System.out.println("smaller");
                System.out.println("try again");
            }else {
                System.out.println("bigger");
                System.out.println("try again");
            }
        }System.out.println("that s right");
    }
}
