package level2;

import org.omg.CORBA.SystemException;
import org.omg.CORBA.UShortSeqHelper;

import java.util.*;

//-------------------------使用List集合和迭代器，并用ArrayList向上转型为其实例化对象
public class main {
    public static void main(String[] args) throws InterruptedException {
        //---------------------限制只能传入Person类对象
        List<Person> persons = new ArrayList<Person>();
        //---------------------------1.增加对象
        persons.add(new Person("张三", 18));
        persons.add(new Person("李四", 25));
        persons.add(new Person("王五", 20));
        persons.add(new Person("六六六", 19));
        persons.add(new Person("厂长777", 25));
        persons.add(new Person("八爪鱼", 28));
        //---------------------------2.迭代输出
        Iterator all = persons.iterator();
        while (all.hasNext()) {
            System.out.print(all.next() + ",");
        }
        //----------------------------3.根据索引获取集合中的对象
        System.out.println();
        System.out.println("请输入你想获取的对象(1,2,3,4,5,6)：");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println("获取第" + i + "个对象的属性,姓名：" + persons.get(i - 1).getName() + "年龄：" + persons.get(i - 1).getAge());
        System.out.println();
        Thread.sleep(500);
        System.out.println("persons未排序之前： " + persons);
        //---------------------------4.利用Collection集合类sort方法对Person类对象按age大小对Person类对象排序

        Collections.sort(persons);


        System.out.println("按照age大小排序之后： " + persons);
        //---------------------------5.删除单个元素
        try {
            System.out.println();
            System.out.println("请输入你想删除的对象(1,2,3,4,5,6)");
            int x = sc.nextInt();
            persons.remove(x - 1);
            System.out.println("删除第" + i + "个元素后的集合：" + persons);
            //---------------------------6.删除所有元素
            System.out.println();
            persons.removeAll(persons);
            System.out.println("删除所有元素后的集合：" + persons);
        } catch(Exception e){
            e.printStackTrace();
        } finally {
            System.out.println("蟹蟹学长学姐啦~");
        }
    }


}

