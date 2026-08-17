package com.facebook.imageutils;

import com.facebook.react.uimanager.events.PointerEventHelper;
import i7.z;
import j7.AbstractC2793j;
import j7.J;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ%\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\tJ%\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\tJ#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\tJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0019\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u0018J\u0013\u0010\u001b\u001a\u00020\u0007*\u00020\u0004H\u0002¢\u0006\u0004\b\u001b\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/facebook/imageutils/WebpUtil;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "Ljava/io/InputStream;", "stream", "Lkotlin/Pair;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getSize", "(Ljava/io/InputStream;)Lkotlin/Pair;", "e", "f", "g", PointerEventHelper.POINTER_TYPE_UNKNOWN, "what", PointerEventHelper.POINTER_TYPE_UNKNOWN, "with", PointerEventHelper.POINTER_TYPE_UNKNOWN, "a", "([BLjava/lang/String;)Z", "header", "b", "([B)Ljava/lang/String;", "c", "(Ljava/io/InputStream;)I", "get2BytesAsInt", "h", "d", "imagepipeline-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WebpUtil {
    public static final WebpUtil INSTANCE = new WebpUtil();

    private WebpUtil() {
    }

    private final boolean a(byte[] what, String with) {
        if (what.length != with.length()) {
            return false;
        }
        Iterable iterableH = AbstractC2793j.H(what);
        if ((iterableH instanceof Collection) && ((Collection) iterableH).isEmpty()) {
            return true;
        }
        Iterator it = iterableH.iterator();
        while (it.hasNext()) {
            int iNextInt = ((J) it).nextInt();
            if (((byte) with.charAt(iNextInt)) != what[iNextInt]) {
                return false;
            }
        }
        return true;
    }

    private final String b(byte[] header) {
        StringBuilder sb = new StringBuilder();
        for (byte b10 : header) {
            sb.append((char) (z.j(b10) & 65535));
        }
        String string = sb.toString();
        AbstractC2855l.f(string, "toString(...)");
        return string;
    }

    private final int c(InputStream stream) {
        int iD = d(stream);
        int iD2 = d(stream);
        return (d(stream) << 24) | (d(stream) << 16) | (iD2 << 8) | iD;
    }

    private final int d(InputStream inputStream) {
        return inputStream.read() & 255;
    }

    private final Pair e(InputStream stream) throws IOException {
        stream.skip(7L);
        int iD = d(stream);
        int iD2 = d(stream);
        int iD3 = d(stream);
        if (iD == 157 && iD2 == 1 && iD3 == 42) {
            return new Pair(Integer.valueOf(get2BytesAsInt(stream)), Integer.valueOf(get2BytesAsInt(stream)));
        }
        return null;
    }

    private final Pair f(InputStream stream) throws IOException {
        c(stream);
        if (d(stream) != 47) {
            return null;
        }
        int i10 = stream.read() & 255;
        int i11 = stream.read();
        return new Pair(Integer.valueOf((i10 | ((i11 & 63) << 8)) + 1), Integer.valueOf((((stream.read() & 15) << 10) | ((stream.read() & 255) << 2) | ((i11 & JfifUtil.MARKER_SOFn) >> 6)) + 1));
    }

    private final Pair g(InputStream stream) throws IOException {
        stream.skip(8L);
        return new Pair(Integer.valueOf(h(stream) + 1), Integer.valueOf(h(stream) + 1));
    }

    public static final int get2BytesAsInt(InputStream stream) throws IOException {
        AbstractC2855l.g(stream, "stream");
        WebpUtil webpUtil = INSTANCE;
        return (webpUtil.d(stream) << 8) | webpUtil.d(stream);
    }

    public static final Pair<Integer, Integer> getSize(InputStream stream) {
        WebpUtil webpUtil;
        Pair<Integer, Integer> pairE;
        AbstractC2855l.g(stream, "stream");
        byte[] bArr = new byte[4];
        try {
            try {
                stream.read(bArr);
                webpUtil = INSTANCE;
            } catch (IOException e10) {
                e10.printStackTrace();
            }
            if (webpUtil.a(bArr, "RIFF")) {
                webpUtil.c(stream);
                stream.read(bArr);
                if (webpUtil.a(bArr, "WEBP")) {
                    stream.read(bArr);
                    String strB = webpUtil.b(bArr);
                    int iHashCode = strB.hashCode();
                    if (iHashCode == 2640674) {
                        if (strB.equals("VP8 ")) {
                            pairE = webpUtil.e(stream);
                            stream.close();
                            return pairE;
                        }
                        stream.close();
                        return null;
                    }
                    if (iHashCode == 2640718) {
                        if (!strB.equals("VP8L")) {
                            stream.close();
                            return null;
                        }
                        pairE = webpUtil.f(stream);
                        stream.close();
                        return pairE;
                    }
                    if (iHashCode != 2640730 || !strB.equals("VP8X")) {
                        try {
                            stream.close();
                        } catch (IOException e11) {
                            e11.printStackTrace();
                        }
                        return null;
                    }
                    pairE = webpUtil.g(stream);
                    try {
                        stream.close();
                        return pairE;
                    } catch (IOException e12) {
                        e12.printStackTrace();
                        return pairE;
                    }
                }
            }
            try {
                return null;
            } catch (IOException e13) {
                return null;
            }
        } finally {
            try {
                stream.close();
            } catch (IOException e132) {
                e132.printStackTrace();
            }
        }
    }

    private final int h(InputStream stream) {
        return (d(stream) << 16) | (d(stream) << 8) | d(stream);
    }
}
