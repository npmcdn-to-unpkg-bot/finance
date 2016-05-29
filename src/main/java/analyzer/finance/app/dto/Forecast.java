package analyzer.finance.app.dto;

import java.sql.Date;

/**
 *
 * JSON-serializable DTO containing hero data
 *
 */
public class Forecast {

    private Long id;
    private Company company;
    private Date date;
    private Double realRate;
    private Double forecastRate;

    public Forecast(Long id, Company company, Date date) {
        this.id = id;
        this.company = company;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
}
