package study.LuckyMoney;

public class FaHongbao {
    public String Mname = "sf";
    public void faHongbaoResult(){
        Manager manager =new Manager(500,Mname);

        Member one =new Member(2, Mname);

        one.receive(manager.send(Member.count));
        System.out.println("群主现在有"+manager.getMoney()+"元\n"+one.getName()+"有"+one.getMoney()+"元");
    }


}
