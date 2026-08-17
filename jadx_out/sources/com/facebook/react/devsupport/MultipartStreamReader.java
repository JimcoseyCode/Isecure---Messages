package com.facebook.react.devsupport;

import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.notifications.notifications.presentation.builders.ExpoNotificationBuilder;
import j7.AbstractC2800q;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import t9.C3391h;
import t9.k;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\r\b\u0000\u0018\u0000 !2\u00020\u0001:\u0002\"!B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J?\u0010\u0019\u001a\u00020\u00122\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\n2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u0016\u0010\u001f\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lcom/facebook/react/devsupport/MultipartStreamReader;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lt9/j;", "source", PointerEventHelper.POINTER_TYPE_UNKNOWN, "boundary", "<init>", "(Lt9/j;Ljava/lang/String;)V", "Lt9/h;", "data", PointerEventHelper.POINTER_TYPE_UNKNOWN, "parseHeaders", "(Lt9/h;)Ljava/util/Map;", "chunk", PointerEventHelper.POINTER_TYPE_UNKNOWN, "done", "Lcom/facebook/react/devsupport/MultipartStreamReader$ChunkListener;", "listener", "Li7/B;", "emitChunk", "(Lt9/h;ZLcom/facebook/react/devsupport/MultipartStreamReader$ChunkListener;)V", "headers", PointerEventHelper.POINTER_TYPE_UNKNOWN, "contentLength", "isFinal", "emitProgress", "(Ljava/util/Map;JZLcom/facebook/react/devsupport/MultipartStreamReader$ChunkListener;)V", "readAllParts", "(Lcom/facebook/react/devsupport/MultipartStreamReader$ChunkListener;)Z", "Lt9/j;", "Ljava/lang/String;", "lastProgressEvent", "J", "Companion", "ChunkListener", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MultipartStreamReader {
    private static final String CRLF = "\r\n";
    private final String boundary;
    private long lastProgressEvent;
    private final t9.j source;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J3\u0010\n\u001a\u00020\t2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ3\u0010\u000f\u001a\u00020\t2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH&¢\u0006\u0004\b\u000f\u0010\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Lcom/facebook/react/devsupport/MultipartStreamReader$ChunkListener;", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "headers", "Lt9/h;", ExpoNotificationBuilder.EXTRAS_BODY_KEY, PointerEventHelper.POINTER_TYPE_UNKNOWN, "isLastChunk", "Li7/B;", "onChunkComplete", "(Ljava/util/Map;Lt9/h;Z)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "loaded", "total", "onChunkProgress", "(Ljava/util/Map;JJ)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ChunkListener {
        void onChunkComplete(Map<String, String> headers, C3391h body, boolean isLastChunk) throws IOException;

        void onChunkProgress(Map<String, String> headers, long loaded, long total) throws IOException;
    }

    public MultipartStreamReader(t9.j source, String boundary) {
        AbstractC2855l.g(source, "source");
        AbstractC2855l.g(boundary, "boundary");
        this.source = source;
        this.boundary = boundary;
    }

    private final void emitChunk(C3391h chunk, boolean done, ChunkListener listener) throws IOException {
        long jD0 = chunk.d0(t9.k.f32603j.b("\r\n\r\n"));
        if (jD0 == -1) {
            listener.onChunkComplete(j7.K.i(), chunk, done);
            return;
        }
        C3391h c3391h = new C3391h();
        C3391h c3391h2 = new C3391h();
        chunk.read(c3391h, jD0);
        chunk.skip(r0.h());
        chunk.r0(c3391h2);
        listener.onChunkComplete(parseHeaders(c3391h), c3391h2, done);
    }

    private final void emitProgress(Map<String, String> headers, long contentLength, boolean isFinal, ChunkListener listener) throws IOException {
        if (listener == null || headers == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.lastProgressEvent > 16 || isFinal) {
            this.lastProgressEvent = jCurrentTimeMillis;
            listener.onChunkProgress(headers, contentLength, Long.parseLong(headers.getOrDefault("Content-Length", "0")));
        }
    }

    private final Map<String, String> parseHeaders(C3391h data) {
        List listJ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List listF = new P8.o(CRLF).f(data.q0(), 0);
        if (listF.isEmpty()) {
            listJ = AbstractC2800q.j();
        } else {
            ListIterator listIterator = listF.listIterator(listF.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    listJ = AbstractC2800q.I0(listF, listIterator.nextIndex() + 1);
                    break;
                }
            }
            listJ = AbstractC2800q.j();
        }
        for (String str : (String[]) listJ.toArray(new String[0])) {
            int iD0 = P8.q.d0(str, ":", 0, false, 6, null);
            if (iD0 != -1) {
                String strSubstring = str.substring(0, iD0);
                AbstractC2855l.f(strSubstring, "substring(...)");
                int length = strSubstring.length() - 1;
                int i10 = 0;
                boolean z10 = false;
                while (i10 <= length) {
                    boolean z11 = AbstractC2855l.i(strSubstring.charAt(!z10 ? i10 : length), 32) <= 0;
                    if (z10) {
                        if (!z11) {
                            break;
                        }
                        length--;
                    } else if (z11) {
                        i10++;
                    } else {
                        z10 = true;
                    }
                }
                String string = strSubstring.subSequence(i10, length + 1).toString();
                String strSubstring2 = str.substring(iD0 + 1);
                AbstractC2855l.f(strSubstring2, "substring(...)");
                int length2 = strSubstring2.length() - 1;
                int i11 = 0;
                boolean z12 = false;
                while (i11 <= length2) {
                    boolean z13 = AbstractC2855l.i(strSubstring2.charAt(!z12 ? i11 : length2), 32) <= 0;
                    if (z12) {
                        if (!z13) {
                            break;
                        }
                        length2--;
                    } else if (z13) {
                        i11++;
                    } else {
                        z12 = true;
                    }
                }
                linkedHashMap.put(string, strSubstring2.subSequence(i11, length2 + 1).toString());
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cb A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean readAllParts(ChunkListener listener) throws IOException {
        boolean z10;
        long j10;
        Map<String, String> map;
        ChunkListener listener2 = listener;
        AbstractC2855l.g(listener2, "listener");
        k.a aVar = t9.k.f32603j;
        t9.k kVarB = aVar.b("\r\n--" + this.boundary + CRLF);
        t9.k kVarB2 = aVar.b("\r\n--" + this.boundary + "--\r\n");
        t9.k kVarB3 = aVar.b("\r\n\r\n");
        C3391h c3391h = new C3391h();
        Map<String, String> headers = null;
        long j11 = 0;
        long jH = 0;
        long jH2 = 0;
        while (true) {
            long jMax = (long) Math.max(j11 - ((long) kVarB2.h()), jH);
            long jG0 = c3391h.g0(kVarB, jMax);
            if (jG0 == -1) {
                jG0 = c3391h.g0(kVarB2, jMax);
                z10 = true;
            } else {
                z10 = false;
            }
            if (jG0 == -1) {
                long jE = c3391h.e();
                if (headers == null) {
                    long jG02 = c3391h.g0(kVarB3, jMax);
                    if (jG02 >= 0) {
                        this.source.read(c3391h, jG02);
                        C3391h c3391h2 = new C3391h();
                        c3391h.B(c3391h2, jMax, jG02 - jMax);
                        jH2 = ((long) kVarB3.h()) + c3391h2.e();
                        headers = parseHeaders(c3391h2);
                        j10 = jH;
                        if (this.source.read(c3391h, 4096) > 0) {
                            return false;
                        }
                        listener2 = listener;
                        jH = j10;
                        j11 = jE;
                    } else {
                        j10 = jH;
                        map = headers;
                    }
                } else {
                    j10 = jH;
                    map = headers;
                    emitProgress(map, c3391h.e() - jH2, false, listener2);
                }
                headers = map;
                if (this.source.read(c3391h, 4096) > 0) {
                }
            } else {
                long j12 = jH;
                Map<String, String> map2 = headers;
                long j13 = jG0 - j12;
                if (j12 > 0) {
                    C3391h c3391h3 = new C3391h();
                    c3391h.skip(j12);
                    c3391h.read(c3391h3, j13);
                    listener2 = listener;
                    emitProgress(map2, c3391h3.e() - jH2, true, listener2);
                    emitChunk(c3391h3, z10, listener2);
                    headers = null;
                    jH2 = 0;
                } else {
                    listener2 = listener;
                    c3391h.skip(jG0);
                    headers = map2;
                }
                if (z10) {
                    return true;
                }
                jH = kVarB.h();
                j11 = jH;
            }
        }
    }
}
