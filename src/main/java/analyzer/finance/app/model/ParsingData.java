package analyzer.finance.app.model;

import javax.persistence.*;

/**
 * Created by Denny on 5/29/2016.
 */
@Entity
@Table(name = "PARSING_DATA")
public class ParsingData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parsingId")
    private Parsing parsing;

    @Column(name = "closeRate")
    private Double closeRate;


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
        if (!(obj instanceof ParsingData))
            return false;
        ParsingData other = (ParsingData) obj;
        if (id != other.id)
            return false;
        /*if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;*/
        return true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Parsing getParsing() {
        return parsing;
    }

    public void setParsing(Parsing parsing) {
        this.parsing = parsing;
    }

    public Double getCloseRate() {
        return closeRate;
    }

    public void setCloseRate(Double closeRate) {
        this.closeRate = closeRate;
    }

    @Override
    public String toString() {
        return "ParsingData [id=" + id + ", name=" + "---" + "]";
    }
}
