class Rocket3 {
    public static void main(String[] args) {
        Rocket rocket = new Rocket("Rocket A", 1000.0, 2000.0, 1);
        System.out.println("Name: " + rocket.getName());
        System.out.println("Range: " + rocket.getRange() + " km");
        System.out.println("Speed: " + rocket.getSpeed() + " m/s");
        System.out.println("Warhead: " + rocket.getWarhead());
    }
}
