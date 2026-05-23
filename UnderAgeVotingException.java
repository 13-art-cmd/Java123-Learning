public class UnderAgeVotingException extends Exception {
    private int ageProvided;

    public UnderAgeVotingException(String message){
        super(message);
    }
    public UnderAgeVotingException(String message, int age){
        super(message);
        this.ageProvided = age;
    }
    public UnderAgeVotingException(String message, Throwable cause){
        super(message,cause);
    }
}
