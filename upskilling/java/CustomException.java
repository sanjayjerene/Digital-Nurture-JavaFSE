public class CustomException extends Exception{
    public CustomException(String InvalidAgeException){
        super(InvalidAgeException);
    }
}
class TestCustomException{
    static void validate(int age) throws CustomException{
        if(age<18){
            throw new CustomException("age is not valid ");
        }else{
            System.out.println("age is valid");
        }
    }

    public static void main(String[] args){
        try{
            validate(16);
        }catch (CustomException e){
            System.out.println("caught the exception");
            System.out.println(e.getMessage());
        }
    }
}