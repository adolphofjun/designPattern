package structural.adapter;

/**
 * 适配器，将新的播放器适配到老播放器实现类中,使老播放器也能实现新播放器功能
 * 意图：将一个类的接口转换成客户希望的另外一个接口。适配器模式使得原本由于接口不兼容而不能一起工作的那些类可以一起工作。
 * 主要解决：主要解决在软件系统中，常常要将一些"现存的对象"放到新的环境中，而新环境要求的接口是现对象不能满足的。
 * 如何解决：继承或依赖（推荐）。
 * 关键代码：适配器继承或依赖已有的对象，实现想要的目标接口。
 */
public class PlayerAdapter  implements OldPlayer{

    @Override
    public void play(String type) {
       new NewPlayerImpl().play(type);
    }
}
