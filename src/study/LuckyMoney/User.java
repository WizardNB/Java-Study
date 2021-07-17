package study.LuckyMoney;

public class User {

    private int Money;
    private String Name;
    public int getMoney() {
        return Money;
    }
    public void setMoney(int money) {
        Money = money;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public User(int money, String name) {
        Money = money;
        Name = name;
    }
}
