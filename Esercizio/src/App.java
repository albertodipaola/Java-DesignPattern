public class App {
    public static void main(String[] args) throws Exception {
        //FACTORY PROTOTYPE
        PlayerFactoryPrototype fPrototype = new PlayerFactoryPrototype();
        Sword spadav = fPrototype.istance(EquipType.SpadaViand);
        Shield scudore = fPrototype.istance(EquipType.ScudoReal);
        Bow arcocon = fPrototype.istance(EquipType.ArcoConc);

        Player player = new Player(spadav, scudore, arcocon);
        player.normalAttack();
        player.chargeAttack();
        player.move(Direction.avanti);
        player.defense();
        player.shootArrow();

        System.out.println("******************************");
        // FACTORY SINGLETON
        PlayerFactorySingleton fSingleton = new PlayerFactorySingleton();
        Lance lanciasol = fSingleton.istance(EquipType.LanciaSold);
        Shield scudocac = fSingleton.istance(EquipType.ScudoCacc);
        Bow arcosem = fSingleton.istance(EquipType.ArcoSem);

        Player player2 = new Player(lanciasol, scudocac, arcosem);
        player2.normalAttack();
        player2.chargeAttack();
        player2.move(Direction.destra);
        player2.parry();
        player2.shootArrow();
        player2.shootArrow();
        player2.shootArrow();
        player2.shootArrow();
        

    }
}
