public abstract class Animal extends Runners{

    public Animal(Integer maxDistance, Double jumpHeight) {
        super(maxDistance, jumpHeight);
    }

    abstract Boolean run(Double height, Integer position);
    abstract void finish(Integer distance);
}
