import java.util.HashMap;
import java.util.Map;

public class PlayerFactorySingleton {
    public Map<EquipType, Object> registry = new HashMap<>();

    public<T> T istance(EquipType equipType) {
        switch (equipType) {
            case SpadaViand:
                if (!registry.containsKey(equipType)) {
                    registry.put(equipType, new Sword("spada viandante", 12, 20));
                }
                break;
            case LanciaSold:
                if (!registry.containsKey(equipType)) {
                    registry.put(equipType, new Lance("lancia da soldato", 15, 30));
                }    
                break;
            case AsciaBosc:
                if (!registry.containsKey(equipType)) {
                    registry.put(equipType, new Sword("ascia da boscaiolo", 30, 7));
                }    
                break;
            case ScudoCacc:
                if (!registry.containsKey(equipType)) {
                    registry.put(equipType, new Shield("scudo da cacciat", 4));
                }    
                break;
            case ScudoReal:
                if (!registry.containsKey(equipType)) {
                    registry.put(equipType, new Shield("scudo reale", 45));
                }    
                break;
            case ArcoSem:
                if (!registry.containsKey(equipType)) {
                    registry.put(equipType, new Bow("arco semplice", 5, 7));
                }    
                break;
            case ArcoConc:
                if (!registry.containsKey(equipType)) {
                    registry.put(equipType, new Bow("arco composito", 15, 22));
                }    
                break;
            case ArcoLun:
                if (!registry.containsKey(equipType)) {
                    registry.put(equipType, new Bow("arco lungo", 35, 3));
                }    
                break;
        }
        return (T)registry.get(equipType);
    }

}
