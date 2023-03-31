public class LanciaMissili extends Arm {

    public LanciaMissili(String side) {
        super(side);
    }

    @Override
    public void attack() {
        System.out.println("Ti lancio i missili a " + this.side);
    }    
}
