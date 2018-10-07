public class Manager extends Employee
{
   private double bonus;

   public Manager(String name, double salary)
   {
      super(name, salary);
      bonus = 0;
   }

   public Manager clone() throws CloneNotSupportedException
   {
      // call Object.clone()
      Manager cloned = (Manager) super.clone();
      return cloned;
   }

   public double getSalary()
   {
      double baseSalary = super.getSalary();
      return baseSalary + bonus;
   }

   public void setBonus(double b)
   {
      bonus = b;
   }

   public String toString()
   {
      return "Manager [name=" + getName() + "hireDay=" + gethireDay() +" salary=" + getSalary() +  "]" + bonus;
   }

}
