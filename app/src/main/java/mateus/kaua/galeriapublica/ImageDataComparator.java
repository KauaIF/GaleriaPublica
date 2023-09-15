package mateus.kaua.galeriapublica;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;

public class ImageDataComparator extends DiffUtil.ItemCallback<mateus.kaua.galeriapublica.ImageData> {
    @Override
    public boolean areItemsTheSame(@NonNull mateus.kaua.galeriapublica.ImageData oldItem, @NonNull mateus.kaua.galeriapublica.ImageData newItem){
        //Id unico
        return oldItem.uri.equals(newItem.uri);
    }
    @Override
    public boolean areContentsTheSame(@NonNull mateus.kaua.galeriapublica.ImageData oldItem, @NonNull mateus.kaua.galeriapublica.ImageData newItem){
        return oldItem.uri.equals(newItem.uri);
    }
}
