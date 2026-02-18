class Swiggy {

    public static double search(String foodName) {
        double price = 0.00;

        if (foodName == "masala puri") {
            price = 65.00;
            return price;
        }
        else if (foodName == "pani puri") {
            price = 55.50;
            return price;
        }
        else if (foodName == "vada pav") {
            price = 45.00;
            return price;
        }
        else if (foodName == "pav bhaji") {
            price = 135.00;
            return price;
        }
        else if (foodName == "rajma chawal") {
            price = 145.00;
            return price;
        }
        else if (foodName == "chole bhature") {
            price = 155.00;
            return price;
        }
        else if (foodName == "dal makhani") {
            price = 175.00;
            return price;
        }
        else if (foodName == "butter naan") {
            price = 42.00;
            return price;
        }
        else if (foodName == "tandoori roti") {
            price = 30.00;
            return price;
        }
        else if (foodName == "veg manchurian") {
            price = 165.00;
            return price;
        }
        else if (foodName == "hakka noodles") {
            price = 170.00;
            return price;
        }
        else if (foodName == "fried rice") {
            price = 160.00;
            return price;
        }
        else if (foodName == "spring roll") {
            price = 125.00;
            return price;
        }
        else if (foodName == "paneer tikka") {
            price = 210.00;
            return price;
        }
        else if (foodName == "malai kofta") {
            price = 225.00;
            return price;
        }
        else if (foodName == "veg korma") {
            price = 190.00;
            return price;
        }
        else if (foodName == "kadai paneer") {
            price = 235.00;
            return price;
        }
        else if (foodName == "palak corn") {
            price = 205.00;
            return price;
        }
        else if (foodName == "jeera rice") {
            price = 130.00;
            return price;
        }
        else if (foodName == "curd rice") {
            price = 115.00;
            return price;
        }
        else if (foodName == "tomato rice") {
            price = 118.00;
            return price;
        }
        else if (foodName == "bisibele bath") {
            price = 140.00;
            return price;
        }
        else if (foodName == "rava idli") {
            price = 85.00;
            return price;
        }
        else if (foodName == "set dosa") {
            price = 95.00;
            return price;
        }
        else if (foodName == "uttapam") {
            price = 105.00;
            return price;
        }
        else if (foodName == "pongal") {
            price = 92.00;
            return price;
        }
        else if (foodName == "medu vada") {
            price = 78.00;
            return price;
        }
        else if (foodName == "neer dosa") {
            price = 112.00;
            return price;
        }
        else if (foodName == "appam") {
            price = 122.00;
            return price;
        }
        else if (foodName == "puttu kadala") {
            price = 132.00;
            return price;
        }
        else if (foodName == "kerala parotta") {
            price = 48.00;
            return price;
        }
        else if (foodName == "fish curry meal") {
            price = 275.00;
            return price;
        }
        else if (foodName == "prawn fry") {
            price = 320.00;
            return price;
        }
        else if (foodName == "mutton curry") {
            price = 330.00;
            return price;
        }
        else if (foodName == "rogan josh") {
            price = 345.00;
            return price;
        }
        else if (foodName == "chicken 65") {
            price = 240.00;
            return price;
        }
        else if (foodName == "tandoori chicken") {
            price = 260.00;
            return price;
        }
        else if (foodName == "kebab platter") {
            price = 350.00;
            return price;
        }
        else if (foodName == "egg roll") {
            price = 110.00;
            return price;
        }
        else if (foodName == "veg roll") {
            price = 98.00;
            return price;
        }
        else if (foodName == "kulcha") {
            price = 88.00;
            return price;
        }
        else if (foodName == "samosa chaat") {
            price = 90.00;
            return price;
        }
        else if (foodName == "dahi puri") {
            price = 82.00;
            return price;
        }
        else if (foodName == "falooda") {
            price = 150.00;
            return price;
        }
        else if (foodName == "rabdi") {
            price = 158.00;
            return price;
        }
        else if (foodName == "gulab jamun") {
            price = 72.00;
            return price;
        }
        else if (foodName == "rasmalai") {
            price = 168.00;
            return price;
        }
        else if (foodName == "kesar kulfi") {
            price = 74.00;
            return price;
        }
        else if (foodName == "badam milk") {
            price = 69.00;
            return price;
        }
        else if (foodName == "masala chai") {
            price = 35.00;
            return price;
        }
        else if (foodName == "filter coffee") {
            price = 38.00;
            return price;
        }
        else {
            System.out.println("product is not available");
        }

        return price;
    }
}