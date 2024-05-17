package za.ac.tut.group.lms.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "videos")
public class Video {
    @Id
    @GeneratedValue
    private Long videoID;
    // @OneToMany(cascade = CascadeType.ALL)
    //@Column
    //private Long lessonID;
    @Column
    private String videoName;
    @Column
    private String videoTitle;
    @Column
    private String videoUrl;
    @Column
    private Double videoDuration;
    @Column
    private String videoDescriotion;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "lesson_id")
    private Lesson lessonID;

    public Video(Long videoID, Lesson lessonID, String videoName, String videoTitle, String videoUrl,
            Double videoDuration, String videoDescriotion) {
        this.videoID = videoID;
        this.lessonID = lessonID;
        this.videoName = videoName;
        this.videoTitle = videoTitle;
        this.videoUrl = videoUrl;
        this.videoDuration = videoDuration;
        this.videoDescriotion = videoDescriotion;
    }

    public Video() {
    }

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

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public Double getVideoDuration() {
        return videoDuration;
    }

    public void setVideoDuration(Double videoDuration) {
        this.videoDuration = videoDuration;
    }

    public String getVideoDescriotion() {
        return videoDescriotion;
    }

    public void setVideoDescriotion(String videoDescriotion) {
        this.videoDescriotion = videoDescriotion;
    }

}
