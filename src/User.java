public class User {

    private String username;
    private String password;
    private boolean isAdmin;
    private boolean isSuperAdmin;           // super-admin manages everything (even other admins)
    private int maxAdmins = 3;              // default maximum admins
    private static int adminInstances;      // can be changed by super-admin
    private static int superAdminInstances; // ONLY one


    public User(){
        this.isAdmin = false;
        this.isSuperAdmin = false;
    }

    public User(String username, String password, boolean isAdmin, boolean isSuperAdmin){
        this.username = username;
        this.password = password;
        if(adminInstances < maxAdmins && isAdmin){
            this.isAdmin = isAdmin;
            this.adminInstances++;
        }
        else{
            this.isAdmin = false;
        }
        if(superAdminInstances < 1 && isSuperAdmin && adminInstances < maxAdmins && isAdmin){
            this.isSuperAdmin = isSuperAdmin;
            this.superAdminInstances++;
        }
        else{
            this.isSuperAdmin = false;
        }
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", isAdmin=" + isAdmin +
                ", isSuperAdmin=" + isSuperAdmin +
                '}';
    }
}
