
package LogicaNegocio;

/**
 *
 * @author elhongo
 */
public class User {
    
    private String Name;
    private String LastName;
    private int Age;
    
    public User(String name, String lastName, int age){
        this.Name = name;
        this.LastName = lastName;
        this.Age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        this.LastName = lastName;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        this.Age = age;
    }

    @Override
    public String toString() {
        return "User{" + "Name=" + Name + ", LastName=" + LastName + ", Age=" + Age + '}';
    }
    
    
}
