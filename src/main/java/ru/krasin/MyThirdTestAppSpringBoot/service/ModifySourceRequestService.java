package ru.krasin.MyThirdTestAppSpringBoot.service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;
import ru.krasin.MyThirdTestAppSpringBoot.model.Request;

@Service
public class ModifySourceRequestService implements ModifyRequestService {
    private static final Logger logger = LoggerFactory.getLogger(ModifySourceRequestService.class);

    @Override
    public void modify(Request request) {
        long startTime = System.currentTimeMillis(); // Засекаем время начала

        request.setSource("Новое значение для source");

        new HttpEntity<>(request);

        // Отправляем запрос

        long endTime = System.currentTimeMillis(); // Засекаем время окончания
        long executionTime = endTime - startTime; // Вычисляем время выполнения в миллисекундах
        logger.info("Time elapsed in Service 2: {} ms", executionTime); // Выводим время в лог
    }
}


