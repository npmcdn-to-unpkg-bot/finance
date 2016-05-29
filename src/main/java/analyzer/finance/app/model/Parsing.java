package analyzer.finance.app.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

/**
 * Created by Denny on 5/29/2016.
 */
@Entity
@Table(name = "PARSING")
public class Parsing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "companyId")
    private Company company;

      @Column(name = "date", columnDefinition="DATETIME")
    @Temporal(TemporalType.DATE)
    private Date date;

    @Column(name = "source")
    private String source;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "parsingData")
    private List<ParsingData> parsingDataList;

    public List<ParsingData> getParsingDataList() {
        return parsingDataList;
    }

    public void setParsingDataList(List<ParsingData> parsingDataList) {
        this.parsingDataList = parsingDataList;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        //result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof Parsing))
            return false;
        Parsing other = (Parsing) obj;
        if (id != other.id)
            return false;
        /*if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;*/
        return true;
    }

    @Override
    public String toString() {
        return "Parsing [id=" + id + ", name=" + "---" + "]";
    }
}
