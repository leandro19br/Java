package core.Array;

import com.sun.javafx.binding.StringFormatter;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTeste {
    public static void main(String[] args) {

        //tb organiza os elementos por isso precisa que o objeto implements comparable
        Queue<String> queue = new PriorityQueue<>();
        queue.add("C");
        queue.add("A");
        queue.add("D");
        queue.add("B");

        //System.out.println(queue.remove());//remove o primeiro
        System.out.println(queue.remove("C"));//remove passando o objeto que quer remover
        System.out.println(queue.size());
        
        
    }


}
