package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.react.views.progressbar.ProgressBarContainerView;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import s4.AbstractC3325b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class DataHolder extends AbstractSafeParcelable implements Closeable {
    public static final Parcelable.Creator<DataHolder> CREATOR = new c();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final a f21124q = new b(new String[0], null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final int f21125g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String[] f21126h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    Bundle f21127i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final CursorWindow[] f21128j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f21129k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Bundle f21130l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    int[] f21131m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f21132n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    boolean f21133o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f21134p = true;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String[] f21135a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList f21136b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final HashMap f21137c = new HashMap();
    }

    DataHolder(int i10, String[] strArr, CursorWindow[] cursorWindowArr, int i11, Bundle bundle) {
        this.f21125g = i10;
        this.f21126h = strArr;
        this.f21128j = cursorWindowArr;
        this.f21129k = i11;
        this.f21130l = bundle;
    }

    public final void X() {
        this.f21127i = new Bundle();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            String[] strArr = this.f21126h;
            if (i11 >= strArr.length) {
                break;
            }
            this.f21127i.putInt(strArr[i11], i11);
            i11++;
        }
        this.f21131m = new int[this.f21128j.length];
        int numRows = 0;
        while (true) {
            CursorWindow[] cursorWindowArr = this.f21128j;
            if (i10 >= cursorWindowArr.length) {
                this.f21132n = numRows;
                return;
            }
            this.f21131m[i10] = numRows;
            numRows += this.f21128j[i10].getNumRows() - (numRows - cursorWindowArr[i10].getStartPosition());
            i10++;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            try {
                if (!this.f21133o) {
                    this.f21133o = true;
                    int i10 = 0;
                    while (true) {
                        CursorWindow[] cursorWindowArr = this.f21128j;
                        if (i10 >= cursorWindowArr.length) {
                            break;
                        }
                        cursorWindowArr[i10].close();
                        i10++;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Bundle e() {
        return this.f21130l;
    }

    protected final void finalize() throws Throwable {
        try {
            if (this.f21134p && this.f21128j.length > 0 && !isClosed()) {
                close();
            }
        } finally {
            super.finalize();
        }
    }

    public boolean isClosed() {
        boolean z10;
        synchronized (this) {
            z10 = this.f21133o;
        }
        return z10;
    }

    public int s() {
        return this.f21129k;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String[] strArr = this.f21126h;
        int iA = AbstractC3325b.a(parcel);
        AbstractC3325b.q(parcel, 1, strArr, false);
        AbstractC3325b.s(parcel, 2, this.f21128j, i10, false);
        AbstractC3325b.j(parcel, 3, s());
        AbstractC3325b.d(parcel, 4, e(), false);
        AbstractC3325b.j(parcel, ProgressBarContainerView.MAX_PROGRESS, this.f21125g);
        AbstractC3325b.b(parcel, iA);
        if ((i10 & 1) != 0) {
            close();
        }
    }
}
