package m2;

/* JADX INFO: renamed from: m2.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2895b implements e {
    @Override // m2.e
    public void onFailure(c cVar) {
        try {
            onFailureImpl(cVar);
        } finally {
            cVar.close();
        }
    }

    protected abstract void onFailureImpl(c cVar);

    @Override // m2.e
    public void onNewResult(c cVar) {
        boolean zIsFinished = cVar.isFinished();
        try {
            onNewResultImpl(cVar);
        } finally {
            if (zIsFinished) {
                cVar.close();
            }
        }
    }

    protected abstract void onNewResultImpl(c cVar);

    @Override // m2.e
    public void onCancellation(c cVar) {
    }

    @Override // m2.e
    public void onProgressUpdate(c cVar) {
    }
}
