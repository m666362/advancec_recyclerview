package org.richit.advancedrecyclerview.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.richit.advancedrecyclerview.Model.App;
import org.richit.advancedrecyclerview.R;

import java.util.ArrayList;

public class RecommendedAppAdapter extends RecyclerView.Adapter<RecommendedAppAdapter.ViewHolder> {

    ArrayList<App> apps = new ArrayList<>();
    Context context;

    public RecommendedAppAdapter(ArrayList<App> apps, Context context) {
        this.apps = apps;
        this.context = context;
    }

    @NonNull
    @Override
    public RecommendedAppAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from( context ).inflate( R.layout.recommended_for_u_rec_v, parent, false );
        return new ViewHolder( view );
    }

    @Override
    public void onBindViewHolder(@NonNull RecommendedAppAdapter.ViewHolder holder, int position) {
        holder.titleTv.setText( apps.get( position ).getTitle() );
        holder.descriptionTv.setText( apps.get( position ).getDescription() );
    }

    @Override
    public int getItemCount() {
        return apps.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView titleTv;
        TextView descriptionTv;
        public ViewHolder(@NonNull View itemView) {
            super( itemView );
            titleTv = itemView.findViewById( R.id.title );
            descriptionTv = itemView.findViewById( R.id.description );
        }
    }
}
