public class JeegFactory {

    public Object instance(JeegComponentType componentName){
        Object component = null;
        switch (componentName) {
            case Legs:
                component = new Legs();
                break;
            case Tank:
                component = new Tank();
                break;
            case LanciaMissiliDx:
                component = new LanciaMissili("destra");
                break;
            case LanciaMissiliSx:
                component = new LanciaMissili("sinistra");
                break;
            case LaserDx:
                component = new Laser("destra");
                break;
            case LaserSx:
                component = new Laser("sinistra");
                break;
        
            default:
                break;
        }
        return component;
    };
}
