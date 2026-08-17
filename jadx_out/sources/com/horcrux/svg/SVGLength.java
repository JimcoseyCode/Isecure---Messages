package com.horcrux.svg;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
class SVGLength {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final double f24513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final UnitType f24514b;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public enum UnitType {
        UNKNOWN,
        NUMBER,
        PERCENTAGE,
        EMS,
        EXS,
        PX,
        CM,
        MM,
        IN,
        PT,
        PC
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f24515a;

        static {
            int[] iArr = new int[ReadableType.values().length];
            f24515a = iArr;
            try {
                iArr[ReadableType.Number.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24515a[ReadableType.String.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24515a[ReadableType.Array.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private SVGLength() {
        this.f24513a = 0.0d;
        this.f24514b = UnitType.UNKNOWN;
    }

    static ArrayList a(Dynamic dynamic) {
        int i10 = a.f24515a[dynamic.getType().ordinal()];
        if (i10 == 1) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(new SVGLength(dynamic.asDouble()));
            return arrayList;
        }
        int i11 = 0;
        if (i10 == 2) {
            String[] strArrSplit = dynamic.asString().trim().replaceAll(",", " ").split(" ");
            ArrayList arrayList2 = new ArrayList(strArrSplit.length);
            int length = strArrSplit.length;
            while (i11 < length) {
                arrayList2.add(new SVGLength(strArrSplit[i11]));
                i11++;
            }
            return arrayList2;
        }
        if (i10 != 3) {
            return null;
        }
        ReadableArray readableArrayAsArray = dynamic.asArray();
        int size = readableArrayAsArray.size();
        ArrayList arrayList3 = new ArrayList(size);
        while (i11 < size) {
            arrayList3.add(b(readableArrayAsArray.getDynamic(i11)));
            i11++;
        }
        return arrayList3;
    }

    static SVGLength b(Dynamic dynamic) {
        int i10 = a.f24515a[dynamic.getType().ordinal()];
        return i10 != 1 ? i10 != 2 ? new SVGLength() : new SVGLength(dynamic.asString()) : new SVGLength(dynamic.asDouble());
    }

    static String c(Dynamic dynamic) {
        int i10 = a.f24515a[dynamic.getType().ordinal()];
        if (i10 == 1) {
            return String.valueOf(dynamic.asDouble());
        }
        if (i10 != 2) {
            return null;
        }
        return dynamic.asString();
    }

    SVGLength(double d10) {
        this.f24513a = d10;
        this.f24514b = UnitType.NUMBER;
    }

    SVGLength(String str) {
        String strTrim = str.trim();
        int length = strTrim.length();
        int i10 = length - 1;
        if (length != 0 && !strTrim.equals("normal")) {
            if (strTrim.codePointAt(i10) == 37) {
                this.f24514b = UnitType.PERCENTAGE;
                this.f24513a = Double.valueOf(strTrim.substring(0, i10)).doubleValue();
                return;
            }
            int i11 = length - 2;
            if (i11 > 0) {
                String strSubstring = strTrim.substring(i11);
                strSubstring.getClass();
                switch (strSubstring) {
                    case "cm":
                        this.f24514b = UnitType.CM;
                        length = i11;
                        break;
                    case "em":
                        this.f24514b = UnitType.EMS;
                        length = i11;
                        break;
                    case "ex":
                        this.f24514b = UnitType.EXS;
                        length = i11;
                        break;
                    case "in":
                        this.f24514b = UnitType.IN;
                        length = i11;
                        break;
                    case "mm":
                        this.f24514b = UnitType.MM;
                        length = i11;
                        break;
                    case "pc":
                        this.f24514b = UnitType.PC;
                        length = i11;
                        break;
                    case "pt":
                        this.f24514b = UnitType.PT;
                        length = i11;
                        break;
                    case "px":
                        this.f24514b = UnitType.NUMBER;
                        length = i11;
                        break;
                    default:
                        this.f24514b = UnitType.NUMBER;
                        break;
                }
                this.f24513a = Double.valueOf(strTrim.substring(0, length)).doubleValue();
                return;
            }
            this.f24514b = UnitType.NUMBER;
            this.f24513a = Double.valueOf(strTrim).doubleValue();
            return;
        }
        this.f24514b = UnitType.UNKNOWN;
        this.f24513a = 0.0d;
    }
}
