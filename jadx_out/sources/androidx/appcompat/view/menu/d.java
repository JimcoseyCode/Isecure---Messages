package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.k;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class d extends BaseAdapter {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    e f14357g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f14358h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f14359i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f14360j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final LayoutInflater f14361k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f14362l;

    public d(e eVar, LayoutInflater layoutInflater, boolean z10, int i10) {
        this.f14360j = z10;
        this.f14361k = layoutInflater;
        this.f14357g = eVar;
        this.f14362l = i10;
        a();
    }

    void a() {
        g gVarX = this.f14357g.x();
        if (gVarX != null) {
            ArrayList arrayListB = this.f14357g.B();
            int size = arrayListB.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((g) arrayListB.get(i10)) == gVarX) {
                    this.f14358h = i10;
                    return;
                }
            }
        }
        this.f14358h = -1;
    }

    public e b() {
        return this.f14357g;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public g getItem(int i10) {
        ArrayList arrayListB = this.f14360j ? this.f14357g.B() : this.f14357g.G();
        int i11 = this.f14358h;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return (g) arrayListB.get(i10);
    }

    public void d(boolean z10) {
        this.f14359i = z10;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f14358h < 0 ? (this.f14360j ? this.f14357g.B() : this.f14357g.G()).size() : r0.size() - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f14361k.inflate(this.f14362l, viewGroup, false);
        }
        int groupId = getItem(i10).getGroupId();
        int i11 = i10 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f14357g.I() && groupId != (i11 >= 0 ? getItem(i11).getGroupId() : groupId));
        k.a aVar = (k.a) view;
        if (this.f14359i) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.d(getItem(i10), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
