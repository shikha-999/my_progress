import java.util.List;
import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //arraylist
        List<Integer> list = new ArrayList<>();

        //raw type (no error)
        //Pair nameToEmail = new Pair("Shikha", "shikha@gmail.com");
        //Pair nameToAge = new Pair(1, 100);

        //normal constructors
        Pair<String> nameToEmail = new Pair<>("Shikha", "shikha@gmail.com");
        Pair<Integer> idToAge = new Pair<>(1, 100);

        List<Pair<String>> nameToEmailList = List.of(nameToEmail);
        for (Pair<String> nameToEmailIterator : nameToEmailList) {
            System.out.println(nameToEmailIterator.getLeft() + " " + nameToEmailIterator.getRight());
        }

        List<Pair<Integer>> idToAgeList = List.of(idToAge);
        for (Pair<Integer> idToAgeIterator : idToAgeList) {
            System.out.println(idToAgeIterator.getLeft() + " " + idToAgeIterator.getRight());
        }

//        var nameToEmail1 = new Pair2<>("abc", "abc@gmail.com");
        Pair2<String, String> nameToEmail1 = new Pair2<>("abc", "abc@gmail.com");
        Pair2<String, Integer> nameToId = new Pair2<>("xyz", 999);

        List<Pair2<String, String>> nameToEmail1List = List.of(nameToEmail1);
        for (Pair2<String, String> nameToEmail1Iterator : nameToEmail1List) {
            System.out.println(nameToEmail1Iterator.getLeft() + " " + nameToEmail1Iterator.getRight());
        }
        List<Pair2<String, Integer>> nameToIdList = List.of(nameToId);
        for (Pair2<String, Integer> nameToIdIterator : nameToIdList) {
            System.out.println(nameToIdIterator.getLeft() + " " + nameToIdIterator.getRight());
        }
    }
}