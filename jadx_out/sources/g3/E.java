package g3;

import android.util.SparseIntArray;
import com.facebook.react.uimanager.ViewDefaults;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f28166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SparseIntArray f28167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f28168d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f28169e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f28170f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f28171g;

    public E(int i10, int i11, SparseIntArray sparseIntArray) {
        this(i10, i11, sparseIntArray, 0, ViewDefaults.NUMBER_OF_LINES, -1);
    }

    public E(int i10, int i11, SparseIntArray sparseIntArray, int i12, int i13, int i14) {
        c2.k.i(i10 >= 0 && i11 >= i10);
        this.f28166b = i10;
        this.f28165a = i11;
        this.f28167c = sparseIntArray;
        this.f28168d = i12;
        this.f28169e = i13;
        this.f28171g = i14;
    }
}
