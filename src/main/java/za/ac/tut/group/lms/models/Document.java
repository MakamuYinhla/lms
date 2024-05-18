package za.ac.tut.group.lms.models;


import javax.swing.text.AbstractDocument.Content;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name = "documents")
public class Document {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long documentID;

    @Column(nullable = true)
    private Integer contentID;

    @Column(nullable = false, length = 255)
    private String documentTitle;

    @Lob
    @Column(nullable = false)
    private byte[] documentContent;

    @Column
    private Integer pages;

    @Column
    private String description;

    
    // @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    // @JoinColumn(name = "content_id", referencedColumnName = "contentID")
    // private Content content;

    // Constructor with parameters
    public Document(Long documentID, Integer contentID, String documentTitle, byte[] documentContent, Integer pages, String description, Content content) {
        this.documentID = documentID;
        this.contentID = contentID;
        this.documentTitle = documentTitle;
        this.documentContent = documentContent;
        this.pages = pages;
        this.description = description;
        // this.content = content;
    }

    // Default constructor
    public Document() {}

    // Getters and setters
    public Long getDocumentID() {
        return documentID;
    }

    public void setDocumentID(Long documentID) {
        this.documentID = documentID;
    }

    public Integer getContentID() {
        return contentID;
    }

    public void setContentID(Integer contentID) {
        this.contentID = contentID;
    }

    public String getDocumentTitle() {
        return documentTitle;
    }

    public void setDocumentTitle(String documentTitle) {
        this.documentTitle = documentTitle;
    }

    public byte[] getDocumentContent() {
        return documentContent;
    }

    public void setDocumentContent(byte[] documentContent) {
        this.documentContent = documentContent;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // public Content getContent() {
    //     return content;
    // }

    // public void setContent(Content content) {
    //     this.content = content;
    // }
}
