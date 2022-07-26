/**
 * @Description:
 * @Author : fireinrain
 * @Site : https://github.com/fireinrain
 * @File : JavaPeople
 * @Software: IntelliJ IDEA
 * @Time : 2022/7/26 6:35 PM
 */

public class JavaPeople {
    private String name;

    private Integer age;

    public JavaPeople(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "JavaPeople{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
