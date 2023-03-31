public class Lance extends Weapon{
    public Lance(String name, int damage, int durability) {
        super(name, damage, durability);
    }

    @Override
    public void normalAttack() {
        System.out.println("affondo");
    }

    @Override
    public void chargeAttack() {
        System.out.println("piu affondi");
    }
    
}
