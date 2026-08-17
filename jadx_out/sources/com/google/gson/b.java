package com.google.gson;

import java.lang.reflect.Field;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class b implements com.google.gson.c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f24335g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f24336h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b f24337i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final b f24338j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final b f24339k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final b f24340l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final /* synthetic */ b[] f24341m;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    enum a extends b {
        a(String str, int i10) {
            super(str, i10, null);
        }

        @Override // com.google.gson.c
        public String h(Field field) {
            return field.getName();
        }
    }

    static {
        a aVar = new a("IDENTITY", 0);
        f24335g = aVar;
        b bVar = new b("UPPER_CAMEL_CASE", 1) { // from class: com.google.gson.b.b
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.c
            public String h(Field field) {
                return b.k(field.getName());
            }
        };
        f24336h = bVar;
        b bVar2 = new b("UPPER_CAMEL_CASE_WITH_SPACES", 2) { // from class: com.google.gson.b.c
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.c
            public String h(Field field) {
                return b.k(b.j(field.getName(), " "));
            }
        };
        f24337i = bVar2;
        b bVar3 = new b("LOWER_CASE_WITH_UNDERSCORES", 3) { // from class: com.google.gson.b.d
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.c
            public String h(Field field) {
                return b.j(field.getName(), "_").toLowerCase(Locale.ENGLISH);
            }
        };
        f24338j = bVar3;
        b bVar4 = new b("LOWER_CASE_WITH_DASHES", 4) { // from class: com.google.gson.b.e
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.c
            public String h(Field field) {
                return b.j(field.getName(), "-").toLowerCase(Locale.ENGLISH);
            }
        };
        f24339k = bVar4;
        b bVar5 = new b("LOWER_CASE_WITH_DOTS", 5) { // from class: com.google.gson.b.f
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.c
            public String h(Field field) {
                return b.j(field.getName(), ".").toLowerCase(Locale.ENGLISH);
            }
        };
        f24340l = bVar5;
        f24341m = new b[]{aVar, bVar, bVar2, bVar3, bVar4, bVar5};
    }

    private b(String str, int i10) {
    }

    static String j(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (Character.isUpperCase(cCharAt) && sb.length() != 0) {
                sb.append(str2);
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }

    static String k(String str) {
        int length = str.length() - 1;
        int i10 = 0;
        while (!Character.isLetter(str.charAt(i10)) && i10 < length) {
            i10++;
        }
        char cCharAt = str.charAt(i10);
        if (Character.isUpperCase(cCharAt)) {
            return str;
        }
        char upperCase = Character.toUpperCase(cCharAt);
        if (i10 == 0) {
            return upperCase + str.substring(1);
        }
        return str.substring(0, i10) + upperCase + str.substring(i10 + 1);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f24341m.clone();
    }

    /* synthetic */ b(String str, int i10, a aVar) {
        this(str, i10);
    }
}
