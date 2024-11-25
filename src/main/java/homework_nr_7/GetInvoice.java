package homework_nr_7;

public class GetInvoice {


    public static void main(String[] args) {


        Invoice in_1 = new Invoice("Samsung S57CG95", "Gaming monitor", 1, 51575);
        Invoice in_2 = new Invoice("ASUS PG32UCDM", "Gaming monitor", 2, 0);
        Invoice in_3 = new Invoice("ASUS PG49WCD", "Gaming monitor", 0, 35140);
        Invoice in_4 = new Invoice("Samsung S27C902", "Office monitor", 5, 33145);

        System.out.println(in_1.getModel() + " - " + in_1.getAmount() + " pcs. Total: " + in_1.FinalPrice());
        System.out.println(in_2.getModel() + " - " + in_2.getAmount() + " pcs. Total: " + in_2.FinalPrice());
        System.out.println(in_3.getModel() + " - " + in_3.getAmount() + " pcs. Total: " + in_3.FinalPrice());
        System.out.println(in_4.getModel() + " - " + in_4.getAmount() + " pcs. Total: " + in_4.FinalPrice());
    }

}
