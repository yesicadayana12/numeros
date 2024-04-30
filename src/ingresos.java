import javax.swing.*;
import java.util.Scanner;

public class ingresos {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        float numer [ ] = new float[5];
         int numers;
         ;
        numers = Integer.parseInt(JOptionPane.showInputDialog("HELLO por favor digite la cantidad de letra que desea "));

        System.out.println("guardar datos: ");
        for (int i = 0;i<5;i++) {
            System.out.print((i + 1) + ". Por favor digite el numero");
            numer[i] = entrada.next().charAt(0);

        }
        System.out.println("Las letras que ingreso fueron: ");
        for (float  i: numer) {
            System.out.println(i);
        }
    }
}

