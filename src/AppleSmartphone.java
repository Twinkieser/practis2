class AppleSmartphone implements Smartphone {
    @Override
    public void getDetails() {
        System.out.println("Apple Smartphone.");
    }
}

class AppleLaptop implements Laptop {
    @Override
    public void getDetails() {
        System.out.println("Apple Laptop.");
    }
}
