package iview.wsienski.quizapp.network.dao;

import android.media.Image;

/**
 * Created by Witold Sienski on 27.07.2016.
 */
public class Questions {
    private String text;

    private String order;

    private String answer;

    private Answers[] answers;

    private Image image;

    private String type;

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

    public String getAnswer ()
    {
        return answer;
    }

    public void setAnswer (String answer)
    {
        this.answer = answer;
    }

    public Answers[] getAnswers ()
    {
        return answers;
    }

    public void setAnswers (Answers[] answers)
    {
        this.answers = answers;
    }

    public Image getImage ()
    {
        return image;
    }

    public void setImage (Image image)
    {
        this.image = image;
    }

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [text = "+text+", order = "+order+", answer = "+answer+", answers = "+answers+", image = "+image+", type = "+type+"]";
    }
}
