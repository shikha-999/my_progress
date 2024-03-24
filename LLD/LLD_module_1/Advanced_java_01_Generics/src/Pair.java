import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
public class Pair <TYPE>{
    private TYPE left;
    private TYPE right;

    public TYPE getLeft() {
        return left;
    }

    public TYPE getRight() {
        return right;
    }
}
