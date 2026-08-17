package com.google.firebase.messaging;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class Y extends Exception {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f24197g;

    Y(String str) {
        super(str);
        this.f24197g = a(str);
    }

    private int a(String str) {
        if (str == null) {
            return 0;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        lowerCase.getClass();
        switch (lowerCase) {
        }
        return 0;
    }
}
