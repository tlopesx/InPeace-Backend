package inpeace.userservice.exception;

public class AvatarNotFoundException extends RuntimeException{
    public AvatarNotFoundException(String message){
        super(message);
    }
}
