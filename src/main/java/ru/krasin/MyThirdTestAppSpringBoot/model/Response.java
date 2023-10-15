package ru.krasin.MyThirdTestAppSpringBoot.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Response {
    private String uid;  // Уникальный идентификатор сообщения
    private String operationUid;  // Уникальный идентификатор операции
    private String systemTime;  // Время создания сообщения
    private Codes code;  // Код
    private Double annualBonus;  // Годовой бонус
    private ErrorCodes errorCode;  // Код ошибки
    private ErrorMessages errorMessage;  // Сообщение об ошибке
}
