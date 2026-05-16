
package Projects;

class FullTimeEmployee extends Employee {
   @SuppressWarnings("FieldMayBeFinal")
   private double monthlySalary;

   public FullTimeEmployee(String name, int id, double monthlySalary) {
      super(name, id);
      this.monthlySalary = monthlySalary;
   }

   @Override
   public double calculateSalary() {
      return this.monthlySalary;
   }
}
