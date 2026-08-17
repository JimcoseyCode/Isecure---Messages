package K0;

import K0.b;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends BaseAdapter implements Filterable, b.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected boolean f7021g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected boolean f7022h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected Cursor f7023i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected Context f7024j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected int f7025k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected C0063a f7026l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected DataSetObserver f7027m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected K0.b f7028n;

    /* JADX INFO: renamed from: K0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private class C0063a extends ContentObserver {
        C0063a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10) {
            a.this.h();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private class b extends DataSetObserver {
        b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            a aVar = a.this;
            aVar.f7021g = true;
            aVar.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            a aVar = a.this;
            aVar.f7021g = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public a(Context context, Cursor cursor, boolean z10) {
        e(context, cursor, z10 ? 1 : 2);
    }

    @Override // K0.b.a
    public void a(Cursor cursor) {
        Cursor cursorI = i(cursor);
        if (cursorI != null) {
            cursorI.close();
        }
    }

    @Override // K0.b.a
    public Cursor b() {
        return this.f7023i;
    }

    @Override // K0.b.a
    public abstract CharSequence convertToString(Cursor cursor);

    public abstract void d(View view, Context context, Cursor cursor);

    void e(Context context, Cursor cursor, int i10) {
        if ((i10 & 1) == 1) {
            i10 |= 2;
            this.f7022h = true;
        } else {
            this.f7022h = false;
        }
        boolean z10 = cursor != null;
        this.f7023i = cursor;
        this.f7021g = z10;
        this.f7024j = context;
        this.f7025k = z10 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i10 & 2) == 2) {
            this.f7026l = new C0063a();
            this.f7027m = new b();
        } else {
            this.f7026l = null;
            this.f7027m = null;
        }
        if (z10) {
            C0063a c0063a = this.f7026l;
            if (c0063a != null) {
                cursor.registerContentObserver(c0063a);
            }
            DataSetObserver dataSetObserver = this.f7027m;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public abstract View f(Context context, Cursor cursor, ViewGroup viewGroup);

    public abstract View g(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f7021g || (cursor = this.f7023i) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        if (!this.f7021g) {
            return null;
        }
        this.f7023i.moveToPosition(i10);
        if (view == null) {
            view = f(this.f7024j, this.f7023i, viewGroup);
        }
        d(view, this.f7024j, this.f7023i);
        return view;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f7028n == null) {
            this.f7028n = new K0.b(this);
        }
        return this.f7028n;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i10) {
        Cursor cursor;
        if (!this.f7021g || (cursor = this.f7023i) == null) {
            return null;
        }
        cursor.moveToPosition(i10);
        return this.f7023i;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        Cursor cursor;
        if (this.f7021g && (cursor = this.f7023i) != null && cursor.moveToPosition(i10)) {
            return this.f7023i.getLong(this.f7025k);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (!this.f7021g) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (this.f7023i.moveToPosition(i10)) {
            if (view == null) {
                view = g(this.f7024j, this.f7023i, viewGroup);
            }
            d(view, this.f7024j, this.f7023i);
            return view;
        }
        throw new IllegalStateException("couldn't move cursor to position " + i10);
    }

    protected void h() {
        Cursor cursor;
        if (!this.f7022h || (cursor = this.f7023i) == null || cursor.isClosed()) {
            return;
        }
        this.f7021g = this.f7023i.requery();
    }

    public Cursor i(Cursor cursor) {
        Cursor cursor2 = this.f7023i;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C0063a c0063a = this.f7026l;
            if (c0063a != null) {
                cursor2.unregisterContentObserver(c0063a);
            }
            DataSetObserver dataSetObserver = this.f7027m;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f7023i = cursor;
        if (cursor == null) {
            this.f7025k = -1;
            this.f7021g = false;
            notifyDataSetInvalidated();
            return cursor2;
        }
        C0063a c0063a2 = this.f7026l;
        if (c0063a2 != null) {
            cursor.registerContentObserver(c0063a2);
        }
        DataSetObserver dataSetObserver2 = this.f7027m;
        if (dataSetObserver2 != null) {
            cursor.registerDataSetObserver(dataSetObserver2);
        }
        this.f7025k = cursor.getColumnIndexOrThrow("_id");
        this.f7021g = true;
        notifyDataSetChanged();
        return cursor2;
    }
}
