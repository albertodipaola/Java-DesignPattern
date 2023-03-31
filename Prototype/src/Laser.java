public class Laser extends Arm {

    public Laser(String side) {
        super(side);
    }

    @Override
    public void attack() {
        System.out.println("Ti brucio con il laser " + this.side);
    }
    
}
