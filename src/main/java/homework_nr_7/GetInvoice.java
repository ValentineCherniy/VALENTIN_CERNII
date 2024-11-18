package homework_nr_7;

public class GetInvoice {


    public static void main(String[] args) {


        Invoice in_1 = new Invoice("Samsung S57CG95", "Gaming monitor", 1, 51575);
        Invoice in_2 = new Invoice("ASUS PG32UCDM", "Gaming monitor", 2, 35425);
        Invoice in_3 = new Invoice("ASUS PG49WCD", "Gaming monitor", 1, 35140);
        Invoice in_4 = new Invoice("Samsung S27C902", "Office monitor", 5, 33145);
        Invoice in_5 = new Invoice("Samsung S49CG930", "Gaming monitor", 1, 32290);


        System.out.println(in_4.getModel() + " - " + in_4.getAmount() + " pcs. Total: " + in_4.getAmount()* in_4.getPrice());
    }

}
