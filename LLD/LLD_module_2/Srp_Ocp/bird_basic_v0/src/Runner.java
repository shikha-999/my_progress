public class Runner {
    public static void main(String[] args) {
        Bird crow = new Bird(100, "white", BirdType.CROW);
        crow.fly();

        Bird sparrow = new Bird(50, "black", BirdType.SPARROW);
        sparrow.fly();
    }
}
