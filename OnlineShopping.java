class OnlineShopping {

    public static void main(String[] args) {
        createCustomer(501, "Amit", "Sharma", "amit@gmail.com", 560078, "Bangalore");
    }

    static void createCustomer(int customerId, String firstName, String lastName,
                               String email, int zipCode, String city) {

        System.out.println("Customer ID: " + customerId);
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Email: " + email);
        System.out.println("Zip Code: " + zipCode);
        System.out.println("City: " + city);
    }
}