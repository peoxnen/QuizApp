package iview.wsienski.quizapp.network.dao;

/**
 * Created by Witold Sienski on 26.07.2016.
 */
public class Quizzes
{
    private String count;

    private Quiz[] items;

    public String getCount ()
    {
        return count;
    }

    public void setCount (String count)
    {
        this.count = count;
    }

    public Quiz[] getItems ()
    {
        return items;
    }

    public void setItems (Quiz[] items)
    {
        this.items = items;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [count = "+count+", items = "+items+"]";
    }
}