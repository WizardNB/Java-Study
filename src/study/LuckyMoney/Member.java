package study.LuckyMoney;

public class Member extends User{

    static int count=0;
    public Member(int money, String name) {
        super(money, name);
        count++;
    }

    public void receive(int avg){
        setMoney(avg+getMoney());
    }
}
