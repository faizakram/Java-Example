import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author 13615
 *
 */
public class ObjectValidation {

	/**
	 *
	 * @param url validation
	 * @return
	 */
	public Boolean validateURL(String url) {
		try {
		    final URLConnection connection = new URL(url).openConnection();
		    connection.connect();
		    return true;
		} catch (final MalformedURLException e) {
		    throw new IllegalStateException("Bad URL: " + url, e);
		} catch (final IOException e) {
		    return false;
		}

	}

}
