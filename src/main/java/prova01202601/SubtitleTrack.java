package prova01202601;

public class SubtitleTrack {
    private String streamName;
    private String idioma;

    private SubtitleTrack(String streamName, String idioma){
        this.idioma = idioma;
        this.streamName = streamName;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getStreamName() {
        return streamName;
    }

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }
}
