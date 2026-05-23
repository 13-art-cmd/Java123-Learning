public class NameTester {
    public static void checkName(String name) throws InvalidNameException{
        if(name.length() < 3){
            throw new InvalidNameException("the name is too short");
        }
        System.out.println("Name is valid: " + name);
    }
    public static void main(String[] args){
            try {
                checkName("om");
            } catch (InvalidNameException e) {
                System.out.println("Caught an error: " + e.getMessage());
            }
        }
}
