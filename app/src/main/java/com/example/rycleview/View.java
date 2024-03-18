package com.example.rycleview;

        import android.widget.ImageView;
        import android.widget.TextView;

        import androidx.annotation.NonNull;
        import androidx.recyclerview.widget.RecyclerView;

public class View extends RecyclerView.ViewHolder {

    ImageView fotoView;
    TextView nameView,nimView,kelasView;

    public View(@NonNull android.view.View itemView) {
        super(itemView);
        fotoView = itemView.findViewById(R.id.foto);
        nameView = itemView.findViewById(R.id.name);
        nimView = itemView.findViewById(R.id.nim);
        kelasView = itemView.findViewById(R.id.kelas);
    }
}
