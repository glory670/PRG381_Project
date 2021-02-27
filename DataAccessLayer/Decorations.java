package DataAccessLayer;

public class Decorations{
    String  DecorID;
    String Theme;
    String ColorScheme;
    String DecorDescription;

    public String getDecorID()
    {
        return DecorID;
    }
    public void setDecorID(String DecorID)
    {
        this.DecorID = DecorID;
    }
    public String getTheme()
    {
        return Theme;
    }
    public void setTheme(String Theme)
    {
        this.Theme = Theme;
    }
    public String getColorScheme()
    {
        return ColorScheme;
    }
    public void setColorScheme(String ColorScheme)
    {
        this.ColorScheme = ColorScheme;
    }
    public String getDecorDescriptions()
    {
        return DecorDescription;
    }
    public void setDecorDescriptions(String DecorDescription)
    {
        this.DecorDescription = DecorDescription;
    }


    public Decorations()
    {

    }

    public Decorations(String DecorID, String Theme, String ColorScheme, String DecorDescription)
    {
        this.DecorID = DecorID;
        this.Theme = Theme;
        this.ColorScheme = ColorScheme;
        this.DecorDescription = DecorDescription;
    }

    

}