import java.util.ArrayList;
import java.util.List;

public class Abiturient {
    private int id;
    private String прізвище;
    private String ім_я;
    private String по_батькові;
    private String адреса;
    private String телефон;
    private List<Integer> оцінки;

    // Конструктор класу Abiturient
    public Abiturient(int id, String прізвище, String ім_я, String по_батькові, String адреса, String телефон, List<Integer> оцінки) {
        this.id = id;
        this.прізвище = прізвище;
        this.ім_я = ім_я;
        this.по_батькові = по_батькові;
        this.адреса = адреса;
        this.телефон = телефон;
        this.оцінки = оцінки;
    }

    // Метод для перевірки чи мають абітурієнти незадовільні оцінки
    public boolean маєНезадовільніОцінки() {
        for (int оцінка : оцінки) {
            if (оцінка < 4) {
                return true;
            }
        }
        return false;
    }

    // Метод для обчислення суми балів абітурієнта
    public int сумаБалів() {
        int сума = 0;
        for (int оцінка : оцінки) {
            сума += оцінка;
        }
        return сума;
    }

    // Перевизначений метод toString() для виведення інформації про абітурієнта
    @Override
    public String toString() {
        return "Abiturient{" +
                "id=" + id +
                ", прізвище='" + прізвище + '\'' +
                ", ім_я='" + ім_я + '\'' +
                ", по_батькові='" + по_батькові + '\'' +
                ", адреса='" + адреса + '\'' +
                ", телефон='" + телефон + '\'' +
                ", оцінки=" + оцінки +
                '}';
    }

    // Метод для створення масиву об'єктів абітуріентів
    public static Abiturient[] створитиМасивАбітуріентів() {
        Abiturient[] абітуріенти = {
                new Abiturient(1, "Петров", "Іван", "Олександрович", "Київ", "+380123456789", List.of(5, 4, 5, 3, 4)),
                new Abiturient(2, "Сидоров", "Максим", "Вікторович", "Львів", "+380987654321", List.of(4, 3, 4, 4, 5)),
                new Abiturient(3, "Іванова", "Марія", "Іванівна", "Харків", "+380111111111", List.of(5, 5, 5, 5, 5)),
                new Abiturient(4, "Коваленко", "Олексій", "Петрович", "Одеса", "+380222222222", List.of(3, 3, 2, 4, 2)),
                new Abiturient(5, "Семенова", "Анастасія", "Олександрівна", "Дніпро", "+380333333333", List.of(4, 4, 4, 4, 4))
        };
        return абітуріенти;
    }
}
