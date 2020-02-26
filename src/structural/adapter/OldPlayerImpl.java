package structural.adapter;

public class OldPlayerImpl implements OldPlayer {
    @Override
    public void play(String type) {
        if("map4".equals(type) || "vlc".equals(type)){
            new PlayerAdapter().play(type);
        }else{
            System.out.println("oldPlayer====map3");
        }

    }
}
