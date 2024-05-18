package za.ac.tut.group.lms.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import za.ac.tut.group.lms.models.Document;
import za.ac.tut.group.lms.repository.DocumentRepository;

@Service
public class DocumentService {

    @Autowired
    private DocumentRepository docRepository;

    public List<Document> getAllDocuments() {
        return docRepository.findAll();
    }

    public void addDocument(Document doc){
        docRepository.save(doc);
    }
}
