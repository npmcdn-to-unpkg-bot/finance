package analyzer.finance.app.dto;

/**
 *
 * JSON-serializable DTO containing hero data
 *
 */
public class ParsingData {

    private Long id;
    private Parsing parsing;
    private Double closeRate;

    public ParsingData(Long id, Parsing parsing, Double closeRate) {
        this.id = id;
        this.parsing = parsing;
        this.closeRate = closeRate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
}
