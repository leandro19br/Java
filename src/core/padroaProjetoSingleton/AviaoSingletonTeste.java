package core.padroaProjetoSingleton;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class AviaoSingletonTeste {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException {
        // agora o retorno do método será true e false
        reservarAssento("A1");
        reservarAssento("A1");
        //utilizando o Singleton o objeto vai ocupar o mesmo endereço de memória
        AviaoSingleton aviaoSingleton = AviaoSingleton.getINSTANCE();
        AviaoSingleton aviaoSingleton2 = AviaoSingleton.getINSTANCE();

        //porém tem como burlar isso utilizando a CLASSE Constructor e fazendo um
        //for no Array. Agora as instancias ocuparão espaços diferentes na memório
        // um modo de travar isso seria utilizando a ENUM

        Constructor[]constructors = AviaoSingleton.class.getDeclaredConstructors();

        for (Constructor constructor : constructors) {

            constructor.setAccessible(true);
            aviaoSingleton2 = (AviaoSingleton) constructor.newInstance();

        }

        System.out.println(aviaoSingleton.hashCode());
        System.out.println(aviaoSingleton2.hashCode());

    }

    //método parar reservar o assento de um avião
    private static void reservarAssento(String assento){
        //para criar o avião teremos que chamar o método get

        AviaoSingleton a = AviaoSingleton.getINSTANCE();
        System.out.println(a.bookAssento(assento));

    }
}
