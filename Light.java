class Light{
    static boolean isGlowing;

    static boolean onOrOff(){
        if(isGlowing == false){
            isGlowing = true;
            System.out.println("The Light is turned on");
        }
        else if(isGlowing == true){
            isGlowing = false;
            System.out.println("The Light is turned off");
        }
        return isGlowing;
    }
}

