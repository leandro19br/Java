package core.serializacao;

import java.io.*;

public class SerializacaoTeste {
    public static void main(String[] args) {
        gravadorObjeto();
        leitorObjeto();//desserializable
    }

    private static void gravadorObjeto(){
        Turma t = new Turma("Maratona Java");
        Aluno aluno = new Aluno(1L,"Leandro","123");
        aluno.setTurma(t);
        //salvando esse aluno num arquivo
        try {
            FileOutputStream fos = new FileOutputStream("aluno.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);//salvar objetos em arquivo
            oos.writeObject(aluno);
            oos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void leitorObjeto() {

        try {
            FileInputStream fis = new FileInputStream("aluno.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);//salvar objetos em arquivo
            Aluno aluno = (Aluno) ois.readObject();
            ois.close();

            System.out.println(aluno);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();

        }
    }
}
