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

public class AgeAppAdapter extends RecyclerView.Adapter<AgeAppAdapter.ViewHolder> {

    ArrayList<App> apps = new ArrayList<>();
    Context context;

    public AgeAppAdapter(ArrayList<App> apps, Context context) {
        this.apps = apps;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from( context ).inflate( R.layout.age_rec_view, parent, false );
        return new ViewHolder( view );
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.ageTitleTv.setText( apps.get( position ).getTitle() );
    }

    @Override
    public int getItemCount() {
        return apps.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView ageTitleTv;
        public ViewHolder(@NonNull View itemView) {
            super( itemView );
            ageTitleTv = itemView.findViewById( R.id.ageTitle );
        }
    }
}
