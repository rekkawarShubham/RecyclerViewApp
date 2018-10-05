package recycler.sdl.com.recyclerviewapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.List;

import recycler.sdl.com.recyclerviewapp.CanteenMenu;
import recycler.sdl.com.recyclerviewapp.R;

/**
 * Created by Belal on 10/18/2017.
 */


public class CanteenAdapter extends RecyclerView.Adapter<CanteenAdapter.CanteenMenuViewHolder> {


    //this context we will use to inflate the layout
    private Context mCtx;

    //we are storing all the CanteenMenus in a list
    private List<CanteenMenu> CanteenMenuList;

    //getting the context and CanteenMenu list with constructor
    public CanteenAdapter(Context mCtx, List<CanteenMenu> CanteenMenuList) {
        this.mCtx = mCtx;
        this.CanteenMenuList = CanteenMenuList;
    }

    @Override
    public CanteenMenuViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //inflating and returning our view holder
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.my_layout, null);
        return new CanteenMenuViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CanteenMenuViewHolder holder, int position) {
        //getting the CanteenMenu of the specified position
        CanteenMenu CanteenMenu = CanteenMenuList.get(position);

        //binding the data with the viewholder views
        holder.textViewTitle.setText(CanteenMenu.getTitle());
        holder.textViewShortDesc.setText(CanteenMenu.getShortdesc());
        //holder.textViewRating.setText(String.valueOf(CanteenMenu.getRating()));
        holder.textViewPrice.setText(String.valueOf(CanteenMenu.getPrice()));

        //holder.imageView.setImageDrawable(mCtx.getResources().getDrawable(CanteenMenu.getImage()));

    }


    @Override
    public int getItemCount() {
        return CanteenMenuList.size();
    }


    class CanteenMenuViewHolder extends RecyclerView.ViewHolder {

        TextView textViewTitle, textViewShortDesc, textViewPrice;
        //ImageView imageView;

        public CanteenMenuViewHolder(View itemView) {
            super(itemView);

            textViewTitle = itemView.findViewById(R.id.textViewTitle);
            textViewShortDesc = itemView.findViewById(R.id.textViewShortDesc);

            textViewPrice = itemView.findViewById(R.id.textViewPrice);

        }
    }
}