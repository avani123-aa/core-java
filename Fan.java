class Fan {
    static boolean isOn;
    static int speed;
    static int maxSpeed = 5;
    static int minSpeed = 0;

    static void power() {
        if (!isOn) {
            isOn = true;
            System.out.println("Fan is ON");
        } else {
            isOn = false;
            System.out.println("Fan is OFF");
        }
    }

    static void increaseSpeed() {
        if (isOn) {
            if (speed < maxSpeed) {
                speed++;
                System.out.println("Speed: " + speed);
            } else {
                System.out.println("Max speed reached");
            }
        } else {
            System.out.println("Turn on the fan first");
        }
    }

    static void decreaseSpeed() {
        if (isOn) {
            if (speed > minSpeed) {
                speed--;
                System.out.println("Speed: " + speed);
            } else {
                System.out.println("Min speed reached");
            }
        }
    }
}