package core.scanner;

import java.util.Scanner;

//utilizando Scanner
public class ScannerTeste {

    public static void main(String[] args) {
        //por padrão o Scanner utiliza como delimitador o espaço
        Scanner scanner = new Scanner("oi true 100 1");
       // scanner.useDelimiter(","); para mudar o padrão
        while (scanner.hasNext()){//verifica se existe uma próxima posição
            System.out.println(scanner.next());
        }
        //separar por tipo primitivo
        System.out.println("_____________________________________________");

        Scanner scanner2 = new Scanner("oi true 100 1");
        // scanner.useDelimiter(",");
        while (scanner2.hasNext()){
            if (scanner2.hasNextInt()){
                //retorna int
                int i = scanner2.nextInt();
                System.out.println("int " + i);
            }else if (scanner2.hasNextBoolean()){
                boolean b = scanner2.nextBoolean();
                System.out.println("boolen " + b);

            }else{
                System.out.println("String " + scanner2.next());
            }

        }
    }
}
