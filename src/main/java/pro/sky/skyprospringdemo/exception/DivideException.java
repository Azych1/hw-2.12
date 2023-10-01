package pro.sky.skyprospringdemo.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Деление на ноль")
public class DivideException extends IllegalArgumentException{
    public DivideException(String s) {
        super(s);
    }
}
