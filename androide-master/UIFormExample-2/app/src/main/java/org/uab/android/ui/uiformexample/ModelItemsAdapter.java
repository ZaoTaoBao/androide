package org.uab.android.ui.uiformexample;

import android.content.Context;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;



import java.util.List;

public class ModelItemsAdapter extends RecyclerView.Adapter<ModelItemsAdapter.ViewHolder> {
    private Context context;
    private List<Model> items;

    public ModelItemsAdapter(Context context, List<Model> items) {
        this.context = context;
        this.items = items;
    }

    public void changeList(List<Model> items) {
        this.items = items;
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        AutoCompleteTextView classesAutoCompleteTextView;
        TextView				defaultHourTextView;
        Button setHourButton;


        ViewHolder(View itemView) {
            super(itemView);
            classesAutoCompleteTextView = (AutoCompleteTextView) itemView.findViewById(R.id.classAutoComplete);
            defaultHourTextView = (TextView) itemView.findViewById(R.id.defaultHourLabel);
            setHourButton = (Button) itemView.findViewById(R.id.setHourButton);
        }
    }

    @Override
    public ModelItemsAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View heroItemView = LayoutInflater.from(context)
                .inflate(R.layout.list_item , parent, false);
        return new ModelItemsAdapter.ViewHolder(heroItemView);
    }

    @Override
    public void onBindViewHolder(ModelItemsAdapter.ViewHolder holder, int position) {
        final Model item = items.get(position);
        /*
        holder.title.setText(item.getTitle());
        holder.description.setText(item.getDescription());

        String thumbnailUrl = item.getThumbnail().getPath() + "." + item.getThumbnail().getExtension();
        Picasso.with(context)
                .load(thumbnailUrl)
                .placeholder(R.mipmap.ic_launcher)
                .error(android.R.drawable.ic_dialog_alert)
                .into(holder.thumbnail);
            */
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
