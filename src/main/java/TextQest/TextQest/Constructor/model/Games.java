package TextQest.TextQest.Constructor.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Games {

    @Id
    private Integer id;
    private String name;
    private Integer author;
    private Integer status;
    private String param;
    private String end;
    private String pramGroup;
    private String locationsGroup;

    @OneToMany(mappedBy = "games", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    @JsonManagedReference
    private Set<Locations> locations = new HashSet<>();


    public Games() {}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAuthor() {
        return author;
    }

    public void setAuthor(Integer author) {
        this.author = author;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public Set<Locations> getLocations() {
        return locations;
    }

    public void setLocations(Set<Locations> locations) {
        this.locations = locations;
    }

    public String getPramGroup() {
        return pramGroup;
    }

    public void setPramGroup(String pramGroup) {
        this.pramGroup = pramGroup;
    }

    public String getLocationsGroup() {
        return locationsGroup;
    }

    public void setLocationsGroup(String locationsGroup) {
        this.locationsGroup = locationsGroup;
    }
}
