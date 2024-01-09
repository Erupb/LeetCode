package HashTables;

import java.util.ArrayList;
import java.util.List;

public class Codec {

    private List<String> arr = new ArrayList();
    private int ptr = 0;

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        arr.add(longUrl);
        return String.valueOf(ptr++);
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return arr.get(Integer.parseInt(shortUrl));
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));