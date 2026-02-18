class Laptop{
    static boolean isOn;

    static boolean onOrOff(){
        if(isOn == false){
            isOn = true;
            System.out.println("The Laptop is powered on");
        }
        else if(isOn == true){
            isOn = false;
            System.out.println("The Laptop is powered off");
        }
        return isOn;
    }
}

