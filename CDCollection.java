// CDCollection - array of CD

public class CDCollection
{
   // data
   private CD[] collection;
   private int count;// counts how many CDs are in the collection
   private double totalCost;
   
   // constructor
   public CDCollection()
   {
      collection = new CD[2];
      count = 0;
      totalCost = 0.0;
   }
   
   // toString() = reporter
   public String toString()
   {
      String result;
      result = "--------------------------------------\n";
      result += "My CD Collection\n";
      result += "Number of CDs: " + count + "\n";
      result += "Total cost of CDs: " + totalCost + "\n";
      result += "--------------------------------------\n";
      result += "CD Details:\n";
      
      for(int i = 0; i < count; i++)
      {
         result += collection[i].toString() + "\n";
      }
      return result;
   }
   
   public void addCD(String title, String artist, int tracks, double cost)
   {
      if(count == collection.length)
         increaseSize();
         
      collection[count] = new CD(title, artist, tracks, cost);
      count++;
      totalCost += cost;
   }

   public void removeCD() {
      if (count > 0) {
        totalCost -= collection[count - 1].getCost();
        collection[count - 1] = null;
        count--;
      }
   }

   public double getCost() {
      return totalCost;
   }
   
   // service method to increase size of the array
   private void increaseSize()
   {
      CD[] temp = new CD[collection.length * 2];// doubles the size of array
      // loop
      for(int i = 0; i < collection.length; i++)
      {
         temp[i] = collection[i];// copy the corresponding elements
      }
      // rename the array
      collection = temp;
   }
   
}