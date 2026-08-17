.class public final LC8/y;
.super LC8/A;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LC8/w;
.implements LG8/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LC8/y$a;
    }
.end annotation


# static fields
.field public static final j:LC8/y$a;


# instance fields
.field private final h:LC8/d0;

.field private final i:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LC8/y$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LC8/y$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LC8/y;->j:LC8/y$a;

    .line 8
    .line 9
    return-void
.end method

.method private constructor <init>(LC8/d0;Z)V
    .locals 0

    .line 2
    invoke-direct {p0}, LC8/A;-><init>()V

    .line 3
    iput-object p1, p0, LC8/y;->h:LC8/d0;

    .line 4
    iput-boolean p2, p0, LC8/y;->i:Z

    return-void
.end method

.method public synthetic constructor <init>(LC8/d0;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LC8/y;-><init>(LC8/d0;Z)V

    return-void
.end method


# virtual methods
.method public L(LC8/S;)LC8/S;
    .locals 1

    .line 1
    const-string v0, "replacement"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, LC8/S;->N0()LC8/M0;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iget-boolean v0, p0, LC8/y;->i:Z

    .line 11
    .line 12
    invoke-static {p1, v0}, LC8/h0;->e(LC8/M0;Z)LC8/M0;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method

.method public L0()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public bridge synthetic O0(Z)LC8/M0;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LC8/y;->R0(Z)LC8/d0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic Q0(LC8/r0;)LC8/M0;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LC8/y;->S0(LC8/r0;)LC8/d0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public R0(Z)LC8/d0;
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, LC8/y;->T0()LC8/d0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p1}, LC8/d0;->R0(Z)LC8/d0;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1

    .line 12
    :cond_0
    return-object p0
.end method

.method public S0(LC8/r0;)LC8/d0;
    .locals 2

    .line 1
    const-string v0, "newAttributes"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, LC8/y;

    .line 7
    .line 8
    invoke-virtual {p0}, LC8/y;->T0()LC8/d0;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1, p1}, LC8/d0;->S0(LC8/r0;)LC8/d0;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iget-boolean v1, p0, LC8/y;->i:Z

    .line 17
    .line 18
    invoke-direct {v0, p1, v1}, LC8/y;-><init>(LC8/d0;Z)V

    .line 19
    .line 20
    .line 21
    return-object v0
.end method

.method protected T0()LC8/d0;
    .locals 1

    .line 1
    iget-object v0, p0, LC8/y;->h:LC8/d0;

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic V0(LC8/d0;)LC8/A;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LC8/y;->X0(LC8/d0;)LC8/y;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final W0()LC8/d0;
    .locals 1

    .line 1
    iget-object v0, p0, LC8/y;->h:LC8/d0;

    .line 2
    .line 3
    return-object v0
.end method

.method public X0(LC8/d0;)LC8/y;
    .locals 2

    .line 1
    const-string v0, "delegate"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, LC8/y;

    .line 7
    .line 8
    iget-boolean v1, p0, LC8/y;->i:Z

    .line 9
    .line 10
    invoke-direct {v0, p1, v1}, LC8/y;-><init>(LC8/d0;Z)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, LC8/y;->T0()LC8/d0;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, " & Any"

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    return-object v0
.end method

.method public x0()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, LC8/y;->T0()LC8/d0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LC8/S;->K0()LC8/v0;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, LC8/y;->T0()LC8/d0;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, LC8/S;->K0()LC8/v0;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-interface {v0}, LC8/v0;->p()LL7/h;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    instance-of v0, v0, LL7/m0;

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    return v0

    .line 26
    :cond_0
    const/4 v0, 0x0

    .line 27
    return v0
.end method
