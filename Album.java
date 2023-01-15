class Album {
    
    String artist;
    String album;
    private String matchingItem;

  public Album(String artist, String album){
    this.artist = artist;
    this.album = album;
  }

  public void setMatchingItem(String matchingItem) {
    this.matchingItem = matchingItem;
  }

  public void sugestion(){
    System.out.println("This " + this.artist + " album named " + this.album + " is perfect for the mood you want to get into. It also goes well with " + this.matchingItem);
    System.out.println();
  }

  public static void finalMessage() {
    System.out.println("I hope you enjoy your mood!");
    System.out.println();
    System.out.println("And remember, there are more options for a next time.");
    System.out.println();
    System.out.println("See you soon!");
  } 
  
}