//step 2: create concrete product subclasses
public class FileDatabase implements Database{
    @Override
    public String read() {
        return "Stored Base data retrieved";
        //downside -> all data will be encrypted, all data would need decryption
        // this is where decorator pattern comes
        //return "Base - encrypted";
    }

    @Override
    public void write(String input) {
        System.out.println("Writing " + input);
    }
}
