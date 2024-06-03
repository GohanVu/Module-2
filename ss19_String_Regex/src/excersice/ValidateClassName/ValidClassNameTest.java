package excersice.ValidateClassName;

public class ValidClassNameTest {
    private static ValidateClassName validateClassName;
    public static final String [] validClassName = new String[]{"C0223G","A0323K"};
    public static final String [] invalidClassName = new String[] {"M0318G","P0323A"};

    public static void main(String[] args) {
        validateClassName = new ValidateClassName();
        for (String className : validClassName){
            boolean isValid = validateClassName.isValidClassName(className);
            System.out.println("Class name is "+className+ " is valid: "+isValid);
        }
        for (String className : invalidClassName){
            boolean isValid = validateClassName.isValidClassName(className);
            System.out.println("Class name is "+className+" is valid: "+isValid);
        }
    }
}
