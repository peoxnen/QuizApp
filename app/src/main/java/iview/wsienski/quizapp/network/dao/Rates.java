package iview.wsienski.quizapp.network.dao;

/**
 * Created by Witold Sienski on 27.07.2016.
 */
public class Rates {
    private String content;

    private String to;

    private String from;

    public String getContent ()
    {
        return content;
    }

    public void setContent (String content)
    {
        this.content = content;
    }

    public String getTo ()
    {
        return to;
    }

    public void setTo (String to)
    {
        this.to = to;
    }

    public String getFrom ()
    {
        return from;
    }

    public void setFrom (String from)
    {
        this.from = from;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [content = "+content+", to = "+to+", from = "+from+"]";
    }
}
