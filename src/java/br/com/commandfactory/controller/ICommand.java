package br.com.commandfactory.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.coyote.BadRequestException;

public interface ICommand {
    
    public String executar(HttpServletRequest request, HttpServletResponse response) throws Exception;
    
}
