class AC{
    static boolean isActive;

    static boolean onOrOff(){
        if(isActive == false){
            isActive = true;
            System.out.println("The AC is turned on");
        }
        else if(isActive == true){
            isActive = false;
            System.out.println("The AC is turned off");
        }
        return isActive;
    }
}

