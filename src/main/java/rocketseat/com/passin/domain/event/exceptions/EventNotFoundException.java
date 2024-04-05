package rocketseat.com.passin.domain.event.exceptions;

public class EventNotFoundException extends RuntimeException{

    public EventNotFoundException(String mensagem){
        super(mensagem);
    }
}
