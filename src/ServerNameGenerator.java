public class ServerNameGenerator {
    public String[] nouns;
    public String[] adjectives;

    public ServerNameGenerator () {
        this.nouns = new String[]{"house", "tree", "park", "computer", "phone", "fish", "plate", "arrow", "cheese", "tv"};
        this.adjectives = new String[]{"happy", "sad", "mad", "excited", "wet", "dry", "bright", "scared", "obnoxious","funny"};
    }

    public String getNoun () {
        return nouns[(int) Math.floor(Math.random() * 10)];
    }

    public String getAdjective () {
        return adjectives[(int) Math.floor(Math.random() * 10)];
    }

    public static void main(String[] args) {
        ServerNameGenerator serverName = new ServerNameGenerator();
        System.out.printf("Your server name is: %s-%s",(serverName.getAdjective()), (serverName.getNoun()));
    }
}
