package level2;

//----------------定义人类  实现Comparable接口
public class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    //--------------------覆写compareTo方法
    public int compareTo(Person person) {
        if (this.age > person.age) {
            return 1;
        } else if (this.age < person.age) {
            return -1;
        } else {
            return 0;
        }
    }

    public String toString() {
        return "姓名:" + this.name + "年龄：" + this.age + "";
    }
}
