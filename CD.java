// CD class 

public class CD
{
   // data
   private String title, artist;
   private int tracks;
   private double cost;
   
   // constructor 
   public CD(String title, String artist, int tracks, double cost)
   {
      this.title = title;
      this.artist = artist;
      this.tracks = tracks;
      this.cost = cost;
   }
   
   
   // reporter
   public String toString()
   {
      String result;
      result = title + "\t" + artist + "\t" + tracks + "\t" + cost;
      return result;
   }
   
   // get
   public String getTitle()
   {
      return title;
   }
   
   public String getArtist()
   {
      return artist;
   }
   
   public int getTracks()
   {
      return tracks;
   }
   
   public double getCost()
   {
      return cost;
   }
   
   // set 
   public void setArtist(String artist)
   {
      this.artist = artist;
   }
   
   public void setTitle(String title)
   {
      this.title = title;
   }
   
   public void setTracks(int tracks)
   {
      this.tracks = tracks;
   }
   
   public void setCost(double cost)
   {
      this.cost = cost;
   }
}