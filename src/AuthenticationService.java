import java.util.ArrayList;

public class AuthenticationService implements IAuthenticationService {
    private ArrayList<User> users;

    // TODO Now: Add a constructor to initialize the users list with the default user

    public AuthenticationService(ArrayList<User> users) {
        this.users = users;
        this.users.add(new User("admin", "password"));
    }

    // TODO Now: Implement the signUp method to add a new user to the list if the username is not taken and return the user; returns null otherwise

    // TODO Now: Implement the logIn method to return the user if the username and password match, and null otherwise
}