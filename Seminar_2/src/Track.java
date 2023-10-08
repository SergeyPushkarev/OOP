import java.util.ArrayList;

public class Track {
    private Integer distance;
    private ArrayList<Barrier> barrier;

    public Track(Integer distance, ArrayList<Barrier> barrier) {
        this.distance = distance;
        this.barrier = barrier;
    }

    public ArrayList<Barrier> getBarriers(){
        return barrier;
    }

    public Integer getDistance(){
        return distance;
    }
}
