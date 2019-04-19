package pages;

import java.util.ResourceBundle;
import static java.util.ResourceBundle.getBundle;

public class LoginPage extends Page{
    private final ResourceBundle resourceBundle;
    private final String url;
    private final String explicitTime;

    public LoginPage() {
        resourceBundle = getBundle("pages.LoginPage");
        url = this.getResourceBundle().getString("url");
        explicitTime = this.getResourceBundle().getString("explicitTime");
    }
    @Override
    public ResourceBundle getResourceBundle() {
        return resourceBundle;
    }
    @Override
    public String getUrl() {
        return url;
    }

    public int getExplicitTime() {
        int expTime = Integer.parseInt(explicitTime);
        return expTime;
    }
}

