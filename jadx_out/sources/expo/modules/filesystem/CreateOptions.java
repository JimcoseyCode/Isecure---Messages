package expo.modules.filesystem;

import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.records.Field;
import expo.modules.kotlin.records.Record;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bR\u001c\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, d2 = {"Lexpo/modules/filesystem/CreateOptions;", "Lexpo/modules/kotlin/records/Record;", "intermediates", PointerEventHelper.POINTER_TYPE_UNKNOWN, "overwrite", "idempotent", "<init>", "(ZZZ)V", "getIntermediates$annotations", "()V", "getIntermediates", "()Z", "getOverwrite$annotations", "getOverwrite", "getIdempotent$annotations", "getIdempotent", "component1", "component2", "component3", "copy", "equals", "other", PointerEventHelper.POINTER_TYPE_UNKNOWN, "hashCode", PointerEventHelper.POINTER_TYPE_UNKNOWN, "toString", PointerEventHelper.POINTER_TYPE_UNKNOWN, "expo-file-system_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class CreateOptions implements Record {
    private final boolean idempotent;
    private final boolean intermediates;
    private final boolean overwrite;

    public CreateOptions() {
        this(false, false, false, 7, null);
    }

    public static /* synthetic */ CreateOptions copy$default(CreateOptions createOptions, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = createOptions.intermediates;
        }
        if ((i10 & 2) != 0) {
            z11 = createOptions.overwrite;
        }
        if ((i10 & 4) != 0) {
            z12 = createOptions.idempotent;
        }
        return createOptions.copy(z10, z11, z12);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIntermediates() {
        return this.intermediates;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getOverwrite() {
        return this.overwrite;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIdempotent() {
        return this.idempotent;
    }

    public final CreateOptions copy(boolean intermediates, boolean overwrite, boolean idempotent) {
        return new CreateOptions(intermediates, overwrite, idempotent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateOptions)) {
            return false;
        }
        CreateOptions createOptions = (CreateOptions) other;
        return this.intermediates == createOptions.intermediates && this.overwrite == createOptions.overwrite && this.idempotent == createOptions.idempotent;
    }

    public final boolean getIdempotent() {
        return this.idempotent;
    }

    public final boolean getIntermediates() {
        return this.intermediates;
    }

    public final boolean getOverwrite() {
        return this.overwrite;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.intermediates) * 31) + Boolean.hashCode(this.overwrite)) * 31) + Boolean.hashCode(this.idempotent);
    }

    public String toString() {
        return "CreateOptions(intermediates=" + this.intermediates + ", overwrite=" + this.overwrite + ", idempotent=" + this.idempotent + ")";
    }

    public CreateOptions(boolean z10, boolean z11, boolean z12) {
        this.intermediates = z10;
        this.overwrite = z11;
        this.idempotent = z12;
    }

    public /* synthetic */ CreateOptions(boolean z10, boolean z11, boolean z12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? false : z12);
    }

    @Field
    public static /* synthetic */ void getIdempotent$annotations() {
    }

    @Field
    public static /* synthetic */ void getIntermediates$annotations() {
    }

    @Field
    public static /* synthetic */ void getOverwrite$annotations() {
    }
}
