package iview.wsienski.quizapp.network;

import iview.wsienski.quizapp.network.dao.Quizzes;
import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by Witold Sienski on 26.07.2016.
 */
public interface QuizApi {

    @GET("quizzes/{v1}/{v2}")
    Observable<Quizzes> quizzes(@Path("v1") int v1, @Path("v2") int v2);

}
