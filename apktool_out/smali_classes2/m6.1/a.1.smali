.class public final Lm6/a;
.super Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/P0;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/s1;


# static fields
.field private static final zzb:Lm6/a;


# instance fields
.field private zzd:I

.field private zze:Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/W0;

.field private zzf:I

.field private zzg:Ljava/lang/String;

.field private zzh:Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/o0;

.field private zzi:B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lm6/a;

    .line 2
    .line 3
    invoke-direct {v0}, Lm6/a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lm6/a;->zzb:Lm6/a;

    .line 7
    .line 8
    const-class v1, Lm6/a;

    .line 9
    .line 10
    invoke-static {v1, v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/P0;->y(Ljava/lang/Class;Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/P0;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/P0;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x2

    .line 5
    iput-byte v0, p0, Lm6/a;->zzi:B

    .line 6
    .line 7
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/P0;->s()Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/W0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Lm6/a;->zze:Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/W0;

    .line 12
    .line 13
    const-string v0, ""

    .line 14
    .line 15
    iput-object v0, p0, Lm6/a;->zzg:Ljava/lang/String;

    .line 16
    .line 17
    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/o0;->h:Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/o0;

    .line 18
    .line 19
    iput-object v0, p0, Lm6/a;->zzh:Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/o0;

    .line 20
    .line 21
    return-void
.end method

.method static synthetic F()Lm6/a;
    .locals 1

    .line 1
    sget-object v0, Lm6/a;->zzb:Lm6/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public static G([BLcom/google/android/gms/internal/mlkit_vision_barcode_bundled/A0;)Lm6/a;
    .locals 1

    .line 1
    sget-object v0, Lm6/a;->zzb:Lm6/a;

    .line 2
    .line 3
    invoke-static {v0, p0, p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/P0;->o(Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/P0;[BLcom/google/android/gms/internal/mlkit_vision_barcode_bundled/A0;)Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/P0;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lm6/a;

    .line 8
    .line 9
    return-object p0
.end method


# virtual methods
.method protected final E(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    add-int/lit8 p1, p1, -0x1

    .line 2
    .line 3
    if-eqz p1, :cond_5

    .line 4
    .line 5
    const/4 p3, 0x2

    .line 6
    if-eq p1, p3, :cond_4

    .line 7
    .line 8
    const/4 p3, 0x3

    .line 9
    if-eq p1, p3, :cond_3

    .line 10
    .line 11
    const/4 p3, 0x4

    .line 12
    const/4 v0, 0x0

    .line 13
    if-eq p1, p3, :cond_2

    .line 14
    .line 15
    const/4 p3, 0x5

    .line 16
    if-eq p1, p3, :cond_1

    .line 17
    .line 18
    if-nez p2, :cond_0

    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 p1, 0x1

    .line 23
    :goto_0
    iput-byte p1, p0, Lm6/a;->zzi:B

    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_1
    sget-object p1, Lm6/a;->zzb:Lm6/a;

    .line 27
    .line 28
    return-object p1

    .line 29
    :cond_2
    new-instance p1, Lm6/x;

    .line 30
    .line 31
    invoke-direct {p1, v0}, Lm6/x;-><init>(Lm6/b;)V

    .line 32
    .line 33
    .line 34
    return-object p1

    .line 35
    :cond_3
    new-instance p1, Lm6/a;

    .line 36
    .line 37
    invoke-direct {p1}, Lm6/a;-><init>()V

    .line 38
    .line 39
    .line 40
    return-object p1

    .line 41
    :cond_4
    sget-object v4, Lm6/k;->a:Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/T0;

    .line 42
    .line 43
    const-string v5, "zzg"

    .line 44
    .line 45
    const-string v6, "zzh"

    .line 46
    .line 47
    const-string v0, "zzd"

    .line 48
    .line 49
    const-string v1, "zze"

    .line 50
    .line 51
    const-class v2, Lm6/s;

    .line 52
    .line 53
    const-string v3, "zzf"

    .line 54
    .line 55
    filled-new-array/range {v0 .. v6}, [Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    sget-object p2, Lm6/a;->zzb:Lm6/a;

    .line 60
    .line 61
    const-string p3, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0002\u0001\u041b\u0002\u1d0c\u0000\u0003\u1008\u0001\u0004\u100a\u0002"

    .line 62
    .line 63
    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/P0;->v(Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/r1;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    return-object p1

    .line 68
    :cond_5
    iget-byte p1, p0, Lm6/a;->zzi:B

    .line 69
    .line 70
    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    return-object p1
.end method

.method public final H()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lm6/a;->zze:Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/W0;

    .line 2
    .line 3
    return-object v0
.end method
