import java.util.Iterator;
import java.util.List;

class Family_memberIterator implements Iterator<Family_member>{

    private int id; 
    private List<Family_member> family_memberList;

    public Family_memberIterator(List<Family_member>family_memberList){
        this.family_memberList = family_memberList;
    }

    @Override
    public boolean hasNext() {
        return id < family_memberList.size() ;
    }

    @Override
    public Family_member next() {
        return family_memberList.get(id++);
    }

   }

   