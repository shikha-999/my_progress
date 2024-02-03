import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Triple <TYPE>{
    private TYPE left;
    private TYPE middle;
    private TYPE right;

    public TYPE getLeft() {
        return left;
    }

    public TYPE getRight() {
        return right;
    }

    public TYPE getMiddle() {
        return middle;
    }
}
