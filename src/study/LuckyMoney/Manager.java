package study.LuckyMoney;

public class Manager extends User{

    public Manager(int money, String name) {
        super(money, name);
    }

    public int send(int count){
        int avg=(getMoney()-getMoney()%count)/count;
        setMoney(getMoney()-count*avg);
        return avg;
    }

}
