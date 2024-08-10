import strategy.DriveStratagy;

public class Vehicle  {
    DriveStratagy obj;
    public Vehicle(DriveStratagy obj){
        this.obj = obj;
    }

    void Drive(){
        obj.Drive();
    }

}
