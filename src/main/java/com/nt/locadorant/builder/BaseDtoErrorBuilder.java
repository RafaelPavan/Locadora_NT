package com.nt.locadorant.builder;

import br.com.ntconsult.locadora.base.BaseDto;
import br.com.ntconsult.locadora.base.ErrorDto;
import br.com.ntconsult.locadora.base.StatusDto;
import org.springframework.http.HttpStatus;

import java.util.ArrayList;
import java.util.List;

public class BaseDtoErrorBuilder {

    private BaseDto<Void> result;

    public BaseDtoErrorBuilder(HttpStatus status) {
        StatusDto statusDto = new StatusDto(status.value(), status.name());
        result = new BaseDto<Void>(null, new ArrayList<>(), statusDto);
    }

    public void addError(String field, String message) {
        ErrorDto errorDto = new ErrorDto(field, message);
        result.addError(errorDto);
    }

    public void addErrors(List<ErrorDto> errors) {
        result.setErrors(errors);
    }

    public BaseDto get() {
        return result;
    }


}
