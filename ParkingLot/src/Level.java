import java.util.List;

public class Level {
    // fields

    private final int floor;

    private ParkingSpot[] spots;

    // methods

    public Level(int floor, int BusCap, int CarCap, int MotoCap) {
        this.floor = floor;
        this.spots = new ParkingSpot[BusCap + CarCap + MotoCap];

        for (int i = 0; i < spots.length; i++) {
            if (i < BusCap) {
                spots[i] = new ParkingSpot(Type.BUS);
            } else if (i >= BusCap && i < BusCap + CarCap) {
                spots[i] = new ParkingSpot(Type.CAR);
            } else {
                spots[i] = new ParkingSpot(Type.MOTO);
            }
        }
    }

    public boolean canPark(Vehicle vehicle) {
        for (ParkingSpot spot : spots) {
            if (spot.canPark(vehicle)) {
                return true;
            }
        }
        return false;
    }

    public boolean goPark(Vehicle vehicle) {
        if (!canPark(vehicle)) {
            return false;
        }
        for (ParkingSpot spot : spots) {
            if (spot.goPark(vehicle)) {
                return true;
            }
        }
        return false;
    }

    public int numOfAvailableSpot(Vehicle vehicle) {
        int count = 0;

        for (ParkingSpot spot : spots) {
            if (spot.canPark(vehicle)) {
                count++;
            }
        }
        return count;
    }
}
