package rocketseat.com.passin.domain.event.exceptions;

public class EventFullException extends RuntimeException{

    public EventFullException(String mensagem){
        super(mensagem);
    }
}
