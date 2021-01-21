package isp.lab5.exercise3;

public class ProxyVideo implements Playable {
    private Playable video;
    private String fileName;
    private String type;

    public ProxyVideo(String fileName, String type) {
        this.fileName = fileName;
        this.type = type;
    }

    @Override
    public void play() {
        if (type.equals("color")) {
            if (video == null) {
                video = new ColorVideo(fileName);
            }
        } else {
            if (video == null) {
                video = new BlackAndWhiteVideo(fileName);
            }
        }

        video.play();
    }
}