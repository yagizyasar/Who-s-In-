/**
 * Board game event
 * @authors Cemhan Kaan Özaltan
 * @version 6.5.2020
 */
public class BoardGameEvent extends Event {

   // properties
   String[] gameTypes = { "Party Game", "Card Game", "Roleplay Game" };
   int gameType;

   // constructors
   public BoardGameEvent( String title, User organizer, Time duration, Date date, int capacity, Location location , int accessStatus, int gameType ) {
      super( title, organizer, duration, date, capacity, location accessStatus );
      this.gameType = gameType;
   }

   // methods
   public String getGameType() {
      return gameTypes[ gameType ];
   }

   public void setGameType( int gameType ) {
      this.gameType = gameType;
   }

   public String toString() {
      return title + getGameType() + ", " + duration + ", " + date + ", " + capacity + ", " + location;
   }
}
