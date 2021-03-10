package Chapter7.PolyProject;

public class Commission extends Employee {

    private double commissionAmount;

   public Commission (String eName, String eAddress, String ePhone,
                    String socSecNumber, double rate)
   {

    super (eName, eAddress, ePhone, socSecNumber, rate);


   }

   public void addCommission(double commission) {
       commissionAmount = commission;
   }

   public double pay() {
       return getPayRate() + commissionAmount;
   }
    
}
