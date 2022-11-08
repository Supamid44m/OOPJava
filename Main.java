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

        FormulaOne car2 = new FormulaOne();
        car2.setTopSpeed(300); //override method
        car2.Driver("Mart","testDriver");
        car2.IsChampion(3);
        car2.IsHybrid();

        
    }
}
