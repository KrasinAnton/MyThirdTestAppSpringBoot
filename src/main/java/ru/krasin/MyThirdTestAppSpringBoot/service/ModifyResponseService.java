package ru.krasin.MyThirdTestAppSpringBoot.service;

import org.springframework.stereotype.Service;
import ru.krasin.MyThirdTestAppSpringBoot.model.Response;

@Service
public interface ModifyResponseService {
    void modify(Response response);
}
