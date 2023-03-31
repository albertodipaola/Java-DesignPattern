public class Player {
    private Weapon weapon;
    private Shield shield;
    private Bow bow;
    private int arrows = 3;
    
    public Player(Weapon weapon, Shield shield, Bow bow) {
        this.weapon = weapon;
        this.shield = shield;
        this.bow = bow;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Shield getShield() {
        return shield;
    }

    public void setShield(Shield shield) {
        this.shield = shield;
    }

    public Bow getBow() {
        return bow;
    }

    public void setBow(Bow bow) {
        this.bow = bow;
    }

    public void move(Direction direction) {
        System.out.println("mi muovo "+ direction.toString());
    }

    public void normalAttack() {
        this.weapon.normalAttack();
    }

    public void chargeAttack() {
        this.weapon.chargeAttack();
    }

    public void defense() {
        this.shield.defense();
    }

    public void parry() {
        this.shield.parry();
    }

    public void shootArrow() {
        if (arrows > 0) {
            this.bow.shootArrow();
            arrows --;
        }
        else{
            System.out.println("non hai piu freccie");
        }

    }

}
