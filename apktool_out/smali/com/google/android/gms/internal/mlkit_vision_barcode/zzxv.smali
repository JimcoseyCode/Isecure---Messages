.class public final Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxv;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxv;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final g:D

.field private final h:D


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LI4/X9;

    .line 2
    .line 3
    invoke-direct {v0}, LI4/X9;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxv;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(DD)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxv;->g:D

    .line 5
    .line 6
    iput-wide p3, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxv;->h:D

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final e()D
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxv;->g:D

    .line 2
    .line 3
    return-wide v0
.end method

.method public final s()D
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxv;->h:D

    .line 2
    .line 3
    return-wide v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    .line 1
    invoke-static {p1}, Ls4/b;->a(Landroid/os/Parcel;)I

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    const/4 v0, 0x1

    .line 6
    iget-wide v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxv;->g:D

    .line 7
    .line 8
    invoke-static {p1, v0, v1, v2}, Ls4/b;->f(Landroid/os/Parcel;ID)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x2

    .line 12
    iget-wide v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxv;->h:D

    .line 13
    .line 14
    invoke-static {p1, v0, v1, v2}, Ls4/b;->f(Landroid/os/Parcel;ID)V

    .line 15
    .line 16
    .line 17
    invoke-static {p1, p2}, Ls4/b;->b(Landroid/os/Parcel;I)V

    .line 18
    .line 19
    .line 20
    return-void
.end method
