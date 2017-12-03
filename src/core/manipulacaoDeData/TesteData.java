package core.manipulacaoDeData;

import java.util.Calendar;
import java.util.Date;

public class TesteData {
    public static void main(String[] args) {
        // primeira classe para  trabalhar com data era a Date
        //depois veio a Calendar e depois a Timer

        Date data = new Date(1_000_000_00);
        System.out.println(data + " em ms");

        Date data2 = new Date();
        System.out.println(data2);//data atual, utiliza se getTime() para pegar o valor em mile Seg

        //não pode ser criado objeto
        Calendar c = Calendar.getInstance();

        c.setTime(data2);//recebe um date da Classe Date

        if (Calendar.SATURDAY == c.getFirstDayOfWeek()){
            System.out.println("Primeiro dia da Semana");

        }
                //dias da semana utilizando as constantes da classe Calendar
                System.out.println(c.get(Calendar.DAY_OF_MONTH));
                System.out.println(c.get(Calendar.DAY_OF_WEEK));
                System.out.println(c.get(Calendar.DAY_OF_YEAR));

                //adicionar horas

                //pegando a data atual com calendar e date
        Calendar c3 = Calendar.getInstance();
        //adiciona 1 hora
        c3.add(Calendar.HOUR,12);
        //c3.add(Calendar.MONTH,12);
        //c3.roll(Calendar.MONTH,12);
        Date data3 = c3.getTime();
        System.out.println(data3);



    }
}
