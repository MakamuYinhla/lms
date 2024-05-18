package za.ac.tut.group.lms.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "videos")
public class Video {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long videoID;

    @Column
    private String videoName;

    @Column
    private String videoTitle;

    @Lob
    @Column(nullable = false)
    private byte[] videoData;

    @Column
    private Double videoDuration;

    @Column
    private String videoDescription;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "lesson_id")
    private Lesson lessonID;

    public Video(Long videoID, Lesson lessonID, String videoName, String videoTitle, byte[] videoData, Double videoDuration, String videoDescription) {
        this.videoID = videoID;
        this.lessonID = lessonID;
        this.videoName = videoName;
        this.videoTitle = videoTitle;
        this.videoData = videoData;
        this.videoDuration = videoDuration;
        this.videoDescription = videoDescription;
    }

    public Video() {}

    // Getters and setters

    public Long getVideoID() {
        return videoID;
    }

    public void setVideoID(Long videoID) {
        this.videoID = videoID;
    }

    public Lesson getLessonID() {
        return lessonID;
    }

    public void setLessonID(Lesson lessonID) {
        this.lessonID = lessonID;
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
