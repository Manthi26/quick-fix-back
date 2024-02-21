package com.manthi.QuickFix.controller;

import com.manthi.QuickFix.model.ClientJob;
import com.manthi.QuickFix.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@CrossOrigin(origins = "*")
@RequestMapping("/common")
public class CommonController {

    private CommonService commonService;

    @Autowired
    public CommonController(CommonService commonService) {
        this.commonService = commonService;
    }

    @GetMapping("/getAllJobs")
    public ResponseEntity<?> getAllClientJobs() {
        List<ClientJob> data = commonService.getAllClientJobs();
        return new ResponseEntity<>(data, HttpStatus.OK);
    }

    @PostMapping("/saveJob")
    public ResponseEntity<?> saveClientJob(@RequestBody ClientJob clientJob) {
        commonService.saveClientJob(clientJob);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("/updateJob")
    public ResponseEntity<?> updateClientJob(@RequestBody ClientJob clientJob) {
        commonService.updateClientJob(clientJob);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("/deleteJob")
    public ResponseEntity<?> deleteClientJob(@RequestBody ClientJob clientJob) {
        commonService.deleteClientJob(clientJob);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
