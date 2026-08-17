package android.support.v4.os;

import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.os.a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final boolean f13768g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Handler f13769h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    android.support.v4.os.a f13770i;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ResultReceiver createFromParcel(Parcel parcel) {
            return new ResultReceiver(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ResultReceiver[] newArray(int i10) {
            return new ResultReceiver[i10];
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b extends a.AbstractBinderC0142a {
        b() {
        }

        @Override // android.support.v4.os.a
        public void w(int i10, Bundle bundle) {
            ResultReceiver resultReceiver = ResultReceiver.this;
            Handler handler = resultReceiver.f13769h;
            if (handler != null) {
                handler.post(resultReceiver.new c(i10, bundle));
            } else {
                resultReceiver.a(i10, bundle);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class c implements Runnable {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final int f13772g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final Bundle f13773h;

        c(int i10, Bundle bundle) {
            this.f13772g = i10;
            this.f13773h = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            ResultReceiver.this.a(this.f13772g, this.f13773h);
        }
    }

    ResultReceiver(Parcel parcel) {
        this.f13770i = a.AbstractBinderC0142a.c(parcel.readStrongBinder());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        synchronized (this) {
            try {
                if (this.f13770i == null) {
                    this.f13770i = new b();
                }
                parcel.writeStrongBinder(this.f13770i.asBinder());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected void a(int i10, Bundle bundle) {
    }
}
