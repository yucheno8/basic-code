package cn.itcast.day11.demo07;

/**
 * @author yucheno8
 * @date 2021/7/28/028
 **/
public class Hero {

    private String name; // Ӣ�۵�����
    private Skill skill; // Ӣ�۵ķ�������

    public Hero() {
    }

    public Hero(String name, Skill skill) {
        this.name = name;
        this.skill = skill;
    }

    public void attack() {
        System.out.println("�ҽ�" + name + "����ʼʩ�ż��ܣ�");
        skill.use(); // ���ýӿ��еĳ��󷽷�
        System.out.println("ʩ�ż������");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }
}
