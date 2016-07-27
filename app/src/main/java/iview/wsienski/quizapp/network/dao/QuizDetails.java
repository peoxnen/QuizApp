package iview.wsienski.quizapp.network.dao;

/**
 * Created by Witold Sienski on 27.07.2016.
 */
public class QuizDetails {

    private String resultCount;

    private String shareTitle;

    private Questions[] questions;

    private Rates[] rates;

    private String avgResult;

    private String type;

    private String content;

    private String id;

    private LatestResults[] latestResults;

    private String isBattle;

    private String scripts;

    private Celebrity celebrity;

    private Category category;

    private String title;

    private String created;

    private MainPhoto mainPhoto;

    private String userBattleDone;

    private String createdAt;

    private Categories[] categories;

    private SponsoredResults sponsoredResults;

    private String sponsored;

    private String buttonStart;

    public String getResultCount ()
    {
        return resultCount;
    }

    public void setResultCount (String resultCount)
    {
        this.resultCount = resultCount;
    }

    public String getShareTitle ()
    {
        return shareTitle;
    }

    public void setShareTitle (String shareTitle)
    {
        this.shareTitle = shareTitle;
    }

    public Questions[] getQuestions ()
    {
        return questions;
    }

    public void setQuestions (Questions[] questions)
    {
        this.questions = questions;
    }

    public Rates[] getRates ()
    {
        return rates;
    }

    public void setRates (Rates[] rates)
    {
        this.rates = rates;
    }

    public String getAvgResult ()
    {
        return avgResult;
    }

    public void setAvgResult (String avgResult)
    {
        this.avgResult = avgResult;
    }

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }

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

    public LatestResults[] getLatestResults ()
    {
        return latestResults;
    }

    public void setLatestResults (LatestResults[] latestResults)
    {
        this.latestResults = latestResults;
    }

    public String getIsBattle ()
    {
        return isBattle;
    }

    public void setIsBattle (String isBattle)
    {
        this.isBattle = isBattle;
    }

    public String getScripts ()
    {
        return scripts;
    }

    public void setScripts (String scripts)
    {
        this.scripts = scripts;
    }

    public Celebrity getCelebrity ()
    {
        return celebrity;
    }

    public void setCelebrity (Celebrity celebrity)
    {
        this.celebrity = celebrity;
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

    public String getCreated ()
    {
        return created;
    }

    public void setCreated (String created)
    {
        this.created = created;
    }

    public MainPhoto getMainPhoto ()
    {
        return mainPhoto;
    }

    public void setMainPhoto (MainPhoto mainPhoto)
    {
        this.mainPhoto = mainPhoto;
    }

    public String getUserBattleDone ()
    {
        return userBattleDone;
    }

    public void setUserBattleDone (String userBattleDone)
    {
        this.userBattleDone = userBattleDone;
    }

    public String getCreatedAt ()
    {
        return createdAt;
    }

    public void setCreatedAt (String createdAt)
    {
        this.createdAt = createdAt;
    }

    public Categories[] getCategories ()
    {
        return categories;
    }

    public void setCategories (Categories[] categories)
    {
        this.categories = categories;
    }

    public SponsoredResults getSponsoredResults ()
    {
        return sponsoredResults;
    }

    public void setSponsoredResults (SponsoredResults sponsoredResults)
    {
        this.sponsoredResults = sponsoredResults;
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
}
