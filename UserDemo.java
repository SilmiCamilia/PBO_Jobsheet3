public class UserDemo {
    public static void main(String[] args) {
    User user1 = new User("silmi", "Silmi Camilia", "silmi@gmail.com");
    
    System.out.println("Username: " + user1.getUsername());
    System.out.println("Nama: " + user1.getNama());
    System.out.println("Email: " + user1.getEmail());
    }
}