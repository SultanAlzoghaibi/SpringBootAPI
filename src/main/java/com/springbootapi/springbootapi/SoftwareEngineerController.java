package com.springbootapi.springbootapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("api/v1/software-engineers")
public class SoftwareEngineerController {

    @GetMapping
    public List<SoftwareEngineer> getAllSWEs() {
        return List.of( new SoftwareEngineer(1,
                "Sultan",
                Collections.singletonList("SpringBoot, Java")),

                new SoftwareEngineer(2, "Brian",
                Collections.singletonList("node, ts")));
    }
}
