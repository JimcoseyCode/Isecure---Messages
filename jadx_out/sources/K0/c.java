package K0;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c extends a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f7032o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f7033p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private LayoutInflater f7034q;

    public c(Context context, int i10, Cursor cursor, boolean z10) {
        super(context, cursor, z10);
        this.f7033p = i10;
        this.f7032o = i10;
        this.f7034q = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // K0.a
    public View f(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f7034q.inflate(this.f7033p, viewGroup, false);
    }

    @Override // K0.a
    public View g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f7034q.inflate(this.f7032o, viewGroup, false);
    }
}
