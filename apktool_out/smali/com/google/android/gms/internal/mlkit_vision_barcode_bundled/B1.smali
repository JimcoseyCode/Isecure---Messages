.class final Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/B1;
.super Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/h0;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field final g:Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/G1;

.field h:Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/k0;

.field final synthetic i:Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/I1;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/I1;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/B1;->i:Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/I1;

    .line 2
    .line 3
    invoke-direct {p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/h0;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/G1;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-direct {v0, p1, v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/G1;-><init>(Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/o0;Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/F1;)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/B1;->g:Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/G1;

    .line 13
    .line 14
    invoke-direct {p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/B1;->b()Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/k0;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/B1;->h:Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/k0;

    .line 19
    .line 20
    return-void
.end method

.method private final b()Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/k0;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/B1;->g:Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/G1;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/G1;->hasNext()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/G1;->b()Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/m0;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/o0;->C()Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/k0;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    return-object v0
.end method


# virtual methods
.method public final hasNext()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/B1;->h:Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/k0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method public final zza()B
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/B1;->h:Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/k0;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/k0;->zza()B

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/B1;->h:Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/k0;

    .line 10
    .line 11
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    invoke-direct {p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/B1;->b()Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/k0;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iput-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/B1;->h:Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/k0;

    .line 22
    .line 23
    :cond_0
    return v0

    .line 24
    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 25
    .line 26
    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 27
    .line 28
    .line 29
    throw v0
.end method
