public class ParkingLot {
    // fields

    private final Level[] levels;

    // methods

    public ParkingLot(int[][] design) {
        this.levels = new Level[design.length];
        for (int i = 0; i < design.length; i++) {
            levels[i] = new Level(i, design[i][0], design[i][1], design[i][2]);
        }
    }

    public boolean canPark(Vehicle vehicle) {
        for (Level level : levels) {
            if (level.canPark(vehicle)) {
                return true;
            }
        }
        return false;
    }

    public boolean goPark(Vehicle vehicle) {
        if (!canPark(vehicle)) {
            return false;
        }
        for (Level level : levels) {
            if (level.goPark(vehicle)) {
                return true;
            }
        }
        return false;
    }
}
