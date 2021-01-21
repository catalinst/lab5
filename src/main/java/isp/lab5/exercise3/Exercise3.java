package isp.lab5.exercise3;

public class Exercise3 {
    public static void main(String[] args) {
        Playable playable = new ProxyVideo(".class", "colour");
        playable.play();
        playable.play();
        playable.play();
    }
}
