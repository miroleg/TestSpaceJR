package com.space.exeptions400and404;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class BadRequestException extends RuntimeException {
    //  public BadRequestException(){ System.out.println(" ERROR  400 (Bad Request)"); }
}