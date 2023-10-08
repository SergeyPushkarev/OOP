public abstract class Runners {
    protected Integer maxDistance;
    protected Double jumpHeight;

    public Runners(Integer maxDistance, Double jumpHeight) {
        this.maxDistance = maxDistance;
        this.jumpHeight = jumpHeight;
    }

    abstract Boolean run(Double height, Integer position);
    abstract void finish(Integer distance);
}
