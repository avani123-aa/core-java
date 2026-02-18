class WashingMachine{
    static boolean isOperating;

    static boolean onOrOff(){
        if(isOperating == false){
            isOperating = true;
            System.out.println("The Washing Machine is started");
        }
        else if(isOperating == true){
            isOperating = false;
            System.out.println("The Washing Machine is stopped");
        }
        return isOperating;
    }
}

