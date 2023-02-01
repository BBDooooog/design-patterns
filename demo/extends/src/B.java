public class B extends A{
    private int age;

    public void sayBye(){
        System.out.println("bye B");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void say() {
        System.out.println("say");
    }

    @Override
    public String toString() {
        return "B{" +
                "age=" + age +
                "name=" + super.getName() +
                '}';
    }
}
