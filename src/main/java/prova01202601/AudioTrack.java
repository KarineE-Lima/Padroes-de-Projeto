package prova01202601;

public class AudioTrack {
    private String streamName;
    public AudioTrack(String streamName){
        this.streamName = streamName;
    }
    public String getStreamName(){
        return streamName;
    }
    public void setStreamName(String streamName){
        this.streamName = streamName;
    }
}
