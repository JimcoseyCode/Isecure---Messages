package com.facebook.soloader;

import y3.InterfaceC3613b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class u implements InterfaceC3613b {
    @Override // y3.InterfaceC3613b
    public boolean a(String str, int i10) {
        return SoLoader.u(str, (i10 & 1) != 0 ? 16 : 0);
    }
}
