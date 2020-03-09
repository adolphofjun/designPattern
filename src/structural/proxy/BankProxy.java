package structural.proxy;

public class BankProxy {
    private Bank bank ;


    public BankProxy(){
        bank = new Bank();
    }

    /**
     * 在代理方法中只提供支付方法
     */
    public void payment(){
        bank.payment();
    }

}
