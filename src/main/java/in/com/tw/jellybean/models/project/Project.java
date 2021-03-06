package in.com.tw.jellybean.models.project;


import in.com.tw.jellybean.models.Customer;
import in.com.tw.jellybean.models.Position;

import java.util.Currency;
import java.util.Date;
import java.util.List;

public class Project {

    private String name;
    private String description;
    private Date startDate;
    private Date endDate;
    private ContractType contractType;
    private RateType rateType;
    private Currency billingCurrency;
    private Location locationOfWork ;
    private Domain domain;
    private ProjectStatus status;
    private Customer customer;
    private List<Position> positions;

    @Override
    public String toString() {
        return "Project{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", contractType=" + contractType +
                ", rateType=" + rateType +
                ", billingCurrency=" + billingCurrency +
                ", locationOfWork=" + locationOfWork +
                ", domain=" + domain +
                ", status=" + status +
                ", customer=" + customer +
                '}';
    }

    public ProjectStatus getStatus() {
        return status;
    }

    public void setStatus(ProjectStatus status) {
        this.status = status;
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

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public ContractType getContractType() {
        return contractType;
    }

    public void setContractType(ContractType contractType) {
        this.contractType = contractType;
    }

    public RateType getRateType() {
        return rateType;
    }

    public void setRateType(RateType rateType) {
        this.rateType = rateType;
    }

    public Currency getBillingCurrency() {
        return billingCurrency;
    }

    public void setBillingCurrency(Currency billingCurrency) {
        this.billingCurrency = billingCurrency;
    }

    public Location getLocationOfWork() {
        return locationOfWork;
    }

    public void setLocationOfWork(Location locationOfWork) {
        this.locationOfWork = locationOfWork;
    }

    public Domain getDomain() {
        return domain;
    }

    public void setDomain(Domain domain) {
        this.domain = domain;
    }

    public int getDurationInDays() {
        long diffDays = endDate.getTime() - startDate.getTime();
        return (int) (diffDays/(24*60*60*1000));
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
