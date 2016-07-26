package iview.wsienski.quizapp.events;

import android.support.annotation.Nullable;

/**
 * Created by Witold Sienski on 26.07.2016.
 */
public class MsgEvent {
    @Nullable
    private final boolean mSuccess;
    @Nullable
    private final String message;

    public MsgEvent(boolean mSuccess, @Nullable String message) {
        this.mSuccess = mSuccess;
        this.message = message;
    }

    @Nullable
    public boolean ismSuccess() {
        return mSuccess;
    }

    @Nullable
    public String getMessage() {
        return message;
    }
}