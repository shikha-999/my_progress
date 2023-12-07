import lombok.AllArgsConstructor;
import lombok.Getter;

//step1 : seperate the intrinsic state - that do not change
@AllArgsConstructor
@Getter
public class Bullet {
    private String image;
}
