
package application;

import entities.TaxPayer;
import java.util.*;

public class Program
{
    public static void main(String[] args)
    {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        Date d = new Date();
        System.out.println(d);
        System.out.println();
        int i, n;
        List<TaxPayer> list = new ArrayList<>();

        System.out.print("Quantos contribuintes você vai digitar? ");
        n = scan.nextInt();

        for(i = 0; i < n; i++)
        {
            System.out.println();
            System.out.println("Digite os dados do " + (i + 1) + "º contribuinte: " );
            System.out.print("Renda anual com salário: ");
            double salaryIncome = scan.nextDouble();
            System.out.print("Renda anual com perstação de serviço: ");
            double servicesIncome = scan.nextDouble();
            System.out.print("Renda anual com ganho de capital: ");
            double capitalIncome = scan.nextDouble();
            System.out.print("Gastos médicos: ");
            double healthSpending = scan.nextDouble();
            System.out.print("Gastos educaçionais: ");
            double educationSpending = scan.nextDouble();
            TaxPayer taxPayer = new TaxPayer(salaryIncome, servicesIncome, capitalIncome, healthSpending, educationSpending);
            list.add(taxPayer);
        }
        System.out.println();

        for(i = 0; i < n; i++)
        {
            System.out.println("Resumo do " + (i + 1) + "contribuinte:");
            System.out.println("Imposto bruto total: " +
                    String.format("%.2f", list.get(i).grossTax()));
            System.out.println("Abatimento: " +
                    String.format("%.2f", list.get(i).taxRebate()));
            System.out.println("Imposto devido: " +
                    String.format("%.2f", list.get(i).netTax()));
            System.out.println();
        }

        scan.close();
    }
}