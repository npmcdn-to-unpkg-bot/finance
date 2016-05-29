package analyzer.finance.app.dto;

import analyzer.finance.app.model.Parsing;

import java.util.List;

/**
 *
 * JSON-serializable DTO containing hero data
 *
 */
public class Company {

    private Long id;
    private String name;
    private String description;
    private List<Parsing> parsingList;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Parsing> getParsingList() {
        return parsingList;
    }

    public void setParsingList(List<Parsing> parsingList) {
        this.parsingList = parsingList;
    }

    public Company(Long id, String name, String description) {

        this.id = id;
        this.name = name;
        this.description = description;
    }
}
