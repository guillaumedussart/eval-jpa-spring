package fr.diginamic.workshopeval.entities;


public class TotalItem {
    private Long total;
    private Double totalPrice;
    private Long id;
    private Double unitPrice;
    private String description;
    private String code;

    public TotalItem() {
    }

    public TotalItem(Long total, Double totalPrice, Long id, Double unitPrice, String description, String code) {
        this.total = total;
        this.totalPrice = totalPrice;
        this.id = id;
        this.unitPrice = unitPrice;
        this.description = description;
        this.code = code;
    }

    /**
     * get field
     *
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    /**
     * set field
     *
     * @param total
     */
    public void setTotal(Long total) {
        this.total = total;
    }

    /**
     * get field
     *
     * @return totalPrice
     */
    public Double getTotalPrice() {
        return this.totalPrice;
    }

    /**
     * set field
     *
     * @param totalPrice
     */
    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    /**
     * get field
     *
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * set field
     *
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * get field
     *
     * @return unitPrice
     */
    public Double getUnitPrice() {
        return this.unitPrice;
    }

    /**
     * set field
     *
     * @param unitPrice
     */
    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    /**
     * get field
     *
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * set field
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * get field
     *
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * set field
     *
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }
}
