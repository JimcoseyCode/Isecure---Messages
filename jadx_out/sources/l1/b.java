package L1;

import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f7212a = new ArrayList();

    public synchronized void a(ImageHeaderParser imageHeaderParser) {
        this.f7212a.add(imageHeaderParser);
    }

    public synchronized List b() {
        return this.f7212a;
    }
}
