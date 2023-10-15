package ru.krasin.MySecondTestAppSpringBoot.service;

import org.springframework.stereotype.Service;
import ru.krasin.MySecondTestAppSpringBoot.model.Request;

@Service
public interface ModifyRequestService {
    void modify(Request request);

}
