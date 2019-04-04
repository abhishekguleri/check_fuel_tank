package Guleri;

public class sportsCar extends car {


    public sportsCar(double topSpeed){

        if(topSpeed > 200.0){
            efficency =200.0 /topSpeed;
        }
        else{
            efficency =1.0;
        }
    }
    public double getEfficency(){
        return efficency;
    }


}
