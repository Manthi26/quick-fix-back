package com.manthi.QuickFix.service;

import com.manthi.QuickFix.model.ClientJob;
import com.manthi.QuickFix.repository.ClientJobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CommonService {

    private ClientJobRepository clientJobRepository;

    @Autowired
    public CommonService(ClientJobRepository clientJobRepository) {
        this.clientJobRepository = clientJobRepository;
    }

    public List<ClientJob> getAllClientJobs() {
        return clientJobRepository.findAll();
    }

    public void saveClientJob(ClientJob clientJob) {
        clientJob.setId(0);
        clientJob.setCreatedDate(new Date());
        clientJobRepository.save(clientJob);
    }

    public void updateClientJob(ClientJob clientJob) {
        clientJobRepository.save(clientJob);
    }

    public void deleteClientJob(ClientJob clientJob) {
        clientJobRepository.deleteById(clientJob.getId());
    }

}
