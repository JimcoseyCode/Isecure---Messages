package R7;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;
import v7.AbstractC3430a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class k {
    public static final C1395g a(Annotation[] annotationArr, k8.c fqName) {
        Annotation annotation;
        AbstractC2855l.g(annotationArr, "<this>");
        AbstractC2855l.g(fqName, "fqName");
        int length = annotationArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                annotation = null;
                break;
            }
            annotation = annotationArr[i10];
            if (AbstractC2855l.b(AbstractC1394f.e(AbstractC3430a.b(AbstractC3430a.a(annotation))).a(), fqName)) {
                break;
            }
            i10++;
        }
        if (annotation != null) {
            return new C1395g(annotation);
        }
        return null;
    }

    public static final List b(Annotation[] annotationArr) {
        AbstractC2855l.g(annotationArr, "<this>");
        ArrayList arrayList = new ArrayList(annotationArr.length);
        for (Annotation annotation : annotationArr) {
            arrayList.add(new C1395g(annotation));
        }
        return arrayList;
    }
}
