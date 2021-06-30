import java.util.Scanner;

public class PetWeeding {
    public static void main(String[] args) {
        int num = 0;
        int num_ope = 0;
        int pet_select;
        int pet_operating;
        Scanner input = new Scanner(System.in);

        Cat cat1 = new Cat();
        Dog dog1 = new Dog();
        Pet[] pets = new Pet[2];
        pets[0] = cat1;
        pets[1] = dog1;

        while (num == 0) {
            System.out.println("请选择你的宠物：\t" + "1 cat\t" + "2 dog\t" + "3 退出");
            num_ope = 0;
            pet_select = input.nextInt();

            if (pet_select == 1 || pet_select == 2) {
                while (num_ope == 0) {
                    System.out.println("选择你要执行的操作：");
                    System.out.println("1 查看宠物信息");
                    System.out.println("2 增加亲密度");
                    System.out.println("3 送去医院");
                    System.out.println("4 设置性别或品种");
                    System.out.println("5 重新选择宠物");
                    pet_operating = input.nextInt();
                    switch (pet_operating) {
                        case 1:
                            if (pet_select == 1 && pets[pet_select - 1] instanceof Cat) {
                                pets[pet_select - 1].show();
                            } else {
                                if (pets[pet_select - 1] instanceof Dog) {
                                    pets[pet_select - 1].show();
                                }
                            }
                            break;
                        case 2:
                            if (pet_select == 1 && pets[pet_select - 1] instanceof Cat) {
                                pets[pet_select - 1].setIntimacy();
                            } else {
                                if (pets[pet_select - 1] instanceof Dog) {
                                    pets[pet_select - 1].setIntimacy();
                                }
                            }
                            break;
                        case 3:
                            if (pet_select == 1 && pets[pet_select - 1] instanceof Cat) {
                                pets[pet_select - 1].setHealth();
                            } else {
                                if (pets[pet_select - 1] instanceof Dog) {
                                    pets[pet_select - 1].setHealth();
                                }
                            }
                            break;
                        case 4:
                            if (pet_select == 1 && pets[pet_select - 1] instanceof Cat) {
                                String nam;
                                System.out.println("输入你的宠物性别");
                                nam = input.next();
                                pets[pet_select - 1].setAttributes(nam);
                            } else {
                                if (pets[pet_select - 1] instanceof Dog) {
                                    String nam;
                                    System.out.println("输入你的宠物品种");
                                    nam = input.next();
                                    pets[pet_select - 1].setAttributes(nam);
                                }
                            }
                            break;
                        case 5:
                            num_ope = pet_operating;
                            break;
                    }
                }
            } else {
                num = pet_select;
            }
        }
    }
}

class Pet {
    String name;
    int healthvalue;
    int intimacy;

    Pet() {
        name = "NULL";
        healthvalue = 100;
        intimacy = 0;
    }

    Pet(String nam) {
        name = nam;
        healthvalue = 100;
        intimacy = 0;
    }

    void show() {
        System.out.println("宠物的名字是:" + name + "\t 健康值为:" + healthvalue + "\t亲密度为:" + intimacy);
    }

    void setHealth() {
        healthvalue = 100;
        System.out.println("你的宠物已经恢复了！！！");
    }

    void setAttributes(String nam) {

    }

    void setIntimacy() {

    }
}

class Cat extends Pet {
    String sex;

    Cat() {
        super("cat");
        this.sex = "null";
    }

    void setAttributes(String fale) {
        sex = fale;
    }

    void show() {
        System.out.println("宠物的名字是:" + name + "\t 健康值为:" + healthvalue + "\t亲密度为:" + intimacy + "\t性别为:" + sex);
    }

    void setIntimacy() {
        if (intimacy < 91) {
            System.out.println("抚摸成功，亲密度+10");
            intimacy += 10;
        } else {
            System.out.println("抚摸成功，亲密度达到100");
        }
    }
}

class Dog extends Pet {
    String variety;

    Dog() {
        super("Dog");
        this.variety = "null";
    }

    void setAttributes(String fale) {
        variety = fale;
    }

    void show() {
        System.out.println("宠物的名字是:" + name + "\t 健康值为:" + healthvalue + "\t亲密度为:" + intimacy + "\t品种为:" + variety);
    }

    void setIntimacy() {
        if (intimacy < 91) {
            System.out.println("成功完成一次飞盘游戏，亲密度+10");
            intimacy += 10;
        } else {
            System.out.println("成功完成一次飞盘游戏，亲密度达到100");
        }
    }
}