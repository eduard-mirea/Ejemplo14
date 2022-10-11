import java.util.Scanner;
public class Ejemplo14 {
    public static void main(String[] args) {

        int x;
        int y;
        int orden;

        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        x = inputValue.nextInt();
        System.out.println("Introduce un numero: ");
        y = inputValue.nextInt();

        System.out.println("Como lo quieres ordenar? 1 - Ascendente; 2 - Descendente;");
        orden = inputValue.nextInt();

        inputValue.close();

        if (1 == orden){
            if (x>y){
                System.out.println(y+","+x);
            }else {
                System.out.println(x+","+y);
            }
        }
        if (2 == orden){
            if (x>y){
                System.out.println(x+","+y);
            }else {
                System.out.println(y+","+x);
            }
        }
    }
}
