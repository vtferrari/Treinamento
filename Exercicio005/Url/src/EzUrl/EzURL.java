package EzUrl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class EzURL {

    static String requestHTML(String path) throws MalformedURLException, IOException {

        URL url = new URL(path);
        BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
        StringBuffer buffer = new StringBuffer();
        String linha;
        while ((linha = br.readLine()) != null) {
            buffer.append(linha);
        }
        br.close();
        return (buffer.toString());

    }
}
