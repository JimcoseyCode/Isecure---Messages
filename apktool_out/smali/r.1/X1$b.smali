.class Lr/X1$b;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LF/D1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr/X1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# instance fields
.field private final P:LF/j0;


# direct methods
.method constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, LF/S0;->i0()LF/S0;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    sget-object v1, LF/D1;->y:LF/j0$a;

    .line 9
    .line 10
    new-instance v2, Lr/R0;

    .line 11
    .line 12
    invoke-direct {v2}, Lr/R0;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1, v2}, LF/S0;->X(LF/j0$a;Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    sget-object v1, LF/D0;->j:LF/j0$a;

    .line 19
    .line 20
    const/16 v2, 0x22

    .line 21
    .line 22
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v0, v1, v2}, LF/S0;->X(LF/j0$a;Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    invoke-direct {p0, v0}, Lr/X1$b;->f0(LF/S0;)V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Lr/X1$b;->P:LF/j0;

    .line 33
    .line 34
    return-void
.end method

.method private f0(LF/S0;)V
    .locals 2

    .line 1
    sget-object v0, LK/q;->N:LF/j0$a;

    .line 2
    .line 3
    const-class v1, Lr/X1;

    .line 4
    .line 5
    invoke-virtual {p1, v0, v1}, LF/S0;->X(LF/j0$a;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    new-instance v0, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v1, "-"

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    sget-object v1, LK/q;->M:LF/j0$a;

    .line 37
    .line 38
    invoke-virtual {p1, v1, v0}, LF/S0;->X(LF/j0$a;Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    return-void
.end method


# virtual methods
.method public G()LF/E1$b;
    .locals 1

    .line 1
    sget-object v0, LF/E1$b;->l:LF/E1$b;

    .line 2
    .line 3
    return-object v0
.end method

.method public o()LF/j0;
    .locals 1

    .line 1
    iget-object v0, p0, Lr/X1$b;->P:LF/j0;

    .line 2
    .line 3
    return-object v0
.end method
