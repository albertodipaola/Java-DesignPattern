public class Tank extends Movable implements CanAttack{
    
    @Override
    public void attack() {
        System.out.println("Ti sparo con il tank");
    }

    @Override
    public void move(Direction direction) {
        System.out.println("Mi muovo in " + direction.toString());
    }
}
