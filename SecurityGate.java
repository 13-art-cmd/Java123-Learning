public class SecurityGate {
    public static void checkPassword(String pass) throws WeakPasswordException{
        if(pass.length() < 8){
            throw new WeakPasswordException("Password must be atleast 8 characters");
        }

        boolean hasDigit = false;
        for(char c: pass.toCharArray()){
            if(Character.isDigit(c)){
                hasDigit = true;
                break;
            }
        }
        if(hasDigit == false){
            throw new WeakPasswordException("Password must contain at least one digit");
        }
        System.out.println("You password is good to go");
    }

    public static void main(String[] args){
        try {
            checkPassword("scikit_hchs");
        } catch (WeakPasswordException e) {
            System.out.println("Please correct the followings: " + e.getMessage());
        }
    }
}
