public class Main {
     public static void main(String[] args) {
        Openwheelcar car1=new Openwheelcar();
        car1.brand="Redbull";

       // car1.engine="v8"; //Encapsulation
        car1.setEngine("RB16");
        car1.setTires(18);
        car1.setTopSpeed(397);
        car1.setCylinders(6);
        car1.showInfo();

        
    }
}
