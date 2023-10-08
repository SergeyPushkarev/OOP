import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Track track = new Track(10000, new ArrayList<Barrier>(
                Arrays.asList(
                        new Barrier(0.150,1000),
                        new Barrier(0.300,2500),
                        new Barrier(0.600,4500),
                        new Barrier(1.200,6000),
                        new Barrier(2.000,8000)
                )
        ));

        Runners robot = new Robot(100000, 2.000);
        Runners human = new Human(10000, 0.700);
        Runners cat = new Cat(4000, 1.800);

        //ArayList<Runners> runners = (ArrayList<Runners>) Arrays.asList(robot, human, cat);
        ArrayList<Runners> runners = new ArrayList<Runners>();
            runners.add(robot);
            runners.add(human);
            runners.add(cat);

        Boolean flag = true;
        for (Runners runner : runners) {
            ArrayList<Barrier> barriers = track.getBarriers();

            for (int i=0; i<barriers.size(); i++){
                Double height = barriers.get(i).getHeight();
                Integer position = barriers.get(i).getPosition();

                if(!runner.run(height, position)) {
                    i = barriers.size();
                    flag = false;
                }
            }

            if (flag) {
                runner.finish(track.getDistance());
            }
            System.out.println();
        }
    }
}