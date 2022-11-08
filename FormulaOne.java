//Inheritance

class FormulaOne extends Openwheelcar {
    
    //overloading method 
    public void IsChampion(){
        System.out.println("No Champ");
    }
    public void IsChampion(int champtime){
        System.out.println("ChampTitle:" + " "+ champtime + " " + "time");

    }
    public void Driver(String...driver){
        for(int i=0;i<driver.length;i++){
            System.out.println("Driver:" + " "+ driver[i]);
        }

    }


}
