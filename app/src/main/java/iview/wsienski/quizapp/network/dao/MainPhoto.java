package iview.wsienski.quizapp.network.dao;

/**
 * Created by Witold Sienski on 26.07.2016.
 */
public class MainPhoto {
    private String author;

    private String title;

    private String height;

    private String source;

    private String width;

    private String url;

    public String getAuthor ()
    {
        return author;
    }

    public void setAuthor (String author)
    {
        this.author = author;
    }

    public String getTitle ()
    {
        return title;
    }

    public void setTitle (String title)
    {
        this.title = title;
    }

    public String getHeight ()
    {
        return height;
    }

    public void setHeight (String height)
    {
        this.height = height;
    }

    public String getSource ()
    {
        return source;
    }

    public void setSource (String source)
    {
        this.source = source;
    }

    public String getWidth ()
    {
        return width;
    }

    public void setWidth (String width)
    {
        this.width = width;
    }

    public String getUrl ()
    {
        return url;
    }

    public void setUrl (String url)
    {
        this.url = url;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [author = "+author+", title = "+title+", height = "+height+", source = "+source+", width = "+width+", url = "+url+"]";
    }
}
