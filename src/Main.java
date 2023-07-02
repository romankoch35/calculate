public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int balance = 711;
        int miles = service.calculate(balance);
        System.out.println("На вашем счету - " + miles + " миль.");
    }
}