    //superclass

class Openwheelcar{
    
        
        //Attribute and access modifier
        public String brand;
        private  String engine;
        private  int tires_size;
        private  int top_speed;
        private  int cylinders;
        
    
        //constructor
        Openwheelcar(){
    
        }
        
        //method
        public void setEngine(String engine){
            this.engine=engine;
            
        }
        public void setTires(int tires_size){
            this.tires_size=tires_size;
        }
        public void setTopSpeed(int tspeed){
            this.top_speed=tspeed;
        }
        public void setCylinders(int cylinders){
            this.cylinders=cylinders;
        }
    
        public void  showInfo(){
            System.out.println("Brand:"+brand);
            System.out.println("Engine:"+this.engine);
            System.out.println("Tires_Size:"+this.tires_size);
            System.out.println("TopSpeed:"+this.top_speed);
            System.out.println("Cylinders:"+this.cylinders);
        }
        public String getEngine(){
            return this.engine;
        }
        public void IsHybrid(){
            System.out.println(" No Hybrid engine");

        }
        
       
}

// การสร้าง abstract class
abstract class BuildOpenWheelcar{
    public String brand;
    private String engine;
    private  int top_speed;
    
    public abstract void setEngine();
    public abstract void setTopSpeed();
}
// การสร้าง interface class ด้วยกำหนด interface ข้างหน้าชื่อclass

interface CarDesighCheat{
    public abstract void weight(int weight);
    public abstract void wing_height(int weight);
    

}



/*** 
 
 ***/




    
    
 
    
    
    