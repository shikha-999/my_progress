//step 2: create a class for extrinsic state - fields that can change

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
class FlyingBullet {
    private Double x;
    private Double y;
    private Double z;
    private Double radius;
    private Double length;
    private Integer damageFactor;
    private BulletType type;

    //step3: add a reference of intrinsic state
    private Bullet bullet;
}
