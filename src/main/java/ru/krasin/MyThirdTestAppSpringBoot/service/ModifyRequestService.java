package ru.krasin.MyThirdTestAppSpringBoot.service;

import org.springframework.stereotype.Service;
import ru.krasin.MyThirdTestAppSpringBoot.model.Request;

@Service
public interface ModifyRequestService {
    void modify(Request request);

}
