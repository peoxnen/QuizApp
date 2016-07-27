package iview.wsienski.quizapp.network.dao;

/**
 * Created by Witold Sienski on 27.07.2016.
 */
public class Categories {
    private String uid;

    private String name;

    private String type;

    public String getUid ()
    {
        return uid;
    }

    public void setUid (String uid)
    {
        this.uid = uid;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
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
        return "ClassPojo [uid = "+uid+", name = "+name+", type = "+type+"]";
    }
}
