.class public final synthetic Lj6/c;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lo4/g;


# static fields
.field public static final synthetic g:Lj6/c;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lj6/c;

    .line 2
    .line 3
    invoke-direct {v0}, Lj6/c;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lj6/c;->g:Lj6/c;

    .line 7
    .line 8
    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final d()[Lcom/google/android/gms/common/Feature;
    .locals 1

    .line 1
    sget-object v0, Lj6/e;->k:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    sget-object v0, Lc6/l;->b:Lcom/google/android/gms/common/Feature;

    .line 4
    .line 5
    filled-new-array {v0}, [Lcom/google/android/gms/common/Feature;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method
