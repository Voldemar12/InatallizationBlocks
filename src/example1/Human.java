package example1;

public class Human {
    public void takeMilkshake() {
        HumanThough though = new HumanThough() {
            @Override
            public void print() {
                System.out.println("Что же взять? " +
                        "Шоколадный или клубничный коктейль?");
            }
        };
        though.print();
    }
}
