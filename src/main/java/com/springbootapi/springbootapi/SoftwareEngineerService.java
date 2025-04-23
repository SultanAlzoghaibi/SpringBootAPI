package com.springbootapi.springbootapi;
import org.springframework.stereotype.Service;
import java.util.List;

@Service // make this class availible as a "bean" XD
public class SoftwareEngineerService {
    private final SoftwareEngineerRepo softwareEngineerRepo;
    private final AIService aiService;

    public SoftwareEngineerService(SoftwareEngineerRepo softwareEngineerRepo, AIService aiService) {
        this.softwareEngineerRepo = softwareEngineerRepo;
        this.aiService = aiService;
    }

    // bad security , client get entire table
    public List<SoftwareEngineer> getAllSoftwareEngineers() {
        return softwareEngineerRepo.findAll();
    }


    public void insertSoftwareEngineer(SoftwareEngineer softwareEngineer) {
        // ADD VERIFICATION VER IDEALLY
        System.out.println("WE INTERINT");
        String prompt = """
                Based on the program techstack that %s by %s tell me how cracked he is?"""
                .formatted(softwareEngineer.getTeckStack(), softwareEngineer.getName());
        try {
            String chatResponse = aiService.sendMessage(prompt);
        } catch (Exception e) {
            System.out.println("ai error ur bokre");
        }
        String chatResponse = "Ai rview, but u have no money";
        System.out.println("chatResponse: " + chatResponse);
        softwareEngineer.setAiReview(chatResponse);
        softwareEngineerRepo.save(softwareEngineer);
    }

    public SoftwareEngineer getSoftwareEngineerById(Integer id) {
        return softwareEngineerRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Engineer not found"));
    }

    public void deleteSoftwareEngineerById(Integer id) {
        softwareEngineerRepo.deleteById(id);
    }

    public void updateSoftwareEngineerById(Integer id, SoftwareEngineer updatedEngineer) {
        SoftwareEngineer existing = softwareEngineerRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Engineer not found"));

        existing.setName(updatedEngineer.getName());
        existing.setTeckStack(updatedEngineer.getTeckStack());

        softwareEngineerRepo.save(existing);
    }
}
