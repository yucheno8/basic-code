package cn.itcast.day11.demo07;

/**
 * @author yucheno8
 * @date 2021/7/28/028
 **/
public class DemoGame {

    public static void main(String[] args) {

        Hero hero = new Hero();
        hero.setName("��ϣ"); // ����Ӣ�۵�����

        // ����Ӣ�۵ļ���
//        hero.setSkill(new SkillImpl()); // ʹ�õ��������ʵ����

        // �����Ըĳ�ʹ�������ڲ���
        /*Skill skill = new Skill() {
            @Override
            public void use() {
                System.out.println("Pia~pia~pia~");
            }
        };
        hero.setSkill(skill);*/

        // ��һ���򻯣�ͬʱʹ�������ڲ������������
        hero.setSkill(new Skill() {
            @Override
            public void use() {
                System.out.println("Biu~Pia~Biu~Pia~");
            }
        });

        hero.attack();

    }

}
