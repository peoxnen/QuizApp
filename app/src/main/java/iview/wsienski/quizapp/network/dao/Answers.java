package iview.wsienski.quizapp.network.dao;

import android.media.Image;

/**
 * Created by Witold Sienski on 27.07.2016.
 */
public class Answers {
    private String text;

    private String order;

    private Image image;

    public String getText ()
    {
        return text;
    }

    public void setText (String text)
    {
        this.text = text;
    }

    public String getOrder ()
    {
        return order;
    }

    public void setOrder (String order)
    {
        this.order = order;
    }

    public Image getImage ()
    {
        return image;
    }

    public void setImage (Image image)
    {
        this.image = image;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [text = "+text+", order = "+order+", image = "+image+"]";
    }
}
