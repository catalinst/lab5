package isp.lab5.exercise3;

public class BlackAndWhiteVideo implements Playable {
    private String fileName;

    public BlackAndWhiteVideo(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void play() {
        System.out.println("Play black and white video " + fileName);
    }

    private void loadFromDisk(String fileName){
        System.out.println("Loading video..." + fileName);
    }
}
