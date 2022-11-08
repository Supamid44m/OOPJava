//การเรียกใช้ //abstract class  โดยการสืบทอดจาก class BuildOpenWheelcar ซึ่งเป็น abstarct class
class Car extends BuildOpenWheelcar {

    //ต้องมี method ที่เหมือนกันกับ superclass ถึงจะทำงานได้
    public  void setEngine(String engine){
            System.out.println("Engine:"+ " " +engine);
    }

    public  void setTopSpeed(int top_speed){
            System.out.println("Top-speed:" + " " + top_speed +" "+ "Km/h");
    }

}
    

