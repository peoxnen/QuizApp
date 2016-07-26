package iview.wsienski.quizapp.ui.adapter;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import iview.wsienski.quizapp.R;
import iview.wsienski.quizapp.network.dao.Quiz;
import timber.log.Timber;

/**
 * Created by Witold Sienski on 26.07.2016.
 */
public class QuizzesCardAdapter extends RecyclerView.Adapter<QuizzesCardAdapter.ViewHolder>{

    Context context;
    List<Quiz> quizzes;

    public QuizzesCardAdapter(Context context, List<Quiz> quizzes) {
        this.context = context;
        this.quizzes = quizzes;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        CardView cardView = (CardView) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_quize, parent, false);
        return new ViewHolder(cardView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Timber.d("positon "+position);
        Quiz quiz = quizzes.get(position);
        holder.getTitle().setText(quiz.getTitle());
    }

    @Override
    public int getItemCount() {
        return quizzes.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.title)
        TextView title;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        public TextView getTitle() {
            return title;
        }

        public void setTitle(TextView title) {
            this.title = title;
        }
    }
}
