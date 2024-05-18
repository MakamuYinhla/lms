package za.ac.tut.group.lms.models;

import jakarta.persistence.*;

@Entity
@Table(name = "videos")
public class Video {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "videoid")
    private Long videoID;

    @Column(name = "video_name")
    private String videoName;

    @Column(name = "video_title")
    private String videoTitle;

    @Lob
    @Column(name = "video_data", nullable = false)
    private byte[] videoData;

    @Column(name = "video_duration")
    private Double videoDuration;

    @Column(name = "video_description")
    private String videoDescription;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "lesson_id")
    private Lesson lesson;

    public Video() {}

    public Video(Long videoID, Lesson lesson, String videoName, String videoTitle, byte[] videoData, Double videoDuration, String videoDescription) {
        this.videoID = videoID;
        this.lesson = lesson;
        this.videoName = videoName;
        this.videoTitle = videoTitle;
        this.videoData = videoData;
        this.videoDuration = videoDuration;
        this.videoDescription = videoDescription;
    }

    // Getters and setters

    public Long getVideoID() {
        return videoID;
    }

    public void setVideoID(Long videoID) {
        this.videoID = videoID;
    }

    public Lesson getLesson() {
        return lesson;
    }

    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }

    public String getVideoTitle() {
        return videoTitle;
    }

    public void setVideoTitle(String videoTitle) {
        this.videoTitle = videoTitle;
    }

    public byte[] getVideoData() {
        return videoData;
    }

    public void setVideoData(byte[] videoData) {
        this.videoData = videoData;
    }

    public Double getVideoDuration() {
        return videoDuration;
    }

    public void setVideoDuration(Double videoDuration) {
        this.videoDuration = videoDuration;
    }

    public String getVideoDescription() {
        return videoDescription;
    }

    public void setVideoDescription(String videoDescription) {
        this.videoDescription = videoDescription;
    }
}
