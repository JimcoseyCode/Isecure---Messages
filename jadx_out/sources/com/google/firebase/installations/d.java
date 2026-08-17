package com.google.firebase.installations;

import n5.AbstractC2975j;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class d extends AbstractC2975j {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final a f24103g;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public enum a {
        BAD_CONFIG,
        UNAVAILABLE,
        TOO_MANY_REQUESTS
    }

    public d(a aVar) {
        this.f24103g = aVar;
    }

    public d(String str, a aVar) {
        super(str);
        this.f24103g = aVar;
    }
}
