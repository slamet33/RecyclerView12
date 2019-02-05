package co.idn.recyclerview1;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {

    Context context;
    String[] dataNamaJenis;
    int[] imgJenisBuah;

    // Todo #1 Create constructor
    CustomAdapter(Context context, String[] namaJenisBuah, int[] gambarJenisBuah) {
        this.context = context;
        this.dataNamaJenis = namaJenisBuah;
        this.imgJenisBuah = gambarJenisBuah;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        // Todo Menempelkan layout ke adapter
        View view = LayoutInflater.from(context).inflate(R.layout.list_listbuah, null);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        myViewHolder.imgBuah.setImageResource(imgJenisBuah[i]);
        myViewHolder.tvNamaBuah.setText(dataNamaJenis[i]);
    }

    @Override
    public int getItemCount() {
        return dataNamaJenis.length;
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tvNamaBuah;
        ImageView imgBuah;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tvNamaBuah = itemView.findViewById(R.id.tv_namabuah);
            imgBuah = itemView.findViewById(R.id.img_listbuah);
        }
    }
}
