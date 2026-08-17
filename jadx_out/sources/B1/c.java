package B1;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class c implements v1.d {
    @Override // v1.d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean b(ByteBuffer byteBuffer, File file, v1.h hVar) throws Throwable {
        try {
            Q1.a.f(byteBuffer, file);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }
}
