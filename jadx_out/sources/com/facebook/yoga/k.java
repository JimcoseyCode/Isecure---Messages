package com.facebook.yoga;

import com.facebook.react.uimanager.ViewDefaults;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public enum k {
    NONE(0),
    STRETCH_FLEX_BASIS(1),
    ABSOLUTE_POSITION_WITHOUT_INSETS_EXCLUDES_PADDING(2),
    ABSOLUTE_PERCENT_AGAINST_INNER_SIZE(4),
    ALL(ViewDefaults.NUMBER_OF_LINES),
    CLASSIC(2147483646);


    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f20798g;

    k(int i10) {
        this.f20798g = i10;
    }

    public int j() {
        return this.f20798g;
    }
}
