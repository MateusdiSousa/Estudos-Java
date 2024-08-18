package mateus.com;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("String vetor");
        
        Vetor vetor = new Vetor(5);
        vetor.add("elemento 1");
        vetor.add("elemento 2");
        vetor.add("elemento 3");
        vetor.add("elemento 4");
        vetor.add("elemento 5");

        System.out.println(vetor.size());

        System.out.println(vetor);

        System.out.println("Generic Vetor");

        VetorGenerics<Integer> vetor2 = new VetorGenerics<Integer>(5);
        vetor2.add(1);
        vetor2.add(2);
        vetor2.add(3);
        vetor2.add(4);

        System.out.println(vetor2);


        System.out.println("ArrayList");

        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("Teste");
        arrayList.add("Teste 2");

        System.out.println(arrayList);

        arrayList.add(1,"Teste 4");

        System.out.println(arrayList);

    }
}
