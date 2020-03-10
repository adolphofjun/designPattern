package behavioral.chainofresponsibility;

public class CheckAgeImpl extends AbsInfoCheck {


    public CheckAgeImpl(){
        this.type = AbsInfoCheck.checkAge;
    }



    @Override
    void printResult() {
        System.out.println("=========" + this.type);
    }
}
