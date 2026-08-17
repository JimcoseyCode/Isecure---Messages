.class LF/W$a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ly/r0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF/W;-><init>(J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:J

.field final synthetic e:LF/W;


# direct methods
.method constructor <init>(LF/W;J)V
    .locals 0

    .line 1
    iput-object p1, p0, LF/W$a;->e:LF/W;

    .line 2
    .line 3
    iput-wide p2, p0, LF/W$a;->d:J

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(Ly/r0$b;)Ly/r0$c;
    .locals 1

    .line 1
    invoke-interface {p1}, Ly/r0$b;->b()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 v0, 0x1

    .line 6
    if-ne p1, v0, :cond_0

    .line 7
    .line 8
    sget-object p1, Ly/r0$c;->d:Ly/r0$c;

    .line 9
    .line 10
    return-object p1

    .line 11
    :cond_0
    sget-object p1, Ly/r0$c;->e:Ly/r0$c;

    .line 12
    .line 13
    return-object p1
.end method

.method public c()J
    .locals 2

    .line 1
    iget-wide v0, p0, LF/W$a;->d:J

    .line 2
    .line 3
    return-wide v0
.end method
