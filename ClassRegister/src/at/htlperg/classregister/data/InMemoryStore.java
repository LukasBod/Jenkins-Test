package at.htlperg.classregister.data;

import at.htlperg.classregister.model.School;
import at.htlperg.classregister.model.SchoolClass;

public class InMemoryStore {

    private static InMemoryStore INSTANCE;
    private School schoolData;

    private InMemoryStore(){
        schoolData = new School();
    };

    public static InMemoryStore getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new InMemoryStore();
        }
        return INSTANCE;
    }

    public School getSchoolData() {
        return schoolData;
    }

    public void setSchoolData(School schoolData) {
        this.schoolData = schoolData;
    }

    public SchoolClass getSchoolClass(String id){
        for(SchoolClass c: schoolData.getSchoolClass()){
            if(c.getClassID().equals(id)){
                return c;
            }
        }
        return null;
    }
}
