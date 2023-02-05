import java.util.ArrayList;
import java.util.List;

public class Team {
    private Long id;
    private String name;
    private List<Member> members = new ArrayList<>();

    public Team(Long id, String name, List<Member> members) {
        this.id = id;
        this.name = name;
        this.members = members;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }
}
