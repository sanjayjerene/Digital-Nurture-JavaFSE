import java.net.URI;
import java.net.http.*;

public class HttpExample {

    public static void main(String[] args) throws Exception {

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("https://api.github.com/users/octocat"))
            .build();

        HttpResponse<String> response =
            client.send(request,
            HttpResponse.BodyHandlers.ofString());

        System.out.println("Status Code: "
                + response.statusCode());

        System.out.println("\nResponse Body:\n"
                + response.body());
    }
}