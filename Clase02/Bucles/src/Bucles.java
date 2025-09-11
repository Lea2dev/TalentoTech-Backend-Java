import java.util.Scanner;

public class Bucles {
    public static void main(String[] args) throws Exception {
        int cantidad;
        int num=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero de repeticiones:");
        cantidad= sc.nextInt();
        System.out.println("Con For:");
        for(int i=1; i<=cantidad; i++){
            System.out.println("Valor variable:"+i);
        } 
        System.out.println("Con while:");
        while(num<cantidad){
            System.out.println("Valor de variable" + ++num);
        }
        sc.close();
    }
}
