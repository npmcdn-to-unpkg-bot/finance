package analyzer.finance.app.model;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by Denny on 5/29/2016.
 */
@Entity
@Table(name = "FORECAST")
public class Forecast {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "companyId")
    private Company company;

    @Column(name = "date", columnDefinition="DATETIME")
    @Temporal(TemporalType.DATE)
    private Date date;

    @Column(name = "realRate")
    private Double realRate;

    @Column(name = "forecastRate")
    private Double forecastRate;


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        //result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Double getRealRate() {
        return realRate;
    }

    public void setRealRate(Double realRate) {
        this.realRate = realRate;
    }

    public Double getForecastRate() {
        return forecastRate;
    }

    public void setForecastRate(Double forecastRate) {
        this.forecastRate = forecastRate;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof Forecast))
            return false;
        Forecast other = (Forecast) obj;
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
        return "Forecast [id=" + id + ", name=" + "---" + "]";
    }
}
