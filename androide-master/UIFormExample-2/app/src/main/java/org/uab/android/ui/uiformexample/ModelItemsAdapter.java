package org.uab.android.ui.uiformexample;

import android.content.Context;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
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
        EditText creditosText;
        TextView defaultHourTextView;

       // Button setHourButton;
        ViewHolder(View itemView) {
            super(itemView);
            classesAutoCompleteTextView = (AutoCompleteTextView) itemView.findViewById(R.id.classAutoComplete);
            creditosText = (EditText) itemView.findViewById(R.id.creditsEditText);
            defaultHourTextView = (TextView) itemView.findViewById(R.id.defaultHourLabel);
        }
    }

    @Override
    public ModelItemsAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item , parent, false);
        return new ModelItemsAdapter.ViewHolder(layoutView);

    }

    /**
     * Se encarga de rellenar la información que mostraremos en la lista de elementos.
     *
     * @param holder
     * @param position
     */
    @Override
    public void onBindViewHolder(ModelItemsAdapter.ViewHolder holder, int position) {
        final Model item = items.get(position);
            holder.classesAutoCompleteTextView.setText(item.getNombreAsig()) ;
            holder.creditosText.setText(item.getCreditos());
            holder.defaultHourTextView.setText(item.getHora());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
