package za.ac.tut.group.lms.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Module {
    @Id
    @GeneratedValue
    private Long moduleID;
    @Column
    private String moduelName;
    @Column
    private String moduleDescription;
    @Column
    private Integer order;

    public Module() {
    }

    public Module(Long moduleID, String moduelName, String moduleDescription, Integer order) {
        this.moduleID = moduleID;
        this.moduelName = moduelName;
        this.moduleDescription = moduleDescription;
        this.order = order;
    }

    public Long getModuleID() {
        return moduleID;
    }

    public void setModuleID(Long moduleID) {
        this.moduleID = moduleID;
    }

    public String getModuelName() {
        return moduelName;
    }

    public void setModuelName(String moduelName) {
        this.moduelName = moduelName;
    }

    public String getModuleDescription() {
        return moduleDescription;
    }

    public void setModuleDescription(String moduleDescription) {
        this.moduleDescription = moduleDescription;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "Module [moduleID=" + moduleID + ", moduelName=" + moduelName + ", moduleDescription="
                + moduleDescription
                + ", order=" + order + "]";
    }

}
