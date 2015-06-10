public class Date 
{
   static String[] MonthName = {"January", "February", "March", "April", "May", "June", "July", 
         "August", "September", "October", "November", "December"};
   
   int month, day, year;
   String month2;

   String newMonth;
   boolean isNumber = false;
   
   
   public static String getMonthName(int x)
   {
      if (x <= 12 && x > 0)
      {
         return MonthName[x - 1];
      }
      else
      {
         return "Invalid month";
      }
   }
   
   public Date (int month, int day, int year)
   {
      boolean isNumber = true;
      this.month = month;
      this.day = day;
      this.year = year;
   }
   public Date (String month, int day, int year)
   {
      boolean isNumber = false;
      this.month2 = month;
      this.day = day;
      this.year = year;
   }
   
   public String toString()
   {
      if (isNumber)
      {
         if (day > 0)
         {
            //HERE IS WHERE I AM HAVING ALL OF MY PROBLEMS (I think)
            newMonth = getMonthName(month);
            return newMonth + ", " + day + ", " + year;
         }
         else
         {
            return "Invalid date";
         }
         
      }
      else
      {
         if (day > 0)
         {
            return month2 + ", " + day + ", " + year;
         }
         else
         {
            return "Invalid date";
         }
         
      }
   }
   
 
   
}