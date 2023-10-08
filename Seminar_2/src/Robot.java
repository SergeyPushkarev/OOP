public class Robot extends Runners{

    public Robot(Integer maxDistance, Double jumpHeight) {
        super(maxDistance, jumpHeight);
    }

    public Boolean run(Double height, Integer position) {
        if (this.maxDistance < position) {
            System.out.println("Робот пробежал " + this.maxDistance + " метров и разрядился");
            return false;
        } else {
            if (this.jumpHeight < height) {
                System.out.println("Робот не смог перепрыгнуть препятствие высотой " + height + " метра. Всего пройдено " + position + ".");
                return false;
            } else {
                System.out.println("Робот перепрыгнул препятствие высотой " + height + " метра и продолжает бег.");
            }
        }
        return true;
    }
    public void finish(Integer distance) {
        if (this.maxDistance < distance) {
            System.out.println("Робот пробежал " + this.maxDistance + " метров и разрядился");
        } else {
            System.out.println("Робот финишировал на дистанции " + distance + ".");
        }
    }
}
