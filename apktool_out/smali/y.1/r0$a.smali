.class public final Ly/r0$a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly/r0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Ly/r0;

.field private b:J


# direct methods
.method public constructor <init>(Ly/r0;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ly/r0$a;->a:Ly/r0;

    .line 5
    .line 6
    invoke-interface {p1}, Ly/r0;->c()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    iput-wide v0, p0, Ly/r0$a;->b:J

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public a()Ly/r0;
    .locals 4

    .line 1
    iget-object v0, p0, Ly/r0$a;->a:Ly/r0;

    .line 2
    .line 3
    instance-of v1, v0, LF/j1;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, LF/j1;

    .line 8
    .line 9
    iget-wide v1, p0, Ly/r0$a;->b:J

    .line 10
    .line 11
    invoke-interface {v0, v1, v2}, LF/j1;->d(J)Ly/r0;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0

    .line 16
    :cond_0
    new-instance v0, LF/w1;

    .line 17
    .line 18
    iget-wide v1, p0, Ly/r0$a;->b:J

    .line 19
    .line 20
    iget-object v3, p0, Ly/r0$a;->a:Ly/r0;

    .line 21
    .line 22
    invoke-direct {v0, v1, v2, v3}, LF/w1;-><init>(JLy/r0;)V

    .line 23
    .line 24
    .line 25
    return-object v0
.end method
