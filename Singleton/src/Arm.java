abstract public class Arm implements CanAttack {
    protected String side;

    public Arm(String side) {
        this.side = side;
    }

    @Override
    abstract public void attack();
    
}
