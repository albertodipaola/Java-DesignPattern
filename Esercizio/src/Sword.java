public class Sword extends Weapon {

    public Sword(String name, int damage, int durability) {
        super(name, damage, durability);
    }

    @Override
    public void normalAttack() {
       System.out.println("fendente");
    }

    @Override
    public void chargeAttack() {
        System.out.println("fendente ampio");
    }
   
}
