.class public final Lt9/v;
.super Lj7/d;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ljava/util/RandomAccess;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lt9/v$a;
    }
.end annotation


# static fields
.field public static final j:Lt9/v$a;


# instance fields
.field private final h:[Lt9/k;

.field private final i:[I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lt9/v$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lt9/v$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lt9/v;->j:Lt9/v$a;

    .line 8
    .line 9
    return-void
.end method

.method private constructor <init>([Lt9/k;[I)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lj7/d;-><init>()V

    .line 3
    iput-object p1, p0, Lt9/v;->h:[Lt9/k;

    .line 4
    iput-object p2, p0, Lt9/v;->i:[I

    return-void
.end method

.method public synthetic constructor <init>([Lt9/k;[ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lt9/v;-><init>([Lt9/k;[I)V

    return-void
.end method


# virtual methods
.method public final bridge contains(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lt9/k;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    return p1

    .line 7
    :cond_0
    check-cast p1, Lt9/k;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lt9/v;->q(Lt9/k;)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    return p1
.end method

.method public bridge synthetic get(I)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lt9/v;->r(I)Lt9/k;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final bridge indexOf(Ljava/lang/Object;)I
    .locals 1

    .line 1
    instance-of v0, p1, Lt9/k;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p1, -0x1

    .line 6
    return p1

    .line 7
    :cond_0
    check-cast p1, Lt9/k;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lt9/v;->u(Lt9/k;)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    return p1
.end method

.method public final bridge lastIndexOf(Ljava/lang/Object;)I
    .locals 1

    .line 1
    instance-of v0, p1, Lt9/k;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p1, -0x1

    .line 6
    return p1

    .line 7
    :cond_0
    check-cast p1, Lt9/k;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lt9/v;->v(Lt9/k;)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    return p1
.end method

.method public o()I
    .locals 1

    .line 1
    iget-object v0, p0, Lt9/v;->h:[Lt9/k;

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    return v0
.end method

.method public bridge q(Lt9/k;)Z
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lj7/b;->contains(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public r(I)Lt9/k;
    .locals 1

    .line 1
    iget-object v0, p0, Lt9/v;->h:[Lt9/k;

    .line 2
    .line 3
    aget-object p1, v0, p1

    .line 4
    .line 5
    return-object p1
.end method

.method public final s()[Lt9/k;
    .locals 1

    .line 1
    iget-object v0, p0, Lt9/v;->h:[Lt9/k;

    .line 2
    .line 3
    return-object v0
.end method

.method public final t()[I
    .locals 1

    .line 1
    iget-object v0, p0, Lt9/v;->i:[I

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge u(Lt9/k;)I
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lj7/d;->indexOf(Ljava/lang/Object;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public bridge v(Lt9/k;)I
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lj7/d;->lastIndexOf(Ljava/lang/Object;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method
