import java.util.HashMap;
import java.util.Map;

public class JeegFactorySingleton {
    private Map<JeegComponentType, Object> registry = new HashMap<>();

    public Object instance(JeegComponentType componentType) {
        switch (componentType) {
            case Legs:
                if (!registry.containsKey(componentType)) {
                    registry.put(componentType, new Legs());
                }
                break;
            case Tank:
                if (!registry.containsKey(componentType)) {
                    registry.put(componentType, new Tank());
                }
                break;
            case LanciaMissiliDx:
                if (!registry.containsKey(componentType)) {
                    registry.put(componentType, new LanciaMissili("destro"));
                }
                break;
            case LanciaMissiliSx:
                if (!registry.containsKey(componentType)) {
                    registry.put(componentType, new LanciaMissili("sinistro"));
                }
                break;
            case LaserDx:
                if (!registry.containsKey(componentType)) {
                    registry.put(componentType, new Laser("destro"));
                }
                break;
            case LaserSx:
                if (!registry.containsKey(componentType)) {
                    registry.put(componentType, new Laser("sinistro"));
                }
                break;
        }
        return registry.get(componentType);
    }
}
