class Microwave{
    static boolean isHeating;

    static boolean onOrOff(){
        if(isHeating == false){
            isHeating = true;
            System.out.println("The Microwave is turned on");
        }
        else if(isHeating == true){
            isHeating = false;
            System.out.println("The Microwave is turned off");
        }
        return isHeating;
    }
}

