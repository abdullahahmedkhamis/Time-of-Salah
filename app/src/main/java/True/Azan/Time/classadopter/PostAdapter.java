package True.Azan.Time.classadopter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.azanapitime.R;

import java.util.ArrayList;
import java.util.List;

import True.Azan.Time.model.PostModel;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.PostViewHolder> {
    private List<PostModel> moviesList = new ArrayList<>();
            //ArrayList

    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PostViewHolder(LayoutInflater.from(parent.getContext()).inflate( R.layout.post_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull PostViewHolder holder, int position) {
        holder.titleTV.setText(moviesList.get(position).getCountry());
        holder.userTV.setText(moviesList.get(position).getMecca()+"");
        holder.bodyTV.setText(moviesList.get(position).getCode());
    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }
    public void setList(List<PostModel> moviesList) {   // Was ArrayList and Was Made Problem
        this.moviesList = moviesList;
        notifyDataSetChanged();
    }


    public class PostViewHolder extends RecyclerView.ViewHolder {
        TextView titleTV, userTV, bodyTV;
        public PostViewHolder(@NonNull View itemView) {
            super( itemView );
            titleTV = itemView.findViewById(R.id.titleTextview);
            userTV = itemView.findViewById(R.id.userIdTextView);
            bodyTV = itemView.findViewById(R.id.bodyTextview);
        }
    }
}
