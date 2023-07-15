package demo.demo.Pojo;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
public class UserMongo {

    private String id;
    private String username;
    private String password;
    private String email;

    public String getId(){
        return id;
    }

    public void setId (String id){
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