package ru.krasin.MySecondTestAppSpringBoot.service;

import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import ru.krasin.MySecondTestAppSpringBoot.exception.ValidationFailedException;

import java.util.Objects;

@Service
public class RequestValidationService implements ValidationService {

    @Override
    public void isValid(BindingResult bindingResult) throws ValidationFailedException {
        if (bindingResult.hasErrors()){
            throw new
                    ValidationFailedException(Objects.requireNonNull(bindingResult.getFieldError()).toString());
        }
    }
}
