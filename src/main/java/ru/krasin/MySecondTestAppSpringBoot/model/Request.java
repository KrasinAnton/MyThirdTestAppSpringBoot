package ru.krasin.MySecondTestAppSpringBoot.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Request {
    @NotBlank(message = "Поле uid обязательно для заполнения")
    @Size(max = 32, message = "Максимальная длина поля uid - 32 символа")
    private String uid;

    @NotBlank(message = "Поле operationUid обязательно для заполнения")
    @Size(max = 32, message = "Максимальная длина поля operationUid - 32 символа")
    private String operationUid;

    private String systemName;

    @NotBlank(message = "Время создания сообщения обязательно")
    private String systemTime;

    private String source;

    @NotNull(message = "Поле communicationId обязательно для заполнения")
    @Min(value = 1, message = "Значение поля communicationId должно быть не менее 1")
    @Max(value = 100000, message = "Значение поля communicationId должно быть не более 100000")
    private int communicationId;

    private int templateId;
    private int productCode;
    private int smsCode;

}
