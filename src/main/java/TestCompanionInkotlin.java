import companion.People;

/**
 * @Description:
 * @Author : fireinrain
 * @Site : https://github.com/fireinrain
 * @File : TestCompanionInkotlin
 * @Software: IntelliJ IDEA
 * @Time : 2022/7/27 12:51 PM
 */

public class TestCompanionInkotlin {
    public static void main(String[] args) {
        People people = new People();
        System.out.println(people.getName());

        System.out.println(People.gender);
        People.printInfo();

    }
}
