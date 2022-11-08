public class Main {
     public static void main(String[] args) {
        Openwheelcar car1=new Openwheelcar();
        car1.brand="Redbull";                           

       // car1.engine="v8";                                                 //Encapsulation
        car1.setEngine("RB16");                                      //method จาก superclass
        car1.setTires(18); 
        car1.setTopSpeed(397);
        car1.setCylinders(6); 
        car1.showInfo(); 

        FormulaOne car2 = new FormulaOne();
        car2.setTopSpeed(300); 
        car2.Driver("Lewis Hamilton","George Russell");         // เรียกใช้ overloading method ที่ชื่อ   Driver จาก subclass FormulaOne
        car2.IsChampion(3);                                     // เรียกใช้ overloading method  ที่ชื่อ  IsChampion จาก subclass FormulaOne
        car2.IsHybrid();                                                   //เรียกใช้ overriding method  

        
        
        //Car car3 = new Car();                                               //สร้าง object ใหม่จาก  class Car 
    }
}
