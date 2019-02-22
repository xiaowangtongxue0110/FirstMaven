package gentleman.bean;

import java.io.Serializable;

public class User implements Serializable {

    private int id;
    private String phone;
    private String name;
    private String password;
    private String  email;

    public User() {

    }

    public User(int id, String phone, String name, String password, String email) {
        this.id = id;
        this.phone = phone;
        this.name = name;
        this.password = password;
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "phone='" + phone + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
