package M3;

import com.github.penfeizhou.animation.gif.io.GifReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class l extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List f7485a = new ArrayList();

    @Override // M3.b
    public void a(GifReader gifReader) throws IOException {
        gifReader.peek();
        gifReader.readUInt16();
        gifReader.readUInt16();
        gifReader.readUInt16();
        gifReader.readUInt16();
        gifReader.peek();
        gifReader.peek();
        gifReader.peek();
        gifReader.peek();
        while (true) {
            e eVarC = e.c(gifReader);
            if (eVarC.b()) {
                return;
            } else {
                this.f7485a.add(eVarC);
            }
        }
    }
}
