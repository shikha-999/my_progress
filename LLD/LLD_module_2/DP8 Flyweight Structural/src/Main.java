  // Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        Bullet bullet = new Bullet(1.0, 1.0, 1.0, 9.0, 5.0,
//                                 10, BulletType.NINE_MM, "Image");
//        System.out.println(bullet.getType());

        //multiple intrinsic objects,still less memory impact
        Bullet intrinsicBullet = new Bullet("Bullet Image");
        Bullet intrinsicBullet2 = new Bullet("Bullete Image 2");
        FlyingBullet extrinsicBullet1 = new FlyingBullet(1.0,1.0,1.0,9.0,
                                    5.0,10,BulletType.NINE_MM, intrinsicBullet);
        FlyingBullet extrinsicBullet2 = new FlyingBullet(2.0,2.0,2.0,7.0,
                                    7.0,7,BulletType.FIVE_MM, intrinsicBullet);

        System.out.println(extrinsicBullet2.getType() + ", image is: "+extrinsicBullet2.getBullet().getImage());
    }
}