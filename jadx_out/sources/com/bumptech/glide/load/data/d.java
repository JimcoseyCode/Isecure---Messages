package com.bumptech.glide.load.data;

import v1.EnumC3417a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public interface d {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface a {
        void a(Exception exc);

        void c(Object obj);
    }

    void cancel();

    void cleanup();

    Class getDataClass();

    EnumC3417a getDataSource();

    void loadData(com.bumptech.glide.g gVar, a aVar);
}
