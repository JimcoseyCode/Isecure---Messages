package x1;

import com.facebook.react.uimanager.events.PointerEventHelper;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import v1.EnumC3417a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends Exception {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final StackTraceElement[] f33452m = new StackTraceElement[0];
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f33453g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private v1.f f33454h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private EnumC3417a f33455i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Class f33456j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f33457k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Exception f33458l;

    public q(String str) {
        this(str, Collections.EMPTY_LIST);
    }

    private void a(Throwable th, List list) {
        if (th instanceof q) {
            Iterator it = ((q) th).e().iterator();
            while (it.hasNext()) {
                a((Throwable) it.next(), list);
            }
        } else if (th != null) {
            list.add(th);
        }
    }

    private static void b(List list, Appendable appendable) {
        try {
            c(list, appendable);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    private static void c(List list, Appendable appendable) throws IOException {
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            appendable.append("Cause (").append(String.valueOf(i11)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th = (Throwable) list.get(i10);
            if (th instanceof q) {
                ((q) th).h(appendable);
            } else {
                d(th, appendable);
            }
            i10 = i11;
        }
    }

    private static void d(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    private void h(Appendable appendable) {
        d(this, appendable);
        b(e(), new a(appendable));
    }

    public List e() {
        return this.f33453g;
    }

    public List f() {
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        return arrayList;
    }

    public void g(String str) {
        List listF = f();
        int size = listF.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            i10 = i11;
        }
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.f33457k);
        Class cls = this.f33456j;
        String str = PointerEventHelper.POINTER_TYPE_UNKNOWN;
        sb.append(cls != null ? ", " + this.f33456j : PointerEventHelper.POINTER_TYPE_UNKNOWN);
        sb.append(this.f33455i != null ? ", " + this.f33455i : PointerEventHelper.POINTER_TYPE_UNKNOWN);
        if (this.f33454h != null) {
            str = ", " + this.f33454h;
        }
        sb.append(str);
        List<Throwable> listF = f();
        if (listF.isEmpty()) {
            return sb.toString();
        }
        if (listF.size() == 1) {
            sb.append("\nThere was 1 root cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(listF.size());
            sb.append(" root causes:");
        }
        for (Throwable th : listF) {
            sb.append('\n');
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    void i(v1.f fVar, EnumC3417a enumC3417a) {
        j(fVar, enumC3417a, null);
    }

    void j(v1.f fVar, EnumC3417a enumC3417a, Class cls) {
        this.f33454h = fVar;
        this.f33455i = enumC3417a;
        this.f33456j = cls;
    }

    public void k(Exception exc) {
        this.f33458l = exc;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    public q(String str, Throwable th) {
        this(str, Collections.singletonList(th));
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        h(printStream);
    }

    public q(String str, List list) {
        this.f33457k = str;
        setStackTrace(f33452m);
        this.f33453g = list;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        h(printWriter);
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class a implements Appendable {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Appendable f33459g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f33460h = true;

        a(Appendable appendable) {
            this.f33459g = appendable;
        }

        private CharSequence a(CharSequence charSequence) {
            return charSequence == null ? PointerEventHelper.POINTER_TYPE_UNKNOWN : charSequence;
        }

        @Override // java.lang.Appendable
        public Appendable append(char c10) throws IOException {
            if (this.f33460h) {
                this.f33460h = false;
                this.f33459g.append("  ");
            }
            this.f33460h = c10 == '\n';
            this.f33459g.append(c10);
            return this;
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence) {
            CharSequence charSequenceA = a(charSequence);
            return append(charSequenceA, 0, charSequenceA.length());
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence, int i10, int i11) throws IOException {
            CharSequence charSequenceA = a(charSequence);
            boolean z10 = false;
            if (this.f33460h) {
                this.f33460h = false;
                this.f33459g.append("  ");
            }
            if (charSequenceA.length() > 0 && charSequenceA.charAt(i11 - 1) == '\n') {
                z10 = true;
            }
            this.f33460h = z10;
            this.f33459g.append(charSequenceA, i10, i11);
            return this;
        }
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        return this;
    }
}
