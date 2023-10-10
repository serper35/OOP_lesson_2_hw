public class ServiceStation {

    StaffRemarks staff = new StaffRemarks();


    public void check(Car car) {
        System.out.println(staff.letsGo() + car.getModelName() + staff.willBeGood());
        for (int i = 0; i < car.getWheelsCount(); i++) {
            car.updateTyre();
        }
        staff.almostDone();
        car.checkEngine();
        staff.done();
    }

    public void check(Bicycle bicycle) {
        System.out.println(staff.letsGo() + bicycle.getModelName() + staff.willBeGood());
        for (int i = 0; i < bicycle.getWheelsCount(); i++) {
            bicycle.updateTyre();
            staff.done();
        }
    }
    public void check(Truck truck) {
        System.out.println(staff.letsGo() + truck.getModelName() + staff.willBeGood());
        for (int i = 0; i < truck.getWheelsCount(); i++) {
            truck.updateTyre();
        }
        staff.almostDone();
        truck.checkEngine();
        staff.almostDone();
        truck.checkTrailer();
        staff.done();
    }
}