public class App {
    public static void main(String[] args) throws Exception {
        JeegFactorySingleton factory = new JeegFactorySingleton();
        LanciaMissili lMissili1 = (LanciaMissili)factory.instance(JeegComponentType.LanciaMissiliDx);
        Laser laser1 = (Laser)factory.instance(JeegComponentType.LaserSx);
        Legs legs1 = (Legs)factory.instance(JeegComponentType.Legs);

        Jeeg jeeg1 = new Jeeg(lMissili1, laser1, legs1);
        jeeg1.attack();
        jeeg1.move(Direction.Avanti);

        System.out.println("******************************");
        //AUTOCASTING
        JeegFactorySingletonAutoCasting factory2 = new JeegFactorySingletonAutoCasting();
        LanciaMissili lMissili2 = factory2.instance(JeegComponentType.LanciaMissiliDx);
        Laser laser2 = factory2.instance(JeegComponentType.LaserSx);
        Tank tank2 = factory2.instance(JeegComponentType.Tank);

        Jeeg jeeg2 = new Jeeg(lMissili2, laser2, tank2);
        jeeg2.attack();
        jeeg2.move(Direction.Avanti);

    }
}
