package kodluyom.emre.KendiAdapterim;

import android.widget.TextView;

/**
 * Created by emre on 14.8.2017.
 */

public class ViewHolder {

    public TextView getTxt_id() {
        return txt_id;
    }

    public void setTxt_id(TextView txt_id) {
        this.txt_id = txt_id;
    }

    public TextView getTxt_ad() {
        return txt_ad;
    }

    public void setTxt_ad(TextView txt_ad) {
        this.txt_ad = txt_ad;
    }

    public TextView txt_id;
    public TextView txt_ad;
}
