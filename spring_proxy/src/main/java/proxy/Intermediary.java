package proxy;


//中介类  代理角色
public class Intermediary implements IRent {
    private Landlord landlord;

    Intermediary() {
    }

    Intermediary(Landlord landlord) {
        this.landlord = landlord;
    }

    public void rent() {
        seeHouse();
        if (landlord != null) {
            landlord.rent();
        }
        sign();
    }

    public void sign() {
        System.out.println("签约合同");
    }

    public void seeHouse() {
        System.out.println("看房子");
    }
}
