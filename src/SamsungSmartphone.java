class SamsungSmartphone implements Smartphone {
    @Override
    public void getDetails() {
        System.out.println("Samsung Smartphone.");
    }
}

class SamsungLaptop implements Laptop {
    @Override
    public void getDetails() {
        System.out.println("Samsung Laptop.");
    }
}
