package iview.wsienski.quizapp.network.dao;

/**
 * Created by Witold Sienski on 27.07.2016.
 */
public class SponsoredResults {
    private String content;

    private String imageHeight;

    private String imageSource;

    private String textColor;

    private String imageUrl;

    private String imageAuthor;

    private String mainColor;

    private String imageWidth;

    public String getContent ()
    {
        return content;
    }

    public void setContent (String content)
    {
        this.content = content;
    }

    public String getImageHeight ()
    {
        return imageHeight;
    }

    public void setImageHeight (String imageHeight)
    {
        this.imageHeight = imageHeight;
    }

    public String getImageSource ()
    {
        return imageSource;
    }

    public void setImageSource (String imageSource)
    {
        this.imageSource = imageSource;
    }

    public String getTextColor ()
    {
        return textColor;
    }

    public void setTextColor (String textColor)
    {
        this.textColor = textColor;
    }

    public String getImageUrl ()
    {
        return imageUrl;
    }

    public void setImageUrl (String imageUrl)
    {
        this.imageUrl = imageUrl;
    }

    public String getImageAuthor ()
    {
        return imageAuthor;
    }

    public void setImageAuthor (String imageAuthor)
    {
        this.imageAuthor = imageAuthor;
    }

    public String getMainColor ()
    {
        return mainColor;
    }

    public void setMainColor (String mainColor)
    {
        this.mainColor = mainColor;
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
        return "ClassPojo [content = "+content+", imageHeight = "+imageHeight+", imageSource = "+imageSource+", textColor = "+textColor+", imageUrl = "+imageUrl+", imageAuthor = "+imageAuthor+", mainColor = "+mainColor+", imageWidth = "+imageWidth+"]";
    }
}
