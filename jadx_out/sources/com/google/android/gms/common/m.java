package com.google.android.gms.common;

import android.os.RemoteException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import r4.AbstractC3268i;
import r4.K;
import r4.y;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
abstract class m extends K {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f21291c;

    protected m(byte[] bArr) {
        AbstractC3268i.a(bArr.length == 25);
        this.f21291c = Arrays.hashCode(bArr);
    }

    protected static byte[] f(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // r4.y
    public final int a() {
        return this.f21291c;
    }

    @Override // r4.y
    public final B4.a b() {
        return B4.b.x(x());
    }

    public final boolean equals(Object obj) {
        B4.a aVarB;
        if (obj != null && (obj instanceof y)) {
            try {
                y yVar = (y) obj;
                if (yVar.a() == this.f21291c && (aVarB = yVar.b()) != null) {
                    return Arrays.equals(x(), (byte[]) B4.b.f(aVarB));
                }
                return false;
            } catch (RemoteException unused) {
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f21291c;
    }

    abstract byte[] x();
}
