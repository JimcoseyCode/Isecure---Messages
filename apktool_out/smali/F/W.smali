.class public final LF/W;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LF/j1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LF/W$b;
    }
.end annotation


# instance fields
.field private final d:Ly/r0;


# direct methods
.method public constructor <init>(J)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LF/w1;

    .line 5
    .line 6
    new-instance v1, LF/W$a;

    .line 7
    .line 8
    invoke-direct {v1, p0, p1, p2}, LF/W$a;-><init>(LF/W;J)V

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, p1, p2, v1}, LF/w1;-><init>(JLy/r0;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, LF/W;->d:Ly/r0;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public a(Ly/r0$b;)Ly/r0$c;
    .locals 1

    .line 1
    iget-object v0, p0, LF/W;->d:Ly/r0;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ly/r0;->a(Ly/r0$b;)Ly/r0$c;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public c()J
    .locals 2

    .line 1
    iget-object v0, p0, LF/W;->d:Ly/r0;

    .line 2
    .line 3
    invoke-interface {v0}, Ly/r0;->c()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public d(J)Ly/r0;
    .locals 1

    .line 1
    new-instance v0, LF/W;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, LF/W;-><init>(J)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
