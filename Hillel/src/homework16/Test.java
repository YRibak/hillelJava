package homework16;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by yura on 20.08.15.
 */

@XmlRootElement
public class Test {

    private String name;
    private int age;
    private int id;

    public Test() {
    }

    public Test(String name) {
        this.name = name;
    }

    public Test(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    @XmlElement
    public void setId(int id) {
        this.id = id;
    }

    @XmlElement
    public String getName() {
        return name;
    }

    @XmlElement
    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Test{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }

    public void setAge(int age) {
        this.age = age;
    }
}
