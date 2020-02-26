package structural.adapter;

public class NewPlayerImpl implements NewPlayer {
    @Override
    public void play(String type) {
        if("map4".equals(type)){
            System.out.println("newPlayer====map4");
        }else if("vlc".equals(type)){
            System.out.println("newPlayer====vlc");
        }

    }
}
