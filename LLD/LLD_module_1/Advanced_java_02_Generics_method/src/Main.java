import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Triple<String> idToNameToEmail1 = new Triple<>("1","shikha","shikha@gmail.com");
        Triple<String> idToNameToEmail2 = new Triple<>("2","shreya","shreya@gmail.com");
        Triple<Integer> idToAgeToPan = new Triple<>(1, 20, 899);

        List<Triple<String>> tripleList= List.of(idToNameToEmail1, idToNameToEmail2);
        print(tripleList);
        print(idToAgeToPan);
        print1(idToNameToEmail1);

        System.out.println(calculateAverage(idToAgeToPan));
    }
    private static <TRIPLE_TYPE> void print(List<Triple<TRIPLE_TYPE>> tripleList){
        for(Triple<TRIPLE_TYPE> tripleIterator : tripleList){
            System.out.println(tripleIterator.getLeft()+" "+tripleIterator.getMiddle()+" "+tripleIterator.getRight());
        }
    }
    private static void print(Triple<Integer> triple){
        System.out.println(triple.getLeft()+" "+triple.getRight()+" "+triple.getRight());
    }
    private static <TYPE> TYPE print1(Triple<TYPE> triple){
        System.out.println(triple.getLeft()+" "+triple.getMiddle()+" "+triple.getRight());
        return triple.getMiddle();
    }

    private static Double calculateAverage(Triple<Integer> triple){
        return (triple.getLeft().doubleValue() + triple.getMiddle().doubleValue() + triple.getRight().doubleValue()) / 3;
    }
}