package prova01202601;

import java.util.ArrayList;
import java.util.List;

public class Timeline {
    private Canva canva;
    private Renderer renderer;
    private Encoder encoder;
    private List<VideoTrack> videoTracks;
    private List<AudioTrack> audioTracks;
    private List<SubtitleTrack> subtitleTracks;
    public Timeline(){
        videoTracks = new ArrayList<>();
        audioTracks = new ArrayList<>();
        subtitleTracks = new ArrayList<>();
    }

    public Timeline(Canva canva, Renderer renderer, Encoder encoder, List<VideoTrack> videoTracks, List<AudioTrack> audioTracks, List<SubtitleTrack> subtitleTracks) {
        this.audioTracks = audioTracks;
        this.canva = canva;
        this.encoder = encoder;
        this.renderer = renderer;
        this.subtitleTracks = subtitleTracks;
        this.videoTracks = videoTracks;
    }

    public void setCanva(Canva canva){
        this.canva = canva;
    }
    public void setRenderer(Renderer renderer){
        this.renderer = renderer;
    }
    public void setEncoder(Encoder encoder){
        this.encoder = encoder;
    }
    public void addVideoTrack(VideoTrack videoTrack){
        this.videoTracks.add(videoTrack);
    }
    public void addAudioTrack(AudioTrack audioTrack){
        this.audioTracks.add(audioTrack);
    }
    public void addSubtitleTrack(SubtitleTrack subtitleTrack){
        this.subtitleTracks.add(subtitleTrack);
    }
    public List<SubtitleTrack> getSubtitleTracks(){
        return subtitleTracks;
    }
}
