package t7;

import P8.C1385d;
import i7.C2735B;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class m extends k {
    public static void d(File file, String text, Charset charset) throws IOException {
        AbstractC2855l.g(file, "<this>");
        AbstractC2855l.g(text, "text");
        AbstractC2855l.g(charset, "charset");
        FileOutputStream fileOutputStream = new FileOutputStream(file, true);
        try {
            n(fileOutputStream, text, charset);
            C2735B c2735b = C2735B.f28704a;
            AbstractC3376c.a(fileOutputStream, null);
        } finally {
        }
    }

    public static final ByteBuffer e(int i10, CharsetEncoder encoder) {
        AbstractC2855l.g(encoder, "encoder");
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i10 * ((int) Math.ceil(encoder.maxBytesPerChar())));
        AbstractC2855l.f(byteBufferAllocate, "allocate(...)");
        return byteBufferAllocate;
    }

    public static final void f(File file, Charset charset, Function1 action) throws IOException {
        AbstractC2855l.g(file, "<this>");
        AbstractC2855l.g(charset, "charset");
        AbstractC2855l.g(action, "action");
        u.c(new BufferedReader(new InputStreamReader(new FileInputStream(file), charset)), action);
    }

    public static final CharsetEncoder g(Charset charset) {
        AbstractC2855l.g(charset, "<this>");
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        return charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
    }

    public static List h(File file, Charset charset) throws IOException {
        AbstractC2855l.g(file, "<this>");
        AbstractC2855l.g(charset, "charset");
        final ArrayList arrayList = new ArrayList();
        f(file, charset, new Function1() { // from class: t7.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return m.i(arrayList, (String) obj);
            }
        });
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B i(ArrayList arrayList, String it) {
        AbstractC2855l.g(it, "it");
        arrayList.add(it);
        return C2735B.f28704a;
    }

    public static final String j(File file, Charset charset) throws IOException {
        AbstractC2855l.g(file, "<this>");
        AbstractC2855l.g(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String strE = u.e(inputStreamReader);
            AbstractC3376c.a(inputStreamReader, null);
            return strE;
        } finally {
        }
    }

    public static /* synthetic */ String k(File file, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = C1385d.f8858b;
        }
        return j(file, charset);
    }

    public static void l(File file, String text, Charset charset) throws IOException {
        AbstractC2855l.g(file, "<this>");
        AbstractC2855l.g(text, "text");
        AbstractC2855l.g(charset, "charset");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            n(fileOutputStream, text, charset);
            C2735B c2735b = C2735B.f28704a;
            AbstractC3376c.a(fileOutputStream, null);
        } finally {
        }
    }

    public static /* synthetic */ void m(File file, String str, Charset charset, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            charset = C1385d.f8858b;
        }
        l(file, str, charset);
    }

    public static final void n(OutputStream outputStream, String text, Charset charset) throws IOException {
        AbstractC2855l.g(outputStream, "<this>");
        AbstractC2855l.g(text, "text");
        AbstractC2855l.g(charset, "charset");
        if (text.length() < 16384) {
            byte[] bytes = text.getBytes(charset);
            AbstractC2855l.f(bytes, "getBytes(...)");
            outputStream.write(bytes);
            return;
        }
        CharsetEncoder charsetEncoderG = g(charset);
        CharBuffer charBufferAllocate = CharBuffer.allocate(8192);
        AbstractC2855l.d(charsetEncoderG);
        ByteBuffer byteBufferE = e(8192, charsetEncoderG);
        int i10 = 0;
        int i11 = 0;
        while (i10 < text.length()) {
            int iMin = Math.min(8192 - i11, text.length() - i10);
            int i12 = i10 + iMin;
            char[] cArrArray = charBufferAllocate.array();
            AbstractC2855l.f(cArrArray, "array(...)");
            text.getChars(i10, i12, cArrArray, i11);
            charBufferAllocate.limit(iMin + i11);
            i11 = 1;
            if (!charsetEncoderG.encode(charBufferAllocate, byteBufferE, i12 == text.length()).isUnderflow()) {
                throw new IllegalStateException("Check failed.");
            }
            outputStream.write(byteBufferE.array(), 0, byteBufferE.position());
            if (charBufferAllocate.position() != charBufferAllocate.limit()) {
                charBufferAllocate.put(0, charBufferAllocate.get());
            } else {
                i11 = 0;
            }
            charBufferAllocate.clear();
            byteBufferE.clear();
            i10 = i12;
        }
    }
}
