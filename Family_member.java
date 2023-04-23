public class Family_member implements Comparable<Family_member>{
    private int id;
    private String name;
    private String age;

    public Family_member (int id, String name, String age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Family_member{" +
        "id =" + id +
        ", name ='" + name + '\'' +
        ", age ='" + age + '\'' +
        '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    @Override
    public int compareTo(Family_member o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }

    


}