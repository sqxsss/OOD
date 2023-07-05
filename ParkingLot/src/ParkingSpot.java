public class ParkingSpot {
    // fields

    private final Type type;

    private Vehicle cur;

    // methods

    public ParkingSpot(Type type) {
        this.type = type;
        this.cur = null;
    }

    public boolean canPark(Vehicle vehicle) {
        // corner case

        return this.cur == null && this.type == vehicle.getType();
    }

    public synchronized boolean goPark(Vehicle vehicle) {
        if (canPark(vehicle)) {
            this.cur = vehicle;
            return true;
        }
        return false;
    }

    public Vehicle leavePark() {
        // corner case
        Vehicle temp = this.cur;
        this.cur = null;
        return temp;
    }

}
