package D4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements IInterface {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final IBinder f786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f787d;

    protected a(IBinder iBinder, String str) {
        this.f786c = iBinder;
        this.f787d = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f786c;
    }

    protected final Parcel c() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f787d);
        return parcelObtain;
    }

    protected final void d(int i10, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f786c.transact(i10, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    protected final void f(int i10, Parcel parcel) {
        try {
            this.f786c.transact(1, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
