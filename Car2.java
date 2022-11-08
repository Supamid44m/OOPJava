// การเรียกใช้ interface class ด้วย คำสั่ง implements จาก  class CarDesighCheat 
class Car2 extends BuildOpenWheelcar implements CarDesighCheat {

    //ต้องมี abstract method
    public  void setEngine(String engine){
        System.out.println("Engine:"+ " " +engine);

    }
    public void  setTopSpeed(int top_speed){
        System.out.println("Top-speed:" + " " + top_speed +" "+ "Km/h");
    }
    //method ที่มาจาก interface class CarDesighCheat
    public  void weight(int weight){
        System.out.println("weight:" + " " + weight +" "+ "kg");
    }
    public  void wing_height(int wing_height){
        System.out.println("wing_height:" + " " + wing_height +" "+ "m");
    }
    

}
