package iview.wsienski.quizapp.network.dao;

/**
 * Created by Witold Sienski on 26.07.2016.
 */
public class Quiz {
    private String content;

    private String id;

    private Category category;

    private String title;

    private MainPhoto mainPhoto;

    private String createdAt;

    private String shareTitle;

    private String questions;

    private Category[] categories;

    private String type;

    private String sponsored;

    private String buttonStart;

    public String getContent ()
    {
        return content;
    }

    public void setContent (String content)
    {
        this.content = content;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public Category getCategory ()
    {
        return category;
    }

    public void setCategory (Category category)
    {
        this.category = category;
    }

    public String getTitle ()
    {
        return title;
    }

    public void setTitle (String title)
    {
        this.title = title;
    }

    public MainPhoto getMainPhoto ()
    {
        return mainPhoto;
    }

    public void setMainPhoto (MainPhoto mainPhoto)
    {
        this.mainPhoto = mainPhoto;
    }

    public String getCreatedAt ()
    {
        return createdAt;
    }

    public void setCreatedAt (String createdAt)
    {
        this.createdAt = createdAt;
    }

    public String getShareTitle ()
    {
        return shareTitle;
    }

    public void setShareTitle (String shareTitle)
    {
        this.shareTitle = shareTitle;
    }

    public String getQuestions ()
    {
        return questions;
    }

    public void setQuestions (String questions)
    {
        this.questions = questions;
    }

    public Category[] getCategories ()
    {
        return categories;
    }

    public void setCategories (Category[] categories)
    {
        this.categories = categories;
    }

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }

    public String getSponsored ()
    {
        return sponsored;
    }

    public void setSponsored (String sponsored)
    {
        this.sponsored = sponsored;
    }

    public String getButtonStart ()
    {
        return buttonStart;
    }

    public void setButtonStart (String buttonStart)
    {
        this.buttonStart = buttonStart;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [content = "+content+", id = "+id+", category = "+category+", title = "+title+", mainPhoto = "+mainPhoto+", createdAt = "+createdAt+", shareTitle = "+shareTitle+", questions = "+questions+", categories = "+categories+", type = "+type+", sponsored = "+sponsored+", buttonStart = "+buttonStart+"]";
    }
}
