package za.ac.tut.group.lms.controllers;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import za.ac.tut.group.lms.models.Document;
import za.ac.tut.group.lms.models.Video;
import za.ac.tut.group.lms.services.DocumentService;
import za.ac.tut.group.lms.services.VideoService;

@Controller
public class FileUploadController {

    @Autowired
    private DocumentService documentService;

    @Autowired
    private VideoService videoService;

    @GetMapping("/upload")
    public String showUploadForm(Model model) {
        return "upload";
    }

    @PostMapping("/upload")
    public String handleFileUpload(MultipartFile document, MultipartFile video, Model model) {
        try {
            if (!document.isEmpty()) {
                saveDocument(document);
            }
            if (!video.isEmpty()) {
                saveVideo(video);
            }
            model.addAttribute("message", "Files uploaded successfully");
        } catch (IOException e) {
            model.addAttribute("message", "Failed to upload files: " + e.getMessage());
        }
        return "upload";
    }

    private void saveDocument(MultipartFile file) throws IOException {
        Document document = new Document();
        document.setDocumentTitle(file.getOriginalFilename());
        // document.setFileType(file.getContentType());
        document.setDocumentContent(file.getBytes());
        documentService.addDocument(document);
    }

    private void saveVideo(MultipartFile file) throws IOException {
        Video video = new Video();
        video.setVideoName(file.getOriginalFilename());
        // video.setFileType(file.getContentType());
        video.setVideoData(file.getBytes());
        videoService.addVideo(video);
    }
}
