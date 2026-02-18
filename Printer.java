class Printer{
    static boolean isPrinting;

    static boolean onOrOff(){
        if(isPrinting == false){
            isPrinting = true;
            System.out.println("The Printer is turned on");
        }
        else if(isPrinting == true){
            isPrinting = false;
            System.out.println("The Printer is turned off");
        }
        return isPrinting;
    }
}

