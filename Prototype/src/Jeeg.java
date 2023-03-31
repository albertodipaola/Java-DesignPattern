public class Jeeg {
    private Arm armDx;
    private Arm armSx;
    private Movable movable;
    
    public Jeeg(Arm armDx, Arm armSx, Movable movable) {
        this.setArm(armDx, Side.Dx);
        this.setArm(armSx, Side.Sx);
        this.movable = movable;
    }

    public void setArm(Arm arm, Side side) {
        if (side.equals(Side.Dx)) {
            this.armDx = arm;
        }
        if (side.equals(Side.Sx)) {
            this.armSx = arm;
        }
    }

    public void setMovable(Movable movable) {
        this.movable = movable;
    }
    
    public Arm getArmDx() {
        return armDx;
    }

    public Arm getArmSx() {
        return armSx;
    }

    public Movable getMovable() {
        return movable;
    }

    public void attack() {
        this.armDx.attack();
        this.armSx.attack();
        if (this.movable instanceof Tank) {
            Tank tank = (Tank)this.movable;
            tank.attack();
        }
    }

    public void move(Direction direction) {
        this.movable.move(direction);
    }
}
