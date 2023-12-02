public class CompressionDecorator extends BaseDecorator{
    //personal reference  -> this class will compress data
    //but to store it needs access to nextLayer(inner layer)
    private Database innerLayer;
    //constructor
    public CompressionDecorator(Database innerLayerPassed){
        super(innerLayerPassed);
        this.innerLayer = innerLayerPassed;
    }
    @Override
    public String read() {
        String original = innerLayer.read();
        return decompress(original);
    }

    private String decompress(String original){
        return original + " - Decompressed";
    }

    @Override
    public void write(String input) {
        String compressed = compress(input);
        innerLayer.write(compressed);
    }

    private String compress(String input){
        return input + " - Compressed";
    }
}
