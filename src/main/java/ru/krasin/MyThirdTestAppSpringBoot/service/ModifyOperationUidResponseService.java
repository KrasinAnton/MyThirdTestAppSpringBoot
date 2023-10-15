package ru.krasin.MyThirdTestAppSpringBoot.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import ru.krasin.MyThirdTestAppSpringBoot.model.Response;

import java.util.UUID;

@Service
@Qualifier("ModifyOperationUidResponseService")
public class ModifyOperationUidResponseService implements ModifyResponseService {
    @Override
    public void modify(Response response) {
        UUID uuid = UUID.randomUUID();

        response.setOperationUid(uuid.toString());

    }

}
