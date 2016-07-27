package iview.wsienski.quizapp.network.dao;

/**
 * Created by Witold Sienski on 27.07.2016.
 */
public class Celebrity {
    private String content;

    private String imageTitle;

    private String imageHeight;

    private String result;

    private String imageSource;

    private String imageUrl;

    private String name;

    private String imageAuthor;

    private String show;

    private String imageWidth;

    public String getContent ()
    {
        return content;
    }

    public void setContent (String content)
    {
        this.content = content;
    }

    public String getImageTitle ()
    {
        return imageTitle;
    }

    public void setImageTitle (String imageTitle)
    {
        this.imageTitle = imageTitle;
    }

    public String getImageHeight ()
    {
        return imageHeight;
    }

    public void setImageHeight (String imageHeight)
    {
        this.imageHeight = imageHeight;
    }

    public String getResult ()
    {
        return result;
    }

    public void setResult (String result)
    {
        this.result = result;
    }

    public String getImageSource ()
    {
        return imageSource;
    }

    public void setImageSource (String imageSource)
    {
        this.imageSource = imageSource;
    }

    public String getImageUrl ()
    {
        return imageUrl;
    }

    public void setImageUrl (String imageUrl)
    {
        this.imageUrl = imageUrl;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getImageAuthor ()
    {
        return imageAuthor;
    }

    public void setImageAuthor (String imageAuthor)
    {
        this.imageAuthor = imageAuthor;
    }

    public String getShow ()
    {
        return show;
    }

    public void setShow (String show)
    {
        this.show = show;
    }

    public String getImageWidth ()
    {
        return imageWidth;
    }

    public void setImageWidth (String imageWidth)
    {
        this.imageWidth = imageWidth;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [content = "+content+", imageTitle = "+imageTitle+", imageHeight = "+imageHeight+", result = "+result+", imageSource = "+imageSource+", imageUrl = "+imageUrl+", name = "+name+", imageAuthor = "+imageAuthor+", show = "+show+", imageWidth = "+imageWidth+"]";
    }
}
