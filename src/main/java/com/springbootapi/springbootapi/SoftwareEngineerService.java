package com.springbootapi.springbootapi;
import org.springframework.stereotype.Service;
import java.util.List;

@Service // make this class availible as a "bean" XD
public class SoftwareEngineerService {
    private final SoftwareEngineerRepo softwareEngineerRepo;

    public SoftwareEngineerService( SoftwareEngineerRepo softwareEngineerRepo) {
        this.softwareEngineerRepo = softwareEngineerRepo;
    }
    // bad security , client get entire table
    public List<SoftwareEngineer> getAllSoftwareEngineers() {
        return softwareEngineerRepo.findAll();
    }


    public void insertSoftwareEngineer(SoftwareEngineer softwareEngineer) {
        // ADD VERIFICATION
        softwareEngineerRepo.save(softwareEngineer);
    }
}
