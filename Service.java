public class Service {
    private int id;
    private FamilyGroup group;

    public Service(FamilyGroup group){
        this.group = group;
    }

    public void addFamily_member(String name, String age){
        group.addFamily_member(new Family_member(id++, name, age));
    }

public void sortByName(){
    group.sortByName();
}

public void sortByID(){
    group.sortByID();
}

public void sortByAge(){
    group.sortByAge();
}


    
}
