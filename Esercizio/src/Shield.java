public class Shield {
    private String name;
    private int durability;
    
    public Shield(String name, int durability) {
        this.name = name;
        this.durability = durability;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    public void defense() {
        System.out.println("alzo lo scudo");
    }

    public void parry() {
        System.out.println("provo a parare l'attacco");
    }


}
