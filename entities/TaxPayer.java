package entities;

public class TaxPayer
{
    private Double salaryIncome;
    private Double servicesIncome;
    private Double capitalIncome;
    private Double healthSpending;
    private Double educationSpending;

    public TaxPayer(Double salaryIncome, Double servicesIncome, Double capitalIncome,
                    Double healthSpending, Double educationSpending)
    {this.salaryIncome = salaryIncome; this.servicesIncome = servicesIncome; this.capitalIncome = capitalIncome;
        this.healthSpending = healthSpending; this.educationSpending = educationSpending;}

    public void setSalaryIncome(double salaryIncome)
    {this.salaryIncome = salaryIncome;}

    public Double getSalaryIncome()
    {return salaryIncome;}

    public void setServicesIncome(double ServicesIncome)
    {this.servicesIncome = servicesIncome;}

    public Double getServicesIncome()
    {return servicesIncome;}

    public void setCapitalIncome(double capitalIncome)
    {this.capitalIncome = capitalIncome;}

    public Double getCapitalIncome()
    {return capitalIncome;}

    public void setHealthSpending(double healthSpending)
    {this.healthSpending = healthSpending;}

    public Double getHealthSpending()
    {return healthSpending;}

    public void setEducationSpending(double educationSpending)
    {this.educationSpending = educationSpending;}

    public Double getEducationSpending()
    {return educationSpending;}

    public Double salaryTax()
    {
        double salarytax, perce;
        if((salaryIncome / 12) <= 3000.)
            perce = 0;
        else if((salaryIncome / 12) <= 5000.)
            perce = 10;
        else
            perce = 20;

        return salarytax = salaryIncome * perce / 100;

    }
    public Double sevicesTax()
    {
        double perce = 15;
        double servicestax = 0;
        if(servicesIncome != 0)
        {
            return servicestax = servicesIncome * perce /100;
        }
        return servicestax;
    }
    public Double capitalTax()
    {
        double perce = 20;
        double capitaltax = 0;
        if(capitalIncome != 0)
        {
            return capitaltax = capitalIncome * perce / 100;
        }
        return capitaltax;
    }
    public Double grossTax()
    {
        double grosstax = sevicesTax() + salaryTax() + capitalTax();
        return grosstax;
    }
    public Double taxRebate()
    {
        double taxrebate = 0;
        double soma = healthSpending + educationSpending;
        if(soma > grossTax())
        {
            taxrebate = grossTax() * 30 / 100;
        }
        else
        {
            taxrebate = soma;
        }
        return taxrebate;
    }
    public Double netTax()
    {
        return grossTax() - taxRebate();
    }

}
