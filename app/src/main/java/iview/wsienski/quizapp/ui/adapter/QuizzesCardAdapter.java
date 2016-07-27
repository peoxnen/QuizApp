package iview.wsienski.quizapp.ui.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

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
        holder.getDesc().setText(quiz.getContent());
        holder.getResult().setText("100%");
        holder.getResult().setBackground(getBg(position % 2 == 0));
        String url = quiz.getMainPhoto().getUrl();
        Glide.with(context).load(url).centerCrop().into(holder.getImageView());
    }

    Drawable getBg(boolean isRed){
        Drawable drawable;
        int res;

        if(isRed){
            res = R.drawable.oval_red;
        }else{
            res= R.drawable.oval_green;
        }

        if(android.os.Build.VERSION.SDK_INT >= 21){
            drawable = context.getResources().getDrawable(res, context.getTheme());
        } else {
            drawable = context.getResources().getDrawable(res);
        }
        return drawable;
    }

    @Override
    public int getItemCount() {
        return quizzes.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.title)
        TextView title;
        @BindView(R.id.desc)
        TextView desc;
        @BindView(R.id.image)
        ImageView imageView;
        @BindView(R.id.result)
        TextView result;

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

        public ImageView getImageView() {
            return imageView;
        }

        public void setImageView(ImageView imageView) {
            this.imageView = imageView;
        }

        public TextView getDesc() {
            return desc;
        }

        public void setDesc(TextView desc) {
            this.desc = desc;
        }

        public TextView getResult() {
            return result;
        }

        public void setResult(TextView result) {
            this.result = result;
        }
    }
}
