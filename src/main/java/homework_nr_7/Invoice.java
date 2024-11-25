
//4. Создайте класс Invoice , который будет представлять счет, выставленный магазином при покупке электроприбора.
// Счет-фактура должен содержать следующую информацию: модель устройства (String), описание продукта (String),
// количество приобретенных продуктов (int) и цену продукта (double).
// Определите конструктор, который будет инициализировать атрибуты класса Invoice.
// Добавьте методы setter и getter для каждого атрибута.
// Реализуйте метод с именем getAmount, который будет вычислять и возвращать сумму счета в виде double значения.
// Когда количество продуктов, указанное с помощью конструктора или метода установки, не представляет положительное
// значение, соответствующей переменной будет автоматически присвоено значение 0 (ноль).
// То же самое будет сделано в случае значения цены, если оно не представляет собой положительное значение,
// переменной будет присвоено значение 0,0.
// 5. Создайте объект типа Invoice. Инициализируйте необходимые атрибуты и вызовите метод getAmount.
// Убедитесь, что возвращаемый результат правильный.
package homework_nr_7;

public class Invoice {
    private String model;
    private String description;
    private int amount = 0;
    private double price = 0;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Invoice(String model, String description, int amount, double price) {
        this.model = model;
        this.description = description;
        if (amount <= 0) {this.amount = 0;} else {this.amount = amount;}
        if (price <=0 ) {this.price = 0;} else {this.price = price;}
    }

    public double FinalPrice (){
        double finalPrice = 0;
        finalPrice = price * amount;
        return finalPrice;
    }
}
