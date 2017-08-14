package kodluyom.emre.KendiAdapterim;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import kodluyom.emre.listviewadaptercalismasi.R;

/**
 * Created by emre on 14.8.2017.
 */

public class MyAdapter extends ArrayAdapter<Urunler> {

    private ArrayList<Urunler> gelen_urunler = null;

    public MyAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull ArrayList<Urunler> objects) {
        super(context, resource, objects);
        this.gelen_urunler=objects;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null) {
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_model_layout, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.setTxt_ad((TextView) convertView.findViewById(R.id.txt1));
            viewHolder.setTxt_id((TextView) convertView.findViewById(R.id.txt2));
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        Urunler _Urunler = getItem(position);
        viewHolder.getTxt_id().setText(String.valueOf(_Urunler.getUrunId()));
        viewHolder.getTxt_ad().setText(_Urunler.getUrunAdi());
        return convertView;
    }
}
