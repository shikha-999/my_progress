public class Runner {
    public static void main(String[] args) {
        Bird crow = new Crow(100, "white");
        crow.fly();
        System.out.println(crow.weight);

        Bird sparrow = new Sparrow(50, "black");
        sparrow.fly();
    }
}
