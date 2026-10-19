package prova01202601.q1;

import prova01202601.*;

public interface TimelineBuider {
    TimelineBuider withCanva(Canva canva);
    TimelineBuider withRenderer(Renderer renderer);
    TimelineBuider withEncoder(Encoder encoder);
    TimelineBuider addVideoTrack(VideoTrack videoTrack);
    TimelineBuider addAudioTrack(AudioTrack audioTrack);
    TimelineBuider addSubtitleTrack(SubtitleTrack subtitleTrack);
    Timeline build();
}
