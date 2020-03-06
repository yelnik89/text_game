package TextQest.TextQest.Constructor.model;


import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
public class Locations {

    @Id
    private Integer id;
    private String name;
    private String teh_name;
    private String action;
    private String visibility_params;
    private String change_param;
    private String conditions;

    @ManyToOne(fetch = FetchType.LAZY)                         //объявляется тип связи, fetch - метод подгрузки (установлен ленивый)
    @JoinColumn(referencedColumnName = "id", nullable = false) //указывает, на какое поле ссылается зависимость
    @JsonBackReference
    private Games games;


    public Locations() {}

    public Games getGames() {
        return games;
    }

    public void setGames(Games game) {
        this.games = game;
    }

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

    public String getTeh_name() {
        return teh_name;
    }

    public void setTeh_name(String teh_name) {
        this.teh_name = teh_name;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getVisibility_params() {
        return visibility_params;
    }

    public void setVisibility_params(String visibility_params) {
        this.visibility_params = visibility_params;
    }

    public String getChange_param() {
        return change_param;
    }

    public void setChange_param(String change_param) {
        this.change_param = change_param;
    }

    public String getConditions() {
        return conditions;
    }

    public void setConditions(String conditions) {
        this.conditions = conditions;
    }
}
