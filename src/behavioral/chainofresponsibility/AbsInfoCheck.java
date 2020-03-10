package behavioral.chainofresponsibility;

public abstract class AbsInfoCheck {

    public static String checkName = "name";
    public static String checkAge = "age";
    public static String checkSex = "sex";

    protected String type;

    AbsInfoCheck nexItem;

    public void setNexItem(AbsInfoCheck nexItem) {
        this.nexItem = nexItem;
    }

    void checkInfo(String type){
        if(this.type.equals(type)){
            printResult();
        }else{
            if(nexItem!=null){
                nexItem.checkInfo(type);
            }else{
              throw new IllegalArgumentException("处理失败！");
            }
        }
    };

    abstract void printResult();


}
