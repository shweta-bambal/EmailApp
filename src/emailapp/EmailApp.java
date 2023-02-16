package emailapp;

public class EmailApp {

    public static void main(String[] args){
        Email em1 = new Email("shweta", "bambal");
        em1.setAlternateEmail("sb@gmail.com");
        System.out.println("Alternate email : " + em1.getAlternateEmail());
    }

}
