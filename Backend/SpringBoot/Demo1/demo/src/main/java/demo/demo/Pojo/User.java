package demo.demo.Pojo;

public class User {

    private Integer id;
    private String username;
    private String password;
    private String email;

    public Integer getId(){
        return id;
    }

    public void setId (Integer id){
        this.id = id;
    }

    public String getName(){
        return username;
    }

    public void setName (String username){
        this.username = username;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword (String password){
        this.password = password;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail (String email){
        this.email = email;
    }
}