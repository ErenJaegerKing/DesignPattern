package designPatterns.bridge;

public class Mac extends OperatingSystemVersion{

    public Mac(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        videoFile.decode(fileName);
    }
}
