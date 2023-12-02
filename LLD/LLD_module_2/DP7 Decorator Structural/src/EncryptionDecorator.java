public class EncryptionDecorator extends BaseDecorator{
    private Database innerLayer;
    public EncryptionDecorator(Database innerLayerPassed){
        super(innerLayerPassed);
        this.innerLayer = innerLayerPassed;
    }

    @Override
    public String read() {
//        String original = super.read();
        String encryptedData = innerLayer.read();
        return decrypt(encryptedData);
    }

    private String decrypt(String input){
        return input + " - Decrypted";
    }

    @Override
    public void write(String Originalinput) {
        String encrypted = encrypt(Originalinput);
//        super.write(encrypted);
        innerLayer.write(encrypted);
    }

    private String encrypt(String input){
        return input + " - Encrypted";
    }



}
