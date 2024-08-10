package mateus.com;

public class Main {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(5);
        vetor.add("elemento 1");
        vetor.add("elemento 2");
        vetor.add("elemento 3");
        vetor.add("elemento 4");
        vetor.add("elemento 4");



        // System.out.println(vetor.size());
        // System.out.println(vetor);
        // System.out.println(vetor.find(4));

        vetor.add("elemento 8",4);

        System.out.println(vetor.isFull());


        System.out.println(vetor);

    }
}
