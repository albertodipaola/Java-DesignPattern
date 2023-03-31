public class App {
    public static void main(String[] args) throws Exception {
        //FACTORY
        JeegFactory factory = new JeegFactory();
        LanciaMissili lMissili = (LanciaMissili) factory.instance(JeegComponentType.LanciaMissiliDx);
        Laser laser = (Laser) factory.instance(JeegComponentType.LaserSx);
        Legs legs = (Legs) factory.instance(JeegComponentType.Legs);

        Jeeg jeeg = new Jeeg(lMissili, laser, legs);
        jeeg.attack();
        jeeg.move(Direction.Avanti);
        
        System.out.println("****************************");
        //FACTORY CON IL CASTING
        JeegFactoryAutoCasting factory2 = new JeegFactoryAutoCasting();
        LanciaMissili lMissili2 = factory2.instanceCasting(JeegComponentType.LanciaMissiliDx);
        Laser laser2 = factory2.instanceCasting(JeegComponentType.LaserSx);
        Legs legs2 = factory2.instanceCasting(JeegComponentType.Legs);

        Jeeg jeeg2 = new Jeeg(lMissili2, laser2, legs2);
        jeeg2.attack();
        jeeg2.move(Direction.Avanti);

    }
}
