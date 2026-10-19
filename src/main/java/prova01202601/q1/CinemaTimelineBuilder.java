package prova01202601.q1;

import prova01202601.*;

import java.util.List;

public class CinemaTimelineBuilder implements TimelineBuider{
    private Timeline timeline;
    private Canva canva;
    private Renderer renderer;
    private Encoder encoder;
    private List<VideoTrack> videoTracks;
    private List<AudioTrack> audioTracks;
    private List<SubtitleTrack> subtitleTracks;
    @Override
    public TimelineBuider withCanva(Canva canva) {
        this.canva = canva;
        return null;
    }

    @Override
    public TimelineBuider withRenderer(Renderer renderer) {
        this.renderer = renderer;
        return null;
    }

    @Override
    public TimelineBuider withEncoder(Encoder encoder) {
        this.encoder = encoder;
        return null;
    }

    @Override
    public TimelineBuider addVideoTrack(VideoTrack videoTrack) {
        this.videoTracks.add(videoTrack);
        return null;
    }

    @Override
    public TimelineBuider addAudioTrack(AudioTrack audioTrack) {
        this.audioTracks.add(audioTrack);
        return null;
    }

    @Override
    public TimelineBuider addSubtitleTrack(SubtitleTrack subtitleTrack) {
        this.subtitleTracks.add(subtitleTrack);
        return null;
    }

    @Override
    public Timeline build() {
        this.renderer.intialize(this.canva);
        this.encoder.intialize(this.renderer);
        return new Timeline(canva, renderer, encoder, videoTracks, audioTracks, subtitleTracks);
    }
}
