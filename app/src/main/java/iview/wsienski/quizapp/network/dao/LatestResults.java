package iview.wsienski.quizapp.network.dao;

/**
 * Created by Witold Sienski on 27.07.2016.
 */
public class LatestResults {
    private String result;

    private String end_date;

    private String resolveTime;

    private String city;

    public String getResult ()
    {
        return result;
    }

    public void setResult (String result)
    {
        this.result = result;
    }

    public String getEnd_date ()
    {
        return end_date;
    }

    public void setEnd_date (String end_date)
    {
        this.end_date = end_date;
    }

    public String getResolveTime ()
    {
        return resolveTime;
    }

    public void setResolveTime (String resolveTime)
    {
        this.resolveTime = resolveTime;
    }

    public String getCity ()
    {
        return city;
    }

    public void setCity (String city)
    {
        this.city = city;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [result = "+result+", end_date = "+end_date+", resolveTime = "+resolveTime+", city = "+city+"]";
    }
}
