package W0;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f11912a;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final TextView f11913a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final d f11914b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f11915c = true;

        a(TextView textView) {
            this.f11913a = textView;
            this.f11914b = new d(textView);
        }

        private InputFilter[] f(InputFilter[] inputFilterArr) {
            int length = inputFilterArr.length;
            for (InputFilter inputFilter : inputFilterArr) {
                if (inputFilter == this.f11914b) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
            inputFilterArr2[length] = this.f11914b;
            return inputFilterArr2;
        }

        private SparseArray g(InputFilter[] inputFilterArr) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i10 = 0; i10 < inputFilterArr.length; i10++) {
                InputFilter inputFilter = inputFilterArr[i10];
                if (inputFilter instanceof d) {
                    sparseArray.put(i10, inputFilter);
                }
            }
            return sparseArray;
        }

        private InputFilter[] h(InputFilter[] inputFilterArr) {
            SparseArray sparseArrayG = g(inputFilterArr);
            if (sparseArrayG.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArrayG.size()];
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                if (sparseArrayG.indexOfKey(i11) < 0) {
                    inputFilterArr2[i10] = inputFilterArr[i11];
                    i10++;
                }
            }
            return inputFilterArr2;
        }

        private TransformationMethod j(TransformationMethod transformationMethod) {
            return transformationMethod instanceof h ? ((h) transformationMethod).a() : transformationMethod;
        }

        private void k() {
            this.f11913a.setFilters(a(this.f11913a.getFilters()));
        }

        private TransformationMethod m(TransformationMethod transformationMethod) {
            return ((transformationMethod instanceof h) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new h(transformationMethod);
        }

        @Override // W0.f.b
        InputFilter[] a(InputFilter[] inputFilterArr) {
            return !this.f11915c ? h(inputFilterArr) : f(inputFilterArr);
        }

        @Override // W0.f.b
        public boolean b() {
            return this.f11915c;
        }

        @Override // W0.f.b
        void c(boolean z10) {
            if (z10) {
                l();
            }
        }

        @Override // W0.f.b
        void d(boolean z10) {
            this.f11915c = z10;
            l();
            k();
        }

        @Override // W0.f.b
        TransformationMethod e(TransformationMethod transformationMethod) {
            return this.f11915c ? m(transformationMethod) : j(transformationMethod);
        }

        void i(boolean z10) {
            this.f11915c = z10;
        }

        void l() {
            this.f11913a.setTransformationMethod(e(this.f11913a.getTransformationMethod()));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class b {
        b() {
        }

        abstract InputFilter[] a(InputFilter[] inputFilterArr);

        public abstract boolean b();

        abstract void c(boolean z10);

        abstract void d(boolean z10);

        abstract TransformationMethod e(TransformationMethod transformationMethod);
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class c extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a f11916a;

        c(TextView textView) {
            this.f11916a = new a(textView);
        }

        private boolean f() {
            return !androidx.emoji2.text.f.i();
        }

        @Override // W0.f.b
        InputFilter[] a(InputFilter[] inputFilterArr) {
            return f() ? inputFilterArr : this.f11916a.a(inputFilterArr);
        }

        @Override // W0.f.b
        public boolean b() {
            return this.f11916a.b();
        }

        @Override // W0.f.b
        void c(boolean z10) {
            if (f()) {
                return;
            }
            this.f11916a.c(z10);
        }

        @Override // W0.f.b
        void d(boolean z10) {
            if (f()) {
                this.f11916a.i(z10);
            } else {
                this.f11916a.d(z10);
            }
        }

        @Override // W0.f.b
        TransformationMethod e(TransformationMethod transformationMethod) {
            return f() ? transformationMethod : this.f11916a.e(transformationMethod);
        }
    }

    public f(TextView textView, boolean z10) {
        H0.g.h(textView, "textView cannot be null");
        if (z10) {
            this.f11912a = new a(textView);
        } else {
            this.f11912a = new c(textView);
        }
    }

    public InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.f11912a.a(inputFilterArr);
    }

    public boolean b() {
        return this.f11912a.b();
    }

    public void c(boolean z10) {
        this.f11912a.c(z10);
    }

    public void d(boolean z10) {
        this.f11912a.d(z10);
    }

    public TransformationMethod e(TransformationMethod transformationMethod) {
        return this.f11912a.e(transformationMethod);
    }
}
