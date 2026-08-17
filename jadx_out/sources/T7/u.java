package t7;

import i7.C2735B;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class u {
    public static final long a(Reader reader, Writer out, int i10) throws IOException {
        AbstractC2855l.g(reader, "<this>");
        AbstractC2855l.g(out, "out");
        char[] cArr = new char[i10];
        int i11 = reader.read(cArr);
        long j10 = 0;
        while (i11 >= 0) {
            out.write(cArr, 0, i11);
            j10 += (long) i11;
            i11 = reader.read(cArr);
        }
        return j10;
    }

    public static /* synthetic */ long b(Reader reader, Writer writer, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 8192;
        }
        return a(reader, writer, i10);
    }

    public static final void c(Reader reader, Function1 action) throws IOException {
        AbstractC2855l.g(reader, "<this>");
        AbstractC2855l.g(action, "action");
        BufferedReader bufferedReader = reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, 8192);
        try {
            Iterator it = d(bufferedReader).iterator();
            while (it.hasNext()) {
                action.invoke(it.next());
            }
            C2735B c2735b = C2735B.f28704a;
            AbstractC3376c.a(bufferedReader, null);
        } finally {
        }
    }

    public static final O8.i d(BufferedReader bufferedReader) {
        AbstractC2855l.g(bufferedReader, "<this>");
        return O8.l.h(new q(bufferedReader));
    }

    public static final String e(Reader reader) {
        AbstractC2855l.g(reader, "<this>");
        StringWriter stringWriter = new StringWriter();
        b(reader, stringWriter, 0, 2, null);
        String string = stringWriter.toString();
        AbstractC2855l.f(string, "toString(...)");
        return string;
    }
}
