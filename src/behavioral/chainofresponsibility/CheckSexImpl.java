package behavioral.chainofresponsibility;

public class CheckSexImpl extends AbsInfoCheck {


    public CheckSexImpl(){
        this.type = AbsInfoCheck.checkSex;
    }



    @Override
    void printResult() {
        System.out.println("=========" + this.type);
    }
}
