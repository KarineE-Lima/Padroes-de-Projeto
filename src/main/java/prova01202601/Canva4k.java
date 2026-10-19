package prova01202601;

public class Canva4k implements Canva{
    private String resolution;
    private int width;
    private int height;
    private String colorSpace;
    private boolean hdrSuported;

    public Canva4k(){
        this.resolution = "4k UHD";
        this.width = 3840;
        this.height = 2160;
        this.colorSpace = "DCI-P3";
        this.hdrSuported = true;
    }

    @Override
    public String getColorSpace() {
        return colorSpace;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public String getResolution() {
        return resolution;
    }

    @Override
    public boolean isHDRSuported() {
        return hdrSuported;
    }
}
