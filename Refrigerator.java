class Refrigerator{
    static boolean isCooling;

    static boolean onOrOff(){
        if(isCooling == false){
            isCooling = true;
            System.out.println("The Refrigerator is turned on");
        }
        else if(isCooling == true){
            isCooling = false;
            System.out.println("The Refrigerator is turned off");
        }
        return isCooling;
    }
}

