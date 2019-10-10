package che.ems.task.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String tName;
    private String tCode;
    private String tDetail;
    private String tOwner;
    private Date cDate;

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public String gettCode() {
        return tCode;
    }

    public void settCode(String tCode) {
        this.tCode = tCode;
    }

    public String gettDetail() {
        return tDetail;
    }

    public void settDetail(String tDetail) {
        this.tDetail = tDetail;
    }

    public String gettOwner() {
        return tOwner;
    }

    public void settOwner(String tOwner) {
        this.tOwner = tOwner;
    }

    public Date getcDate() {
        return cDate;
    }

    public void setcDate(Date cDate) {
        this.cDate = cDate;
    }
}
