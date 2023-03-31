public class Legs extends Movable {

    @Override
    public void move(Direction direction) {
        System.out.println("Mi muovo in " + direction.toString());    
    }
}
