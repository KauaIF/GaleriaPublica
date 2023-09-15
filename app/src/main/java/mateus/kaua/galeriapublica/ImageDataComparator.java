package mateus.kaua.galeriapublica;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;

public class ImageDataComparator extends DiffUtil.ItemCallback<radaelli.chagas.adami.harian.galeriapublica.ImageData> {
    @Override
    public boolean areItemsTheSame(@NonNull radaelli.chagas.adami.harian.galeriapublica.ImageData oldItem, @NonNull radaelli.chagas.adami.harian.galeriapublica.ImageData newItem){
        //Id unico
        return oldItem.uri.equals(newItem.uri);
    }
    @Override
    public boolean areContentsTheSame(@NonNull radaelli.chagas.adami.harian.galeriapublica.ImageData oldItem, @NonNull radaelli.chagas.adami.harian.galeriapublica.ImageData newItem){
        return oldItem.uri.equals(newItem.uri);
    }
}
