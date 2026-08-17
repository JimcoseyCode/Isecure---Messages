package S1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.canhub.cropper.CropImageView;
import com.canhub.cropper.y;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CropImageView f10249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CropImageView f10250b;

    private a(CropImageView cropImageView, CropImageView cropImageView2) {
        this.f10249a = cropImageView;
        this.f10250b = cropImageView2;
    }

    public static a a(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        CropImageView cropImageView = (CropImageView) view;
        return new a(cropImageView, cropImageView);
    }

    public static a c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static a d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(y.f19673a, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public CropImageView b() {
        return this.f10249a;
    }
}
