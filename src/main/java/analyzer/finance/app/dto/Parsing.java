package analyzer.finance.app.dto;

import analyzer.finance.app.model.ParsingData;

import java.sql.Date;
import java.util.List;

/**
 *
 * JSON-serializable DTO containing hero data
 *
 */
public class Parsing {

    private Long id;
    private Company company;
    private Date date;
    private String source;
    private List<ParsingData> parsingDataList;

    public Parsing(Long id, Company company, Date date, String source) {
        this.id = id;
        this.company = company;
        this.date = date;
        this.source = source;
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

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public List<ParsingData> getParsingDataList() {
        return parsingDataList;
    }

    public void setParsingDataList(List<ParsingData> parsingDataList) {
        this.parsingDataList = parsingDataList;
    }
}
