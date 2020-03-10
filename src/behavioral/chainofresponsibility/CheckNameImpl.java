package behavioral.chainofresponsibility;

public class CheckNameImpl extends AbsInfoCheck {


    public CheckNameImpl(){
        this.type = AbsInfoCheck.checkName;
    }



    @Override
    void printResult() {
        System.out.println("=========" + this.type);
    }
}
