package core.erro;

import java.io.FileNotFoundException;
import java.sql.SQLException;

/*
tratamento de várias excepcion
 */
public class TesteMultiploRuntime {
    public static void main(String[] args) {
        try {
            //se não tiver o tratamento para o erro o programa para de execultar
                throw  new ArrayIndexOutOfBoundsException();

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Dentro do ArrayIndexOutOfBoundsException ");

        }catch (IllegalArgumentException e){

            System.out.println("Dentro do IllegalArgumentException ");

        }catch (ArithmeticException e){

            System.out.println("Dentro do ArithmeticException ");

        }
        System.out.println("Fora do catch");

        try {
            talvezLanceException();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //a partir do java 8 pode ser assim
        try {
            talvezLanceException();
        } catch (SQLException  | FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    public static void talvezLanceException() throws SQLException,FileNotFoundException {

    }

}
