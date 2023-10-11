package ru.krasin.MySecondTestAppSpringBoot.service;

import org.springframework.stereotype.Service;
import ru.krasin.MySecondTestAppSpringBoot.model.Response;

@Service
public interface ModifyResponseService {
    Response modify(Response response);
}
