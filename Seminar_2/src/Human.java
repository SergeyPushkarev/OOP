public class Human extends Animal{

    public Human(Integer maxDistance, Double jumpHeight) {
        super(maxDistance, jumpHeight);
    }

    public Boolean run(Double height, Integer position) {
        if (this.maxDistance < position) {
            System.out.println("Человек пробежал " + this.maxDistance + " метров и устал");
            return false;
        } else {

            if (this.jumpHeight < height) {
                System.out.println("Человек не смог перепрыгнуть препятствие высотой " + height + " метра. Всего пройдено " + position + ".");
                return false;
            } else {
                System.out.println("Человек перепрыгнул препятствие высотой " + height + " метра и продолжает бег.");
            }
        }
        return true;
    }

    public void finish(Integer distance) {
        if (this.maxDistance < distance) {
            System.out.println("Человек пробежал " + this.maxDistance + " метров и устал");
        } else {
            System.out.println("Человек финишировал на дистанции " + distance + ".");
        }
    }
}
