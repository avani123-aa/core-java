class ECommerce {

    private String productNames[] = new String[26];
    int index;

    public boolean addProduct(String productName) {

        boolean isAdded = false;

        if (productName != null && !productName.isEmpty()) {
            productNames[index] = productName;
            index++;
            isAdded = true;
        } else {
            System.out.println(productName + " is invalid");
        }

        return isAdded;
    }

    public void getProducts() {
        for (String product : productNames) {
            if (product != null) {
                System.out.println(product);
            }
        }
    }
}