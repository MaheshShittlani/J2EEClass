package business;

public class User {
    private String firstname;
    private String lastname;
    private String email;

    public User(String firstname, String lastname, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
    }

    public User() {
        this("NA", "NA", "NA");
    }

    public String getFirstname() {
        return firstname.toUpperCase();
    }

    public String getLastname() {
        return lastname.toUpperCase();
    }
    
    public String getEmail() {
        return email.toUpperCase();
    }
}
