    //superclass

class Openwheelcar{
    //Encapsulation
        //Attribute
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

//abstract class 

abstract class BuildOpenWheelcar{
    private String skill;
    private String name;
    private String jobpo;

    public abstract void skilltest();

}

    
    
 
    
    
    