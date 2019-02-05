package co.idn.recyclerview1;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

class JenisBuahAdapter extends RecyclerView.Adapter<JenisBuahAdapter.CustomViewHolder> {

    // TODO #7 Create Variable for adapter
    private Context context;
    private String[] namaJenisBuah;
    private int[] gambarJenisBuah;

    public JenisBuahAdapter(Context context, String[] namaJenisBuah, int[] gambarJenisBuah) {
        // TODO #8 Making equal between parameter and variable
        this.context = context;
        this.gambarJenisBuah = gambarJenisBuah;
        this.namaJenisBuah = namaJenisBuah;
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        // TODO #9 Make return View.inflater
        View v = LayoutInflater.from(context).inflate(R.layout.list_listjenisbuah, viewGroup, false);
        return new CustomViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder customViewHolder, int i) {
        // Todo #13 Merge between Value and Variable.ViewHolder
        customViewHolder.txtJenisBuah.setText(namaJenisBuah[i]);
        customViewHolder.imgJenisBuah.setImageResource(gambarJenisBuah[i]);
    }

    @Override
    public int getItemCount() {
        // TODO #1O make return data length
        return namaJenisBuah.length;
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {

        // TODO #11 Create variable for layout inflater
        ImageView imgJenisBuah;
        TextView txtJenisBuah;

        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);

            // TODO #12 Initialize between variable and id
            imgJenisBuah = itemView.findViewById(R.id.img_jenisbuah);
            txtJenisBuah = itemView.findViewById(R.id.tv_jenisbuah);

        }
    }
}
