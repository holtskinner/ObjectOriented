package skinnerhrelaxatron;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Fortune {

    private String text;
    private static final String urlString ="http://ec2-35-163-155-173.us-west-2.compute.amazonaws.com/api.php?fortune";

    public Fortune() throws IOException {
        try {
            this.text = callURL(urlString);
        } catch (Exception ex) {
            System.out.println(ex);
            this.text = "";
        }
    }

    public String getText() {
      return this.text;
    }

    private static String callURL(String urlString) throws IOException {

        URLConnection urlConn = null; //Assign it to null, just to be safe
        InputStreamReader input = null;
        String output = null;
        BufferedReader bufferedReader = null;

        try {
            URL url = new URL(urlString);
            urlConn = url.openConnection();
            if (urlConn != null && urlConn.getInputStream() != null) {

                input = new InputStreamReader(urlConn.getInputStream());
                bufferedReader = new BufferedReader(input);
                output = bufferedReader.readLine();

                if (output == null) {
                    output = "";
                }

                bufferedReader.close();
            }

            //I would have put this in a finally, but it can throw an exception as well
            if(input != null) {
                input.close();
            }

        } catch (IOException ex) {
                System.out.println(ex);
        }

        return output;
    }

}
