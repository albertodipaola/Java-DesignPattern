public class PlayerFactoryPrototype {
    public<T> T istance(EquipType equipType) {
        Object equip = null;
        switch (equipType) {
            case SpadaViand:
                equip = new Sword("spada viandante", 12, 20);
                break;
            case LanciaSold:
                equip = new Lance("lancia da soldato", 15, 30);
                break;
            case AsciaBosc:
                equip = new Sword("ascia da boscaiolo", 30, 7);
                break;
            case ScudoCacc:
                equip = new Shield("scudo da cacciat", 4);
                break;
            case ScudoReal:
                equip = new Shield("scudo reale", 45);
                break;
            case ArcoSem:
                equip = new Bow("arco semplice", 5, 7);
                break;
            case ArcoConc:
                equip = new Bow("arco composito", 15, 22);
                break;
            case ArcoLun:
                equip = new Bow("arco lungo", 35, 3);
                break;
        }
        return (T)equip;
    }
}
