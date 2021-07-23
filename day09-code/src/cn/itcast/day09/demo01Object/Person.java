package cn.itcast.day09.demo01Object;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /*
        ֱ�Ӵ�ӡ����ĵ�ֵַû������,��Ҫ��дObject���е�toString����
        ��ӡ���������(name,age)
     */
    /*@Override
    public String toString() {
       //return "abc";
       return "Person{name="+name+" ,age="+age+"}";
    }*/
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /*
        Object���equals����,Ĭ�ϱȽϵ�����������ĵ�ֵַ,û������
        ��������Ҫ��дequals����,�Ƚ��������������(name,age)
        ����:
            ������һ����̬
            ��̬�ı׶�:�޷�ʹ���������е�����(���Ժͷ���)
            Object obj = p2 = new Person("��������",19);
            ���:����ʹ������ת��(ǿת)��obj����ת��ΪPerson
     */
    /*@Override
    public boolean equals(Object obj) {
        //����һ���ж�,���ݵĲ���obj�����this����,ֱ�ӷ���true,��߳����Ч��
        if(obj==this){
            return true;
        }

        //����һ���ж�,���ݵĲ���obj�����null,ֱ�ӷ���false,��߳����Ч��
        if(obj==null){
            return false;
        }

        //����һ���ж�,��ֹ����ת��һ��ClassCastException
        if(obj instanceof Person){
            //ʹ������ת��,��objת��ΪPerson����
            Person p = (Person)obj;
            //�Ƚ��������������,һ��������this(p1),һ��������p(obj->p2)
            boolean b = this.name.equals(p.name) && this.age==p.age;
            return b;
        }
        //����Person����ֱ�ӷ���false
        return false;
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
