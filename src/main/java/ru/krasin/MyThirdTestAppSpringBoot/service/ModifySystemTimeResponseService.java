package ru.krasin.MyThirdTestAppSpringBoot.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import ru.krasin.MyThirdTestAppSpringBoot.model.Response;
import ru.krasin.MyThirdTestAppSpringBoot.util.DateTimeUtil;

import java.util.Date;

@Service
@Qualifier("ModifySystemTimeResponseService")
public class ModifySystemTimeResponseService
        implements ModifyResponseService {
    @Override
    public void modify(Response response) {
        response.setSystemTime(DateTimeUtil.getCustomFormat()
                .format(new Date()));

    }
}
