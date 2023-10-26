import ru.netology.hwCycles.services.MoneyService;

public class Main {

    public static void main(String[] args) {

        MoneyService service = new MoneyService();
        System.out.println(service.calcMoney(100_000, 60_000, 150_000));

    }
}
