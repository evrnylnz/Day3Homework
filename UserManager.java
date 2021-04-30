
public class UserManager {

    void seeProfile(User user) {
        System.out.println("Name Surname : " + user.getFirstName() + " " + user.getLastName());
        System.out.println("User ID : " + user.getId());
        System.out.println("Birthday  : " + user.getBirthday());
        System.out.println("Phone number : " + user.getPhoneNumber());
        System.out.println("Email : " + user.getEmail());
    }

}
