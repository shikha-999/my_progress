import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
public class Pair2 <LEFT_TYPE, RIGHT_TYPE>{
    private LEFT_TYPE left;
    private RIGHT_TYPE right;

    public LEFT_TYPE getLeft() {
        return left;
    }
    public RIGHT_TYPE getRight() {
        return right;
    }
}
