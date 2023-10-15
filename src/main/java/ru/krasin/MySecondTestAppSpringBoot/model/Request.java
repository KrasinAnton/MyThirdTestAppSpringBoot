package ru.krasin.MySecondTestAppSpringBoot.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.krasin.MySecondTestAppSpringBoot.service.Systems;

import javax.validation.constraints.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Request {

    @NotBlank(message = "Уникальный идентификатор сообщения обязателен")
    @Size(max = 32, message = "Уникальный идентификатор сообщения должен содержать не более 32 символов")
    private String uid;  // Уникальный идентификатор сообщения

    @NotBlank(message = "Уникальный идентификатор операции обязателен")
    @Size(max = 32, message = "Уникальный идентификатор операции должен содержать не более 32 символов")
    private String operationUid;  // Уникальный идентификатор операции

    private String systemName;  // Изменили тип на перечисление Systems

    @NotBlank(message = "Время создания сообщения обязательно")
    private String systemTime;  // Время создания сообщения

    private String source;
    private Positions position;
    private Double salary;
    private Double bonus;
    private Integer workDays;

    @Min(value = 1, message = "Уникальный идентификатор коммуникации должен быть не менее 1")
    @Max(value = 100000, message = "Уникальный идентификатор коммуникации должен быть не более 100000")
    private int communicationId;  // Уникальный идентификатор коммуникации

    private int templateId;
    private int productCode;
    private int smsCode;

    @Override
    public String toString() {
        return "{" +
                "uid='" + uid + '\'' +
                ", operationUid='" + operationUid + '\'' +
                ", systemName='" + systemName + '\'' +  // Изменили тип на перечисление Systems
                ", systemTime='" + systemTime + '\'' +
                ", source='" + source + '\'' +
                ", communicationId=" + communicationId +
                ", templateId=" + templateId +
                ", productCode=" + productCode +
                ", smsCode=" + smsCode +
                '}';
    }
}
