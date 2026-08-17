package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import f.AbstractC2574g;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class c implements j, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    Context f14345g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    LayoutInflater f14346h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    e f14347i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    ExpandedMenuView f14348j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    int f14349k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f14350l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    int f14351m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private j.a f14352n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    a f14353o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f14354p;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private class a extends BaseAdapter {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f14355g = -1;

        public a() {
            a();
        }

        void a() {
            g gVarX = c.this.f14347i.x();
            if (gVarX != null) {
                ArrayList arrayListB = c.this.f14347i.B();
                int size = arrayListB.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (((g) arrayListB.get(i10)) == gVarX) {
                        this.f14355g = i10;
                        return;
                    }
                }
            }
            this.f14355g = -1;
        }

        @Override // android.widget.Adapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public g getItem(int i10) {
            ArrayList arrayListB = c.this.f14347i.B();
            int i11 = i10 + c.this.f14349k;
            int i12 = this.f14355g;
            if (i12 >= 0 && i11 >= i12) {
                i11++;
            }
            return (g) arrayListB.get(i11);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = c.this.f14347i.B().size() - c.this.f14349k;
            return this.f14355g < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            if (view == null) {
                c cVar = c.this;
                view = cVar.f14346h.inflate(cVar.f14351m, viewGroup, false);
            }
            ((k.a) view).d(getItem(i10), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public c(Context context, int i10) {
        this(i10, 0);
        this.f14345g = context;
        this.f14346h = LayoutInflater.from(context);
    }

    @Override // androidx.appcompat.view.menu.j
    public void a(e eVar, boolean z10) {
        j.a aVar = this.f14352n;
        if (aVar != null) {
            aVar.a(eVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void b(boolean z10) {
        a aVar = this.f14353o;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean c() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean d(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean e(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void f(j.a aVar) {
        this.f14352n = aVar;
    }

    @Override // androidx.appcompat.view.menu.j
    public void g(Context context, e eVar) {
        if (this.f14350l != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.f14350l);
            this.f14345g = contextThemeWrapper;
            this.f14346h = LayoutInflater.from(contextThemeWrapper);
        } else if (this.f14345g != null) {
            this.f14345g = context;
            if (this.f14346h == null) {
                this.f14346h = LayoutInflater.from(context);
            }
        }
        this.f14347i = eVar;
        a aVar = this.f14353o;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public int getId() {
        return this.f14354p;
    }

    @Override // androidx.appcompat.view.menu.j
    public void h(Parcelable parcelable) {
        m((Bundle) parcelable);
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean i(m mVar) {
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        new f(mVar).d(null);
        j.a aVar = this.f14352n;
        if (aVar == null) {
            return true;
        }
        aVar.b(mVar);
        return true;
    }

    public ListAdapter j() {
        if (this.f14353o == null) {
            this.f14353o = new a();
        }
        return this.f14353o;
    }

    @Override // androidx.appcompat.view.menu.j
    public Parcelable k() {
        if (this.f14348j == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        n(bundle);
        return bundle;
    }

    public k l(ViewGroup viewGroup) {
        if (this.f14348j == null) {
            this.f14348j = (ExpandedMenuView) this.f14346h.inflate(AbstractC2574g.f26871g, viewGroup, false);
            if (this.f14353o == null) {
                this.f14353o = new a();
            }
            this.f14348j.setAdapter((ListAdapter) this.f14353o);
            this.f14348j.setOnItemClickListener(this);
        }
        return this.f14348j;
    }

    public void m(Bundle bundle) {
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f14348j.restoreHierarchyState(sparseParcelableArray);
        }
    }

    public void n(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f14348j;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        this.f14347i.P(this.f14353o.getItem(i10), this, 0);
    }

    public c(int i10, int i11) {
        this.f14351m = i10;
        this.f14350l = i11;
    }
}
